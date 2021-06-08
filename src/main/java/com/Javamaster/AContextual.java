package com.Javamaster;
import generated.miParser;
import com.Javamaster.generated.miParserBaseVisitor;
import org.antlr.v4.runtime.CommonToken;

public class AContextual extends miParserBaseVisitor {
   private TablaSimbolos tabla;
  public AContextual() {
      tabla = new TablaSimbolos();
      tabla.insertar(new CommonToken(miParser.RULE_identifier,"print"),-1,null);
  }

    @Override
    public Object visitProgramAST(miParser.ProgramASTContext ctx) {
        for(miParser.StatementContext c : ctx.statement())
            this.visit(c);
        return null;
    }

    @Override
    public Object visitVariableDeclCAST(miParser.VariableDeclCASTContext ctx) {
        this.visit(ctx.variableDecl());
        this.visit(ctx.PYCOMA());
        return null;
    }

    @Override
    public Object visitClassDeclCAST(miParser.ClassDeclCASTContext ctx) {
        this.visit(ctx.classDecl());
        this.visit(ctx.PYCOMA());
        return null;
    }

    @Override
    public Object visitAssignmentCAST(miParser.AssignmentCASTContext ctx) {
        this.visit(ctx.assignment());
        this.visit(ctx.PYCOMA());
        return null;
    }

    @Override
    public Object visitArrayAssignmentCAST(miParser.ArrayAssignmentCASTContext ctx) {
        this.visit(ctx.arrayAssignment());
        this.visit(ctx.PYCOMA());
        return null;
    }

    @Override
    public Object visitPrintStatementCAST(miParser.PrintStatementCASTContext ctx) {
        this.visit(ctx.printStatement());
        this.visit(ctx.PYCOMA());
        return null;
    }

    @Override
    public Object visitIfStatementCAST(miParser.IfStatementCASTContext ctx) {
        this.visit(ctx.ifStatement());
        return null;
    }

    @Override
    public Object visitWhileStatementCAST(miParser.WhileStatementCASTContext ctx) {
        this.visit(ctx.whileStatement());
        return null;
    }

    @Override
    public Object visitReturnStatementCAST(miParser.ReturnStatementCASTContext ctx) {
        this.visit(ctx.returnStatement());
        this.visit(ctx.PYCOMA());
        return null;
    }

    @Override
    public Object visitFunctionDeclCAST(miParser.FunctionDeclCASTContext ctx) {
        this.visit(ctx.functionDecl());
        return null;
    }

    @Override
    public Object visitBlockCAST(miParser.BlockCASTContext ctx) {
        this.visit(ctx.block());
        return null;
    }

    @Override
    public Object visitBlockAST(miParser.BlockASTContext ctx) {
        this.visit(ctx.LLAVEIZQ());
        for(miParser.StatementContext c : ctx.statement())
            this.visit(c);
        this.visit(ctx.LLAVEDER());
        return null;
    }

    @Override
    public Object visitFunctionDeclAST(miParser.FunctionDeclASTContext ctx) {
        miParser.TypeContext typeToken = (miParser.TypeContext) this.visit(ctx.type());
        miParser.IdentifierContext idToken = (miParser.IdentifierContext) this.visit(ctx.identifier());
        miParser.FormalParamContext formalPToken = (miParser.FormalParamContext) this.visit(ctx.formalParams());
        miParser.BlockContext blockToken = (miParser.BlockContext) this.visit(ctx.block());

        TablaSimbolos.Ident type = tabla.buscar(typeToken.getToken(miParser.RULE_simpleType,0).getText());
        TablaSimbolos.Ident id = tabla.buscar(idToken.getToken(miParser.RULE_identifier,0).getText());
        TablaSimbolos.Ident formalP = tabla.buscar(formalPToken.getToken(miParser.RULE_expression,0).getText());
        TablaSimbolos.Ident block = tabla.buscar(blockToken.getToken(miParser.RULE_block,0).getText());

        if(type!=null){
            if(id!=null){
                if(formalP!=null){
                    if(block!=null){
                        this.visit(ctx.type());
                        this.visit(ctx.identifier());
                        this.visit(ctx.PIZQ());
                        this.visit(ctx.formalParams());
                        this.visit(ctx.PDER());
                        this.visit(ctx.block());
                    }
                }
            }

        }
        return null;
    }

    @Override
    public Object visitFormalParamsAST(miParser.FormalParamsASTContext ctx) {
        this.visit(ctx.formalParam(0));
        this.visit(ctx.COMA(0));
        this.visit(ctx.formalParam(1));
        return null;
    }

