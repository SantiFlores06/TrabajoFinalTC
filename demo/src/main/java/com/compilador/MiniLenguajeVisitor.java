// Generated from com\compilador\MiniLenguaje.g4 by ANTLR 4.9.3
package com.compilador;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MiniLenguajeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MiniLenguajeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MiniLenguajeParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MiniLenguajeParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniLenguajeParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(MiniLenguajeParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniLenguajeParser#funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion(MiniLenguajeParser.FuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniLenguajeParser#listaParametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaParametros(MiniLenguajeParser.ListaParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniLenguajeParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(MiniLenguajeParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniLenguajeParser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(MiniLenguajeParser.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniLenguajeParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(MiniLenguajeParser.SentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniLenguajeParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(MiniLenguajeParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniLenguajeParser#ifElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElse(MiniLenguajeParser.IfElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniLenguajeParser#whileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(MiniLenguajeParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniLenguajeParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(MiniLenguajeParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniLenguajeParser#returnStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(MiniLenguajeParser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniLenguajeParser#funcionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncionCall(MiniLenguajeParser.FuncionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniLenguajeParser#argumentos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentos(MiniLenguajeParser.ArgumentosContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expParentesis}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpParentesis(MiniLenguajeParser.ExpParentesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expBinaria}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpBinaria(MiniLenguajeParser.ExpBinariaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expLiteral}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpLiteral(MiniLenguajeParser.ExpLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expFuncion}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpFuncion(MiniLenguajeParser.ExpFuncionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expVariable}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpVariable(MiniLenguajeParser.ExpVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniLenguajeParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(MiniLenguajeParser.LiteralContext ctx);
}