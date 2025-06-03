grammar MiniLenguaje;

program
    : (declaracion | funcion | sentencia)* EOF
    ;

// Declaración de variables al estilo C: int a = 5;
declaracion
    : tipo ID ('=' expresion)? ';'
    ;

// Definición de función estilo C: int suma(a, b) { ... }
funcion
    : tipo ID '(' listaParametros? ')' bloque
    ;

// Parámetros sin tipo: a, b
listaParametros
    : ID (',' ID)*
    ;

// Tipos válidos
tipo
    : 'int'
    | 'float'
    | 'char'
    | 'string'
    | 'bool'
    | 'void'
    ;

// Bloque de sentencias
bloque
    : '{' sentencia* '}'
    ;

// Sentencias posibles
sentencia
    : declaracion
    | asignacion
    | ifElse
    | whileLoop
    | print
    | returnStmt
    | funcionCall ';'
    ;

// Asignación: id = expr ;
asignacion
    : ID '=' expresion ';'
    ;

// If-Else
ifElse
    : 'if' '(' expresion ')' bloque ('else' bloque)?
    ;

// While
whileLoop
    : 'while' '(' expresion ')' bloque
    ;

// Print
print
    : 'print' expresion ';'
    ;

// Return con o sin expresión
returnStmt
    : 'return' expresion? ';'
    ;

// Llamada a función
funcionCall
    : ID '(' argumentos? ')'
    ;

// Argumentos de llamada
argumentos
    : expresion (',' expresion)*
    ;

// Expresiones
expresion
    : expresion op=OPERATOR expresion   #expBinaria
    | '(' expresion ')'                 #expParentesis
    | funcionCall                       #expFuncion
    | ID                                #expVariable
    | literal                           #expLiteral
    ;

// Literales
literal
    : INTEGER
    | DECIMAL
    | STRING
    | CHARACTER
    | BOOLEAN
    ;

// Tokens

BOOLEAN: 'true' | 'false';
IF: 'if';
ELSE: 'else';
PRINT: 'print';
WHILE: 'while';
RETURN: 'return';

// Operadores
OPERATOR
    : '==' | '!=' | '<=' | '>='
    | '+' | '-' | '*' | '/' | '%'
    | '<' | '>' | '='
    | '&&' | '||' | '!'
    ;

// Identificadores
ID: [a-zA-Z_][a-zA-Z0-9_]*;

// Números
INTEGER: [0-9]+;
DECIMAL: [0-9]+ '.' [0-9]+;

// Caracteres y cadenas
CHARACTER: '\'' (~['\\\r\n] | '\\' .) '\'';
STRING: '"' (~["\\\r\n] | '\\' .)* '"';

// Comentarios y espacios
COMMENT: '//' ~[\r\n]* -> skip;
BLOCK_COMMENT: '/*' .*? '*/' -> skip;
WS: [ \t\r\n]+ -> skip;