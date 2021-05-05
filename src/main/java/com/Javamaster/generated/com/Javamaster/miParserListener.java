// Generated from C:/Users/Admin/Desktop/Proyecto Compi/Compiladores/src/main/java/com/Javamaster\miParser.g4 by ANTLR 4.9.1
package com.Javamaster;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link miParser}.
 */
public interface miParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link miParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(miParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link miParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(miParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link miParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(miParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link miParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(miParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link miParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(miParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link miParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(miParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link miParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDecl(miParser.FunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link miParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDecl(miParser.FunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link miParser#formalParams}.
	 * @param ctx the parse tree
	 */
	void enterFormalParams(miParser.FormalParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link miParser#formalParams}.
	 * @param ctx the parse tree
	 */
	void exitFormalParams(miParser.FormalParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link miParser#formalParam}.
	 * @param ctx the parse tree
	 */
	void enterFormalParam(miParser.FormalParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link miParser#formalParam}.
	 * @param ctx the parse tree
	 */
	void exitFormalParam(miParser.FormalParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link miParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(miParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link miParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(miParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link miParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(miParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link miParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(miParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link miParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(miParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link miParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(miParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link miParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(miParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link miParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(miParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link miParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void enterClassDecl(miParser.ClassDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link miParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void exitClassDecl(miParser.ClassDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link miParser#classVariableDecl}.
	 * @param ctx the parse tree
	 */
	void enterClassVariableDecl(miParser.ClassVariableDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link miParser#classVariableDecl}.
	 * @param ctx the parse tree
	 */
	void exitClassVariableDecl(miParser.ClassVariableDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link miParser#variableDecl}.
	 * @param ctx the parse tree
	 */
	void enterVariableDecl(miParser.VariableDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link miParser#variableDecl}.
	 * @param ctx the parse tree
	 */
	void exitVariableDecl(miParser.VariableDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link miParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(miParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link miParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(miParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link miParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void enterSimpleType(miParser.SimpleTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link miParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void exitSimpleType(miParser.SimpleTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link miParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(miParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link miParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(miParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link miParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(miParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link miParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(miParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link miParser#arrayAssignment}.
	 * @param ctx the parse tree
	 */
	void enterArrayAssignment(miParser.ArrayAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link miParser#arrayAssignment}.
	 * @param ctx the parse tree
	 */
	void exitArrayAssignment(miParser.ArrayAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link miParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(miParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link miParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(miParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link miParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpression(miParser.SimpleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link miParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpression(miParser.SimpleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link miParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(miParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link miParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(miParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link miParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(miParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link miParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(miParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link miParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterUnary(miParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link miParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitUnary(miParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link miParser#allocationExpression}.
	 * @param ctx the parse tree
	 */
	void enterAllocationExpression(miParser.AllocationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link miParser#allocationExpression}.
	 * @param ctx the parse tree
	 */
	void exitAllocationExpression(miParser.AllocationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link miParser#arrayAllocationExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayAllocationExpression(miParser.ArrayAllocationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link miParser#arrayAllocationExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayAllocationExpression(miParser.ArrayAllocationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link miParser#subExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubExpression(miParser.SubExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link miParser#subExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubExpression(miParser.SubExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link miParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(miParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link miParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(miParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link miParser#actualParms}.
	 * @param ctx the parse tree
	 */
	void enterActualParms(miParser.ActualParmsContext ctx);
	/**
	 * Exit a parse tree produced by {@link miParser#actualParms}.
	 * @param ctx the parse tree
	 */
	void exitActualParms(miParser.ActualParmsContext ctx);
	/**
	 * Enter a parse tree produced by {@link miParser#arrayLookup}.
	 * @param ctx the parse tree
	 */
	void enterArrayLookup(miParser.ArrayLookupContext ctx);
	/**
	 * Exit a parse tree produced by {@link miParser#arrayLookup}.
	 * @param ctx the parse tree
	 */
	void exitArrayLookup(miParser.ArrayLookupContext ctx);
	/**
	 * Enter a parse tree produced by {@link miParser#arrayLength}.
	 * @param ctx the parse tree
	 */
	void enterArrayLength(miParser.ArrayLengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link miParser#arrayLength}.
	 * @param ctx the parse tree
	 */
	void exitArrayLength(miParser.ArrayLengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link miParser#relationalOp}.
	 * @param ctx the parse tree
	 */
	void enterRelationalOp(miParser.RelationalOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link miParser#relationalOp}.
	 * @param ctx the parse tree
	 */
	void exitRelationalOp(miParser.RelationalOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link miParser#additiveOp}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveOp(miParser.AdditiveOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link miParser#additiveOp}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveOp(miParser.AdditiveOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link miParser#multiplicativeOp}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeOp(miParser.MultiplicativeOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link miParser#multiplicativeOp}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeOp(miParser.MultiplicativeOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link miParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(miParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link miParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(miParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link miParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(miParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link miParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(miParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link miParser#intLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntLiteral(miParser.IntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link miParser#intLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntLiteral(miParser.IntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link miParser#realLiteral}.
	 * @param ctx the parse tree
	 */
	void enterRealLiteral(miParser.RealLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link miParser#realLiteral}.
	 * @param ctx the parse tree
	 */
	void exitRealLiteral(miParser.RealLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link miParser#boolLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBoolLiteral(miParser.BoolLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link miParser#boolLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBoolLiteral(miParser.BoolLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link miParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(miParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link miParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(miParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link miParser#printable}.
	 * @param ctx the parse tree
	 */
	void enterPrintable(miParser.PrintableContext ctx);
	/**
	 * Exit a parse tree produced by {@link miParser#printable}.
	 * @param ctx the parse tree
	 */
	void exitPrintable(miParser.PrintableContext ctx);
}