    @Override
    public Object visitFormalParamAST(miParser.FormalParamASTContext ctx) {
        this.visit(ctx.type());
        this.visit(ctx.identifier());
        return null;
    }

    @Override
    public Object visitWhileAST(miParser.WhileASTContext ctx) {
        this.visit(ctx.WHILE());
        this.visit(ctx.PIZQ());
        this.visit(ctx.expression());
        this.visit(ctx.PDER());
        this.visit(ctx.block());
        return null;
    }

    @Override
    public Object visitIfAST(miParser.IfASTContext ctx) {
        this.visit(ctx.IF());
        this.visit(ctx.PIZQ());
        this.visit(ctx.expression());
        this.visit(ctx.PDER());
        this.visit(ctx.block(0));
        this.visit(ctx.ELSE());
        this.visit(ctx.block(1));
        return null;
    }

    @Override
    public Object visitReturnStatementAST(miParser.ReturnStatementASTContext ctx) {
        this.visit(ctx.RETURN());
        this.visit(ctx.expression());
        return null;
    }

    @Override
    public Object visitPrintStatementAST(miParser.PrintStatementASTContext ctx) {
        this.visit(ctx.PRINT());
        this.visit(ctx.expression());
        return null;
    }

    @Override
    public Object visitClassDeclAST(miParser.ClassDeclASTContext ctx) {
        this.visit(ctx.CLASS());
        this.visit(ctx.identifier());
        this.visit(ctx.LLAVEIZQ());
        this.visit(ctx.classVariableDecl(0));
        this.visit(ctx.LLAVEDER());
        return null;
    }

    @Override
    public Object visitClassVariableDeclAST(miParser.ClassVariableDeclASTContext ctx) {
        this.visit(ctx.simpleType());
        this.visit(ctx.identifier());
        this.visit(ctx.IGUAL());
        this.visit(ctx.expression());
        this.visit(ctx.PYCOMA());
        return null;
    }

    @Override
    public Object visitClassVariableDec(miParser.ClassVariableDecContext ctx) {
        this.visit(ctx.type());
        this.visit(ctx.identifier());
        this.visit(ctx.IGUAL());
        this.visit(ctx.expression());
        return null;
    }

    @Override
    public Object visitSimpleTypeCAST(miParser.SimpleTypeCASTContext ctx) {
        this.visit(ctx.simpleType());
        return null;
    }

    @Override
    public Object visitArrayTypeCAST(miParser.ArrayTypeCASTContext ctx) {
        this.visit(ctx.arrayType());
        return null;
    }

    @Override
    public Object visitIdentifierCAAST(miParser.IdentifierCAASTContext ctx) {
        this.visit(ctx.identifier());
        return null;
    }

    @Override
    public Object visitBooleanCAST(miParser.BooleanCASTContext ctx) {
        this.visit(ctx.BOOLEAN());
        return null;
    }

    @Override
    public Object visitChar2CAST(miParser.Char2CASTContext ctx) {
        this.visit(ctx.CHAR2());
        return null;
    }

    @Override
    public Object visitInt2CAST(miParser.Int2CASTContext ctx) {
        this.visit(ctx.INT2());
        return null;
    }

    @Override
    public Object visitString2CAST(miParser.String2CASTContext ctx) {
        this.visit(ctx.STRING2());
        return null;
    }

    @Override
    public Object visitArrayTypeAST(miParser.ArrayTypeASTContext ctx) {
        this.visit(ctx.simpleType());
        this.visit(ctx.CORIZQ());
        this.visit(ctx.CORDER());
        return null;
    }

    @Override
    public Object visitAssignmentAST(miParser.AssignmentASTContext ctx) {
        this.visit(ctx.identifier(0));
        this.visit(ctx.PUNTO());
        this.visit(ctx.identifier(1));
        this.visit(ctx.IGUAL());
        this.visit(ctx.expression());
        return null;
    }

    @Override
    public Object visitArrayAssignmentAST(miParser.ArrayAssignmentASTContext ctx) {
        this.visit(ctx.identifier());
        this.visit(ctx.CORIZQ());
        this.visit(ctx.expression(0));
        this.visit(ctx.CORDER());
        this.visit(ctx.IGUAL());
        this.visit(ctx.expression(1));
        return null;
    }
    @Override
    public Object visitExpressionAST(miParser.ExpressionASTContext ctx) {
        this.visit(ctx.simpleExpression(0));
        this.visit(ctx.relationalOp(0));
        this.visit(ctx.simpleExpression(1));
        return null;
    }
    @Override
    public Object visitSimpleExpressionAST(miParser.SimpleExpressionASTContext ctx) {
        this.visit(ctx.term(0));
        this.visit(ctx.additiveOp(0));
        this.visit(ctx.term(1));
        return null;
    }

