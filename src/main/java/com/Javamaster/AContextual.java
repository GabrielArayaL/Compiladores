package com.Javamaster;
import generated.miParser;
import com.Javamaster.generated.miParserBaseVisitor;
import org.antlr.v4.runtime.CommonToken;

public class AContextual extends miParserBaseVisitor {
   private TablaSimbolos tabla;
  public AContextual() {
      tabla = new TablaSimbolos();
      //tabla.insertar(new CommonToken(miParser.ID,"print"),-1,null);
  }

    @Override
    public Object visitProgramAST(miParser.ProgramASTContext ctx) {
        for(miParser.StatementContext c : ctx.statement())
            this.visit(c);
        return null;
    }

    @Override
    public Object visitVariableDeclCAST(miParser.VariableDeclCASTContext ctx) {

        miParser.SimpleTypeCASTContext typToken;
        miParser.IdentifierASTContext idToken = (miParser.IdentifierASTContext) this.visit(ctx.variableDecl());

        return null;
    }

    @Override
    public Object visitClassDeclCAST(miParser.ClassDeclCASTContext ctx) {
        return super.visitClassDeclCAST(ctx);
    }

    @Override
    public Object visitAssignmentCAST(miParser.AssignmentCASTContext ctx) {
        return super.visitAssignmentCAST(ctx);
    }

    @Override
    public Object visitArrayAssignmentCAST(miParser.ArrayAssignmentCASTContext ctx) {
        return super.visitArrayAssignmentCAST(ctx);
    }

    @Override
    public Object visitPrintStatementCAST(miParser.PrintStatementCASTContext ctx) {
        return super.visitPrintStatementCAST(ctx);
    }

    @Override
    public Object visitIfStatementCAST(miParser.IfStatementCASTContext ctx) {
        return super.visitIfStatementCAST(ctx);
    }

    @Override
    public Object visitWhileStatementCAST(miParser.WhileStatementCASTContext ctx) {
        return super.visitWhileStatementCAST(ctx);
    }

    @Override
    public Object visitReturnStatementCAST(miParser.ReturnStatementCASTContext ctx) {
        return super.visitReturnStatementCAST(ctx);
    }

    @Override
    public Object visitFunctionDeclCAST(miParser.FunctionDeclCASTContext ctx) {
        return super.visitFunctionDeclCAST(ctx);
    }

    @Override
    public Object visitBlockCAST(miParser.BlockCASTContext ctx) {
        return super.visitBlockCAST(ctx);
    }

    @Override
    public Object visitBlockAST(miParser.BlockASTContext ctx) {
        return super.visitBlockAST(ctx);
    }

    @Override
    public Object visitFunctionDeclAST(miParser.FunctionDeclASTContext ctx) {
        return super.visitFunctionDeclAST(ctx);
    }

    @Override
    public Object visitFormalParamsAST(miParser.FormalParamsASTContext ctx) {
        return super.visitFormalParamsAST(ctx);
    }

    @Override
    public Object visitFormalParamAST(miParser.FormalParamASTContext ctx) {
        return super.visitFormalParamAST(ctx);
    }

    @Override
    public Object visitWhileAST(miParser.WhileASTContext ctx) {
        return super.visitWhileAST(ctx);
    }

    @Override
    public Object visitIfAST(miParser.IfASTContext ctx) {
        return super.visitIfAST(ctx);
    }

    @Override
    public Object visitReturnStatementAST(miParser.ReturnStatementASTContext ctx) {
        return super.visitReturnStatementAST(ctx);
    }

    @Override
    public Object visitPrintStatementAST(miParser.PrintStatementASTContext ctx) {
        return super.visitPrintStatementAST(ctx);
    }

    @Override
    public Object visitClassDeclAST(miParser.ClassDeclCASTContext ctx) {
        return super.visitClassDeclAST(ctx);
    }

    @Override
    public Object visitClassVariableDeclAST(miParser.ClassVariableDeclASTContext ctx) {
        return super.visitClassVariableDeclAST(ctx);
    }

    @Override
    public Object visitClassVariableDec(miParser.ClassVariableDecContext ctx) {
        return super.visitClassVariableDec(ctx);
    }

    @Override
    public Object visitSimpleTypeCAST(miParser.SimpleTypeCASTContext ctx) {
        return super.visitSimpleTypeCAST(ctx);
    }

    @Override
    public Object visitArrayTypeCAST(miParser.ArrayTypeCASTContext ctx) {
        return super.visitArrayTypeCAST(ctx);
    }

    @Override
    public Object visitIdentifierCAAST(miParser.IdentifierCAASTContext ctx) {
        return super.visitIdentifierCAAST(ctx);
    }

    @Override
    public Object visitBooleanCAST(miParser.BooleanCASTContext ctx) {
        return super.visitBooleanCAST(ctx);
    }

    @Override
    public Object visitChar2CAST(miParser.Char2CASTContext ctx) {
        return super.visitChar2CAST(ctx);
    }

    @Override
    public Object visitInt2CAST(miParser.Int2CASTContext ctx) {
        return super.visitInt2CAST(ctx);
    }

    @Override
    public Object visitString2CAST(miParser.String2CASTContext ctx) {
        return super.visitString2CAST(ctx);
    }

    @Override
    public Object visitArrayTypeAST(miParser.ArrayTypeASTContext ctx) {
        return super.visitArrayTypeAST(ctx);
    }

    @Override
    public Object visitAssignmentAST(miParser.AssignmentASTContext ctx) {
        return super.visitAssignmentAST(ctx);
    }

