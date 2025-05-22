
grammar MiniLenguaje;

program : token* EOF ;

token 
    : ID 
    | INTEGER 
    | DECIMAL 
    | STRING 
    | CHARACTER 
    | BOOLEAN 
    | KEYWORD 
    | OPERATOR 
    | SEPARATOR 
    ;

BOOLEAN     : 'true' | 'false' ;

KEYWORD     : 'var' | 'if' | 'else' | 'print' | 'while' | 'function' | 'return' ;

OPERATOR    : '+' | '-' | '*' | '/' | '%' | '=' 
            | '==' | '!=' | '<' | '>' | '<=' | '>=' 
            | '&&' | '||' | '!' ;

SEPARATOR   : ';' | '(' | ')' | '{' | '}' | ',' | '.' ;

ID          : [a-zA-Z_][a-zA-Z0-9_]* ;

INTEGER     : [0-9]+ ;
DECIMAL     : [0-9]+ '.' [0-9]+ ;

CHARACTER   : '\'' (~['\r\n\\] | '\\' .) '\'' ;

STRING      : '"' (~["\\\r\n] | '\\' .)* '"' ;

COMMENT         : '//' ~[\r\n]* -> skip ;
BLOCK_COMMENT   : '/*' .*? '*/' -> skip ;
WS              : [ \t\r\n]+ -> skip ;