    @Override
    public Object visitTermAST(miParser.TermASTContext ctx) {
        this.visit(ctx.factor(0));
        this.visit(ctx.multiplicativeOp(0));
        this.visit(ctx.factor(1));
        return null;
    }

    @Override
    public Object visitLiteralCAST(miParser.LiteralCASTContext ctx) {
        this.visit(ctx.literal());
        return null;
    }

    @Override
    public Object visitIdentifierCAST(miParser.IdentifierCASTContext ctx) {
        this.visit(ctx.identifier(0));
        this.visit(ctx.PUNTO());
        this.visit(ctx.identifier(1));
        return null;
    }

    @Override
    public Object visitFunctionCallCAST(miParser.FunctionCallCASTContext ctx) {
        this.visit(ctx.functionCall());
        return null;
    }

    @Override
    public Object visitArrayLookupCAST(miParser.ArrayLookupCASTContext ctx) {
        this.visit(ctx.arrayLookup());
        return null;
    }

    @Override
    public Object visitArrayLengthCAST(miParser.ArrayLengthCASTContext ctx) {
        this.visit(ctx.arrayLength());
        return null;
    }

    @Override
    public Object visitSubExpressionCAST(miParser.SubExpressionCASTContext ctx) {
        this.visit(ctx.subExpression());
        return null;
    }

    @Override
    public Object visitArrayAllocationExpressionCAST(miParser.ArrayAllocationExpressionCASTContext ctx) {
        this.visit(ctx.arrayAllocationExpression());
        return null;
    }

    @Override
    public Object visitAllocationExpressionCAST(miParser.AllocationExpressionCASTContext ctx) {
        this.visit(ctx.allocationExpression());
        return null;
    }

    @Override
    public Object visitUnaryCAST(miParser.UnaryCASTContext ctx) {
        this.visit(ctx.unary());
        return null;
    }

    @Override
    public Object visitUnaryAST(miParser.UnaryASTContext ctx) {
        this.visit(ctx.SUM());
        this.visit(ctx.SUB());
        this.visit(ctx.ADMIRACION());
        this.visit(ctx.expression(0));
        return null;
    }

    @Override
    public Object visitAllocationExpressionAST(miParser.AllocationExpressionASTContext ctx) {
        this.visit(ctx.NEW());
        this.visit(ctx.identifier());
        this.visit(ctx.PIZQ());
        this.visit(ctx.PDER());
        return null;
    }

    @Override
    public Object visitArrayAllocationExpressionAST(miParser.ArrayAllocationExpressionASTContext ctx) {
        this.visit(ctx.NEW());
        this.visit(ctx.simpleType());
        this.visit(ctx.CORIZQ());
        this.visit(ctx.expression());
        this.visit(ctx.CORDER());
        return null;
    }

    @Override
    public Object visitSubExpressionAST(miParser.SubExpressionASTContext ctx) {
        this.visit(ctx.PIZQ());
        this.visit(ctx.expression());
        this.visit(ctx.PDER());
        return null;
    }

    @Override
    public Object visitFunctionCallAST(miParser.FunctionCallASTContext ctx) {
        this.visit(ctx.identifier());
        this.visit(ctx.PIZQ());
        this.visit(ctx.actualParms());
        this.visit(ctx.PDER());
        return null;
    }

    @Override
    public Object visitActualParmsAST(miParser.ActualParmsASTContext ctx) {
        this.visit(ctx.expression(0));
        this.visit(ctx.COMA(0));
        this.visit(ctx.expression(1));
        return null;
    }

    @Override
    public Object visitArrayLookupAST(miParser.ArrayLookupASTContext ctx) {
        this.visit(ctx.identifier());
        this.visit(ctx.CORIZQ());
        this.visit(ctx.expression());
        this.visit(ctx.CORDER());
        return null;
    }

    @Override
    public Object visitArrayLengthAST(miParser.ArrayLengthASTContext ctx) {
        this.visit(ctx.identifier());
        this.visit(ctx.PUNTO());
        this.visit(ctx.LENGTH());
        return null;
    }

    @Override
    public Object visitRelationalOpAST(miParser.RelationalOpContext ctx) {
        this.visit(ctx.MAYOR());
        this.visit(ctx.MENOR());
        this.visit(ctx.MAYORI());
        this.visit(ctx.MENORI());
        this.visit(ctx.DIFERENTE());
        this.visit(ctx.DOBIGUAL());
        return null;
    }

    @Override
    public Object visitAdditiveOpAST(miParser.AdditiveOpContext ctx) {
        this.visit(ctx.SUB());
        this.visit(ctx.SUM());
        this.visit(ctx.OR());
        return null;
    }

    @Override
    public Object visitMultiplicativeOpAST(miParser.MultiplicativeOpContext ctx) {
        this.visit(ctx.MUL());
        this.visit(ctx.DIV());
        this.visit(ctx.AMPERSAND());
        return null;
    }

    @Override
    public Object visitIdentifierAST(miParser.IdentifierASTContext ctx) {
        this.visit(ctx.GUIONBAJO(0));
        this.visit(ctx.LETTER(0));
        this.visit(ctx.GUIONBAJO(1));
        this.visit(ctx.LETTER(1));
        this.visit(ctx.DIGIT(0));
        return null;
    }

    @Override
    public Object visitIntLiteralLAST(miParser.IntLiteralLASTContext ctx) {
        this.visit(ctx.intLiteral());
        return null;
    }

    @Override
    public Object visitRealLiteralLAST(miParser.RealLiteralLASTContext ctx) {
        this.visit(ctx.realLiteral());
        return null;
    }

    @Override
    public Object visitBoolLiteralLAST(miParser.BoolLiteralLASTContext ctx) {
        this.visit(ctx.boolLiteral());
        return null;
    }

    @Override
    public Object visitStringLiteralLAST(miParser.StringLiteralLASTContext ctx) {
        this.visit(ctx.stringLiteral());
        return null;
    }

    @Override
    public Object visitIntLiteralAST(miParser.IntLiteralASTContext ctx) {
        this.visit(ctx.DIGIT(0));
        this.visit(ctx.DIGIT(1));
        return null;
    }

    @Override
    public Object visitRealLiteral1AST(miParser.RealLiteral1ASTContext ctx) {
        this.visit(ctx.DIGIT(0));
        this.visit(ctx.DIGIT(1));
        this.visit(ctx.PUNTO());
        this.visit(ctx.DIGIT(2));
        return null;
    }

    @Override
    public Object visitRealLiteral2AST(miParser.RealLiteral2ASTContext ctx) {
        this.visit(ctx.PUNTO());
        this.visit(ctx.DIGIT(0));
        this.visit(ctx.DIGIT(1));
        return null;
    }

    @Override
    public Object visitBoolLiteralAST(miParser.BoolLiteralContext ctx) {
        this.visit(ctx.TRUE());
        this.visit(ctx.FALSE());
        return null;
    }

    @Override
    public Object visitStringLiteralAST(miParser.StringLiteralASTContext ctx) {
        this.visit(ctx.COMILLA(0));
        this.visit(ctx.printable(0));
        this.visit(ctx.COMILLA(0));
        return null;
    }

    @Override
    public Object visitPrintableAST(miParser.PrintableContext ctx) {
        this.visit(ctx.DIGIT());
        this.visit(ctx.LETTER());
        this.visit(ctx.PYCOMA());
        this.visit(ctx.ASSIGN());
        this.visit(ctx.IGUAL());
        this.visit(ctx.PIZQ());

        this.visit(ctx.PDER());
        this.visit(ctx.VIR());
        this.visit(ctx.DOSPUN());
        this.visit(ctx.SUM());
        this.visit(ctx.SUB());

        this.visit(ctx.MUL());
        this.visit(ctx.DIV());
        this.visit(ctx.COMILLA());
        this.visit(ctx.COMILLAD());

        this.visit(ctx.MAYOR());
        this.visit(ctx.MENOR());
        this.visit(ctx.MAYORI());
        this.visit(ctx.MENORI());

        this.visit(ctx.DOBIGUAL());
        this.visit(ctx.DIFERENTE());
        this.visit(ctx.ADMIRACION());
        this.visit(ctx.NUMERAL());
        this.visit(ctx.DOLAR());
        this.visit(ctx.PORCENTAJE());
        this.visit(ctx.AMPERSAND());

        this.visit(ctx.COMA());
        this.visit(ctx.PUNTO());
        this.visit(ctx.SIGPREGUNTA());
        this.visit(ctx.ARROBA());
        this.visit(ctx.CORIZQ());
        this.visit(ctx.CORDER());

        this.visit(ctx.BACKSLASH());
        this.visit(ctx.CIRCUNFLEJO());
        this.visit(ctx.GUIONBAJO());
        this.visit(ctx.LLAVEIZQ());
        this.visit(ctx.LLAVEDER());
        this.visit(ctx.OR());
        return null;
    }
}