    @Override
    public Object visitArrayAssignmentAST(miParser.ArrayAssignmentASTContext ctx) {
        return super.visitArrayAssignmentAST(ctx);
    }

    @Override
    public Object visitExpressionAST(miParser.ExpressionASTContext ctx) {
        return super.visitExpressionAST(ctx);
    }

    @Override
    public Object visitSimpleExpressionAST(miParser.SimpleExpressionASTContext ctx) {
        return super.visitSimpleExpressionAST(ctx);
    }

    @Override
    public Object visitTermAST(miParser.TermASTContext ctx) {
        return super.visitTermAST(ctx);
    }

    @Override
    public Object visitLiteralCAST(miParser.LiteralCASTContext ctx) {
        return super.visitLiteralCAST(ctx);
    }

    @Override
    public Object visitIdentifierCAST(miParser.IdentifierCASTContext ctx) {
        return super.visitIdentifierCAST(ctx);
    }

    @Override
    public Object visitFunctionCallCAST(miParser.FunctionCallCASTContext ctx) {
        return super.visitFunctionCallCAST(ctx);
    }

    @Override
    public Object visitArrayLookupCAST(miParser.ArrayLookupCASTContext ctx) {
        return super.visitArrayLookupCAST(ctx);
    }

    @Override
    public Object visitArrayLengthCAST(miParser.ArrayLengthCASTContext ctx) {
        return super.visitArrayLengthCAST(ctx);
    }

    @Override
    public Object visitSubExpressionCAST(miParser.SubExpressionCASTContext ctx) {
        return super.visitSubExpressionCAST(ctx);
    }

    @Override
    public Object visitArrayAllocationExpressionCAST(miParser.ArrayAllocationExpressionCASTContext ctx) {
        return super.visitArrayAllocationExpressionCAST(ctx);
    }

    @Override
    public Object visitAllocationExpressionCAST(miParser.AllocationExpressionCASTContext ctx) {
        return super.visitAllocationExpressionCAST(ctx);
    }

    @Override
    public Object visitUnaryCAST(miParser.UnaryCASTContext ctx) {
        return super.visitUnaryCAST(ctx);
    }

    @Override
    public Object visitUnaryAST(miParser.UnaryASTContext ctx) {
        return super.visitUnaryAST(ctx);
    }

    @Override
    public Object visitAllocationExpressionAST(miParser.AllocationExpressionASTContext ctx) {
        return super.visitAllocationExpressionAST(ctx);
    }

    @Override
    public Object visitArrayAllocationExpressionAST(miParser.ArrayAllocationExpressionASTContext ctx) {
        return super.visitArrayAllocationExpressionAST(ctx);
    }

    @Override
    public Object visitSubExpressionAST(miParser.SubExpressionASTContext ctx) {
        return super.visitSubExpressionAST(ctx);
    }

    @Override
    public Object visitFunctionCallAST(miParser.FunctionCallASTContext ctx) {
        return super.visitFunctionCallAST(ctx);
    }

    @Override
    public Object visitActualParmsAST(miParser.ActualParmsASTContext ctx) {
        return super.visitActualParmsAST(ctx);
    }

    @Override
    public Object visitArrayLookupAST(miParser.ArrayLookupASTContext ctx) {
        return super.visitArrayLookupAST(ctx);
    }

    @Override
    public Object visitArrayLengthAST(miParser.ArrayLengthASTContext ctx) {
        return super.visitArrayLengthAST(ctx);
    }

    @Override
    public Object visitRelationalOpAST(miParser.RelationalOpContext ctx) {
        return super.visitRelationalOpAST(ctx);
    }

    @Override
    public Object visitAdditiveOpAST(miParser.AdditiveOpContext ctx) {
        return super.visitAdditiveOpAST(ctx);
    }

    @Override
    public Object visitMultiplicativeOpAST(miParser.MultiplicativeOpContext ctx) {
        return super.visitMultiplicativeOpAST(ctx);
    }

    @Override
    public Object visitIdentifierAST(miParser.IdentifierASTContext ctx) {
        return super.visitIdentifierAST(ctx);
    }

    @Override
    public Object visitIntLiteralLAST(miParser.IntLiteralLASTContext ctx) {
        return super.visitIntLiteralLAST(ctx);
    }

    @Override
    public Object visitRealLiteralLAST(miParser.RealLiteralLASTContext ctx) {
        return super.visitRealLiteralLAST(ctx);
    }

    @Override
    public Object visitBoolLiteralLAST(miParser.BoolLiteralLASTContext ctx) {
        return super.visitBoolLiteralLAST(ctx);
    }

    @Override
    public Object visitStringLiteralLAST(miParser.StringLiteralLASTContext ctx) {
        return super.visitStringLiteralLAST(ctx);
    }

    @Override
    public Object visitIntLiteralAST(miParser.IntLiteralASTContext ctx) {
        return super.visitIntLiteralAST(ctx);
    }

    @Override
    public Object visitRealLiteral1AST(miParser.RealLiteral1ASTContext ctx) {
        return super.visitRealLiteral1AST(ctx);
    }

    @Override
    public Object visitRealLiteral2AST(miParser.RealLiteral2ASTContext ctx) {
        return super.visitRealLiteral2AST(ctx);
    }

    @Override
    public Object visitBoolLiteralAST(miParser.BoolLiteralContext ctx) {
        return super.visitBoolLiteralAST(ctx);
    }

    @Override
    public Object visitStringLiteralAST(miParser.StringLiteralASTContext ctx) {
        return super.visitStringLiteralAST(ctx);
    }

    @Override
    public Object visitPrintableAST(miParser.PrintableContext ctx) {
        return super.visitPrintableAST(ctx);
    }
}
