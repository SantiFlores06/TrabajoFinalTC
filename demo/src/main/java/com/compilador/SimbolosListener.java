package com.compilador;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * Listener mejorado para construir la tabla de símbolos y realizar verificación de tipos
 */
public class SimbolosListener extends MiniLenguajeBaseListener {
    private final TablaSimbolos tablaSimbolos;
    private final List<String> errores;
    private String tipoRetornoActual; // Para verificar return

    public SimbolosListener() {
        this.tablaSimbolos = new TablaSimbolos();
        this.errores = new ArrayList<>();
        this.tipoRetornoActual = null;
    }

    public TablaSimbolos getTablaSimbolos() { return tablaSimbolos; }
    public List<String> getErrores() { return errores; }

    // Cuando se encuentra una declaración de función
    @Override
    public void enterFuncion(MiniLenguajeParser.FuncionContext ctx) {
        String nombre = ctx.ID().getText();
        String tipo = ctx.tipo().getText();
        int linea = ctx.ID().getSymbol().getLine();
        int columna = ctx.ID().getSymbol().getCharPositionInLine();
        TablaSimbolos.Simbolo simbolo = new TablaSimbolos.Simbolo(
            nombre, tipo, "funcion", linea, columna, "global"
        );
        // Agregar parámetros si existen
        if (ctx.listaParametros() != null) {
            MiniLenguajeParser.ListaParametrosContext params = ctx.listaParametros();
            List<TerminalNode> paramIds = params.ID();
            for (TerminalNode paramId : paramIds) {
                String nombreParam = paramId.getText();
                simbolo.addParametro("desconocido");
                TablaSimbolos.Simbolo paramSimbolo = new TablaSimbolos.Simbolo(
                    nombreParam, "desconocido", "parametro",
                    paramId.getSymbol().getLine(), paramId.getSymbol().getCharPositionInLine(), nombre
                );
                if (!tablaSimbolos.agregar(paramSimbolo)) {
                    errores.add("Error semántico en línea " + paramId.getSymbol().getLine() +
                              ": Parámetro duplicado '" + nombreParam + "'");
                }
            }
        }
        if (!tablaSimbolos.agregar(simbolo)) {
            errores.add("Error semántico en línea " + linea +
                      ": Función '" + nombre + "' ya declarada");
        }
        tablaSimbolos.setAmbito(nombre);
        tipoRetornoActual = tipo;
    }

    @Override
    public void exitFuncion(MiniLenguajeParser.FuncionContext ctx) {
        tablaSimbolos.setAmbito("global");
        tipoRetornoActual = null;
    }

    @Override
    public void enterDeclaracion(MiniLenguajeParser.DeclaracionContext ctx) {
        String nombre = ctx.ID().getText();
        String tipo = ctx.tipo().getText();
        int linea = ctx.ID().getSymbol().getLine();
        int columna = ctx.ID().getSymbol().getCharPositionInLine();
        TablaSimbolos.Simbolo simbolo = new TablaSimbolos.Simbolo(
            nombre, tipo, "variable", linea, columna, tablaSimbolos.getAmbito()
        );
        if (!tablaSimbolos.agregar(simbolo)) {
            errores.add("Error semántico en línea " + linea +
                      ": Variable '" + nombre + "' ya declarada en este ámbito");
        }
    }

    @Override
    public void enterAsignacion(MiniLenguajeParser.AsignacionContext ctx) {
        String nombre = ctx.ID().getText();
        int linea = ctx.ID().getSymbol().getLine();
        TablaSimbolos.Simbolo simbolo = tablaSimbolos.buscar(nombre);
        if (simbolo == null) {
            errores.add("Error semántico en línea " + linea +
                      ": Variable '" + nombre + "' no declarada");
            return;
        }
        if (!simbolo.getCategoria().equals("variable") && !simbolo.getCategoria().equals("parametro")) {
            errores.add("Error semántico en línea " + linea +
                      ": No se puede asignar valor a '" + nombre + "' porque no es una variable");
            return;
        }
    }

