// Generated from com\compilador\MiniLenguaje.g4 by ANTLR 4.9.3
package com.compilador;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniLenguajeParser}.
 */
public interface MiniLenguajeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiniLenguajeParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MiniLenguajeParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLenguajeParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MiniLenguajeParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLenguajeParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(MiniLenguajeParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLenguajeParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(MiniLenguajeParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLenguajeParser#funcion}.
	 * @param ctx the parse tree
	 */
	void enterFuncion(MiniLenguajeParser.FuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLenguajeParser#funcion}.
	 * @param ctx the parse tree
	 */
	void exitFuncion(MiniLenguajeParser.FuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLenguajeParser#listaParametros}.
	 * @param ctx the parse tree
	 */
	void enterListaParametros(MiniLenguajeParser.ListaParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLenguajeParser#listaParametros}.
	 * @param ctx the parse tree
	 */
	void exitListaParametros(MiniLenguajeParser.ListaParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLenguajeParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(MiniLenguajeParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLenguajeParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(MiniLenguajeParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLenguajeParser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(MiniLenguajeParser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLenguajeParser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(MiniLenguajeParser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLenguajeParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(MiniLenguajeParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLenguajeParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(MiniLenguajeParser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLenguajeParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(MiniLenguajeParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLenguajeParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(MiniLenguajeParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLenguajeParser#ifElse}.
	 * @param ctx the parse tree
	 */
	void enterIfElse(MiniLenguajeParser.IfElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLenguajeParser#ifElse}.
	 * @param ctx the parse tree
	 */
	void exitIfElse(MiniLenguajeParser.IfElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLenguajeParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(MiniLenguajeParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLenguajeParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(MiniLenguajeParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLenguajeParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(MiniLenguajeParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLenguajeParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(MiniLenguajeParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLenguajeParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(MiniLenguajeParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLenguajeParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(MiniLenguajeParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLenguajeParser#funcionCall}.
	 * @param ctx the parse tree
	 */
	void enterFuncionCall(MiniLenguajeParser.FuncionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLenguajeParser#funcionCall}.
	 * @param ctx the parse tree
	 */
	void exitFuncionCall(MiniLenguajeParser.FuncionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLenguajeParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void enterArgumentos(MiniLenguajeParser.ArgumentosContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLenguajeParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void exitArgumentos(MiniLenguajeParser.ArgumentosContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expParentesis}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpParentesis(MiniLenguajeParser.ExpParentesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expParentesis}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpParentesis(MiniLenguajeParser.ExpParentesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expBinaria}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpBinaria(MiniLenguajeParser.ExpBinariaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expBinaria}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpBinaria(MiniLenguajeParser.ExpBinariaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expLiteral}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpLiteral(MiniLenguajeParser.ExpLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expLiteral}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpLiteral(MiniLenguajeParser.ExpLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expFuncion}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpFuncion(MiniLenguajeParser.ExpFuncionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expFuncion}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpFuncion(MiniLenguajeParser.ExpFuncionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expVariable}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpVariable(MiniLenguajeParser.ExpVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expVariable}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpVariable(MiniLenguajeParser.ExpVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLenguajeParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(MiniLenguajeParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLenguajeParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(MiniLenguajeParser.LiteralContext ctx);
}