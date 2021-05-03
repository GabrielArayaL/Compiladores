parser grammar miParser;


options {

    tokenVocab = miScanner;
}



program : (statement)* EOF;



statement   : variableDecl PYCOMA
            | classDecl PYCOMA
            | assignment PYCOMA
            | arrayAssignment PYCOMA
            | printStatement PYCOMA
            | ifStatement
            | whileStatement
            | returnStatement PYCOMA
            | functionDecl
            | block ;


block: LLAVEIZQ(statement)* LLAVEDER;

functionDecl:   type identifier PIZQ(formalParams)? PDER block;

formalParams:   formalParam(COMA formalParam)*;

formalParam:    type identifier;

whileStatement:     WHILE PIZQ expression PDER block;

ifStatement: IF PIZQ expression PDER block (ELSE block)?;

returnStatement:    RETURN expression;

printStatement: PRINT expression;

classDecl: CLASS identifier LLAVEIZQ(classVariableDecl)* LLAVEDER;


classVariableDecl:  simpleType identifier(IGUAL expression)?;

variableDecl: type identifier (IGUAL expression)?;

type : simpleType
      | arrayType
      | identifier;


simpleType:  BOOLEAN
            | CHAR2
            | INT2
            | STRING2;

arrayType: simpleType  CORIZQ CORDER ;


assignment: identifier(PUNTO identifier)? IGUAL expression;


arrayAssignment:    identifier CORIZQ expression CORDER IGUAL expression;


expression : simpleExpression (relationalOp simpleExpression)*;


simpleExpression: term(additiveOp term)* ;


term:   factor(multiplicativeOp factor)*   ;


factor: literal
        |identifier(PUNTO identifier)?
        |functionCall
        |arrayLookup
        |arrayLength
        |subExpression
        |arrayAllocationExpression
        |allocationExpression
        |unary;


unary:  (SUM|SUB|ADMIRACION)(expression)*;


allocationExpression:   NEW identifier PIZQ PDER;

arrayAllocationExpression:  NEW simpleType CORIZQ expression CORDER;

subExpression:  PIZQ expression PDER;

functionCall:   identifier PIZQ(actualParms)?PDER;


actualParms:    expression (COMA expression)*;

arrayLookup:    identifier CORIZQ(expression)CORDER;

arrayLength:    identifier PUNTO LENGTH;

relationalOp: MAYOR|MENOR|MAYORI|MENORI|DIFERENTE|DOBIGUAL;

additiveOp: SUM|SUB|OR;

multiplicativeOp: MUL|DIV|AMPERSAND;

identifier: (GUIONBAJO|LETTER)(GUIONBAJO|LETTER|DIGIT)*;

literal: intLiteral
            |realLiteral
            |boolLiteral
            |stringLiteral;

intLiteral:     DIGIT(DIGIT)*;


realLiteral:    DIGIT(DIGIT)*PUNTO(DIGIT)*
                |PUNTO DIGIT(DIGIT)*;

boolLiteral: TRUE|FALSE;

stringLiteral:  COMILLA(printable)*COMILLA;




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
            | OR;