    @Override
    public void enterExpVariable(MiniLenguajeParser.ExpVariableContext ctx) {
        String nombre = ctx.ID().getText();
        int linea = ctx.ID().getSymbol().getLine();
        TablaSimbolos.Simbolo simbolo = tablaSimbolos.buscar(nombre);
        if (simbolo == null) {
            errores.add("Error semántico en línea " + linea +
                      ": Identificador '" + nombre + "' no declarado");
        }
    }

    @Override
    public void enterExpFuncion(MiniLenguajeParser.ExpFuncionContext ctx) {
        MiniLenguajeParser.FuncionCallContext callCtx = ctx.funcionCall();
        String nombre = callCtx.ID().getText();
        int linea = callCtx.ID().getSymbol().getLine();
        TablaSimbolos.Simbolo simbolo = tablaSimbolos.buscar(nombre);
        if (simbolo == null) {
            errores.add("Error semántico en línea " + linea +
                      ": Función '" + nombre + "' no declarada");
            return;
        }
        if (!simbolo.getCategoria().equals("funcion")) {
            errores.add("Error semántico en línea " + linea +
                      ": '" + nombre + "' no es una función");
            return;
        }
        int numArgumentosEsperados = simbolo.getParametros().size();
        int numArgumentosRecibidos = 0;
        if (callCtx.argumentos() != null) {
            numArgumentosRecibidos = callCtx.argumentos().expresion().size();
        }
        if (numArgumentosEsperados != numArgumentosRecibidos) {
            errores.add("Error semántico en línea " + linea +
                      ": Función '" + nombre + "' espera " + numArgumentosEsperados +
                      " argumentos, pero recibió " + numArgumentosRecibidos);
        }
    }

    @Override
    public void enterReturnStmt(MiniLenguajeParser.ReturnStmtContext ctx) {
        if (tipoRetornoActual == null) {
            errores.add("Error semántico en línea " + ctx.getStart().getLine() +
                      ": Sentencia return fuera de una función");
            return;
        }
        if (tipoRetornoActual.equals("void")) {
            if (ctx.expresion() != null) {
                errores.add("Error semántico en línea " + ctx.getStart().getLine() +
                          ": Función void no debe retornar un valor");
            }
        } else {
            if (ctx.expresion() == null) {
                errores.add("Error semántico en línea " + ctx.getStart().getLine() +
                          ": Función con tipo de retorno '" + tipoRetornoActual +
                          "' debe retornar un valor");
            }
        }
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        errores.add("Error sintáctico en token: " + node.getText());
    }

    // Implementación básica para determinar el tipo de una expresión
    private String getTipoExpresion(MiniLenguajeParser.ExpresionContext ctx) {
        if (ctx instanceof MiniLenguajeParser.ExpVariableContext expVar) {
            TablaSimbolos.Simbolo simbolo = tablaSimbolos.buscar(expVar.ID().getText());
            return simbolo != null ? simbolo.getTipo() : "desconocido";
        } else if (ctx instanceof MiniLenguajeParser.ExpLiteralContext expLit) {
            MiniLenguajeParser.LiteralContext lit = expLit.literal();
            if (lit.INTEGER() != null) return "int";
            if (lit.DECIMAL() != null) return "double";
            if (lit.CHARACTER() != null) return "char";
            if (lit.STRING() != null) return "string";
            if (lit.BOOLEAN() != null) return "bool";
            return "desconocido";
        } else if (ctx instanceof MiniLenguajeParser.ExpFuncionContext expFunc) {
            String nombre = expFunc.funcionCall().ID().getText();
            TablaSimbolos.Simbolo simbolo = tablaSimbolos.buscar(nombre);
            return simbolo != null ? simbolo.getTipo() : "desconocido";
        }
        // Para otros tipos de expresiones, necesitarías reglas más complejas
        return "desconocido";
    }
}