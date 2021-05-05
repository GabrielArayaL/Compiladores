parser grammar miParser;


options {

    tokenVocab = miScanner;
}



program : (statement)* EOF                                                                              #programAST;


statement   : variableDecl PYCOMA                                                                       #variableDeclCAST
            | classDecl PYCOMA                                                                          #classDeclCAST
            | assignment PYCOMA                                                                         #assignmentCAST
            | arrayAssignment PYCOMA                                                                    #arrayAssignmentCAST
            | printStatement PYCOMA                                                                     #printStatementCAST
            | ifStatement                                                                               #ifStatementCAST
            | whileStatement                                                                            #whileStatementCAST
            | returnStatement PYCOMA                                                                    #returnStatementCAST
            | functionDecl                                                                              #functionDeclCAST
            | block                                                                                     #blockCAST;




block: LLAVEIZQ(statement)* LLAVEDER                                                                    #blockAST;

functionDecl:   type identifier PIZQ(formalParams)? PDER block                                          #functionDeclAST;

formalParams:   formalParam(COMA formalParam)*                                                          #formalParamsAST;

formalParam:    type identifier                                                                         #formalParamAST;

whileStatement:     WHILE PIZQ expression PDER block                                                    #whileAST;

ifStatement: IF PIZQ expression PDER block (ELSE block)?                                                #ifAST;

returnStatement:    RETURN expression                                                                   #returnStatementAST;

printStatement: PRINT expression                                                                        #printStatementAST;

classDecl: CLASS identifier LLAVEIZQ(classVariableDecl)* LLAVEDER                                       #classDeclAST;


classVariableDecl:  simpleType identifier(IGUAL expression)?                                            #classVariableDeclAST;

variableDecl: type identifier (IGUAL expression)?                                                       #classVariableDec;

type : simpleType                                                                                       #simpleTypeCAST
      | arrayType                                                                                       #arrayTypeCAST
      | identifier                                                                                      #identifierCAAST;


simpleType:  BOOLEAN                                                                                    #booleanCAST
            | CHAR2                                                                                     #char2CAST
            | INT2                                                                                      #int2CAST
            | STRING2                                                                                   #string2CAST;

arrayType: simpleType  CORIZQ CORDER                                                                    #arrayTypeAST;


assignment: identifier(PUNTO identifier)? IGUAL expression                                              #assignmentAST;


arrayAssignment:    identifier CORIZQ expression CORDER IGUAL expression                                #arrayAssignmentAST;


expression : simpleExpression (relationalOp simpleExpression)*                                          #expressionAST;


simpleExpression: term(additiveOp term)*                                                                #simpleExpressionAST;


term:   factor(multiplicativeOp factor)*                                                                #termAST;


factor: literal                                                                                        #literalCAST
        |identifier(PUNTO identifier)?                                                                 #identifierCAST
        |functionCall                                                                                  #functionCallCAST
        |arrayLookup                                                                                   #arrayLookupCAST
        |arrayLength                                                                                   #arrayLengthCAST
        |subExpression                                                                                 #subExpressionCAST
        |arrayAllocationExpression                                                                     #arrayAllocationExpressionCAST
        |allocationExpression                                                                          #allocationExpressionCAST
        |unary                                                                                         #unaryCAST;


unary:  (SUM|SUB|ADMIRACION)(expression)*                                                              #unaryAST;


allocationExpression:   NEW identifier PIZQ PDER                                                       #allocationExpressionAST;

arrayAllocationExpression:  NEW simpleType CORIZQ expression CORDER                                    #arrayAllocationExpressionAST;

subExpression:  PIZQ expression PDER                                                                   #subExpressionAST;

functionCall:   identifier PIZQ(actualParms)?PDER                                                      #functionCallAST;


actualParms:    expression (COMA expression)*                                                          #actualParmsAST;

arrayLookup:    identifier CORIZQ(expression)CORDER                                                    #arrayLookupAST;

arrayLength:    identifier PUNTO LENGTH                                                                #arrayLengthAST;

relationalOp: MAYOR|MENOR|MAYORI|MENORI|DIFERENTE|DOBIGUAL                                             #relationalOpAST;

additiveOp: SUM|SUB|OR                                                                                 #additiveOpAST;

multiplicativeOp: MUL|DIV|AMPERSAND                                                                    #multiplicativeOpAST;

//identifier: ID;
identifier: (GUIONBAJO|LETTER)(GUIONBAJO|LETTER|DIGIT)*                                                #identifierAST;

literal: intLiteral
            |realLiteral
            |boolLiteral
            |stringLiteral;

intLiteral:     DIGIT(DIGIT)*                                                                         #intLiteralAST;


realLiteral:    DIGIT(DIGIT)*PUNTO(DIGIT)*|PUNTO DIGIT(DIGIT)*;

boolLiteral: TRUE|FALSE                                                                               #boolLiteralAST;

stringLiteral:  COMILLA(printable)*COMILLA                                                            #stringLiteralAST;




printable:    DIGIT
            | LETTER
            | PYCOMA
            | ASSIGN
            | IGUAL
            | PIZQ
            | PDER
            | VIR
            | DOSPUN
            | SUM
            | SUB
            | MUL
            | DIV
            | COMILLA
            | COMILLAD
            | MAYOR
            | MENOR
            | MAYORI
            | MENORI
            | DOBIGUAL
            | DIFERENTE
            | ADMIRACION
            | NUMERAL
            | DOLAR
            | PORCENTAJE
            | AMPERSAND
            | COMA
            | PUNTO
            | SIGPREGUNTA
            | ARROBA
            | CORIZQ
            | CORDER
            | BACKSLASH
            | CIRCUNFLEJO
            | GUIONBAJO
            | LLAVEIZQ
            | LLAVEDER
            | OR                                                                                      #printableAST;



