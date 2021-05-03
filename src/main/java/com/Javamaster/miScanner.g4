lexer grammar miScanner;

//símbolos
PYCOMA  : ';' ;
ASSIGN  : ':=';
IGUAL   : '=';
PIZQ    : '(';


PDER    : ')';
VIR     : '~';
DOSPUN  : ':';
SUM     : '+';
SUB     : '-';
MUL     : '*';
DIV     : '/';
COMILLA : '"';
COMILLAD: '""';
MAYOR   : '>=';
MENOR   : '<=';
MAYORI   : '>';
MENORI   : '<';
DOBIGUAL: '==';
DIFERENTE:'!=';
ADMIRACION: '!';
NUMERAL:  '#';


DOLAR:  '$';
PORCENTAJE:  '%';
AMPERSAND:'&';
COMA:',';
PUNTO:'.';
SIGPREGUNTA:'?';
ARROBA:'@';
CORIZQ:'[';
CORDER:']';
BACKSLASH: '\'';
CIRCUNFLEJO:'^';
GUIONBAJO:'_';
LLAVEIZQ:'{';
LLAVEDER:'}';
OR:'|';


//palabras reservadas
BOOLEAN : 'boolean' ;
IF      : 'if' ;
WHILE   : 'while' ;
LET     : 'let';
THEN    : 'then';
ELSE    : 'else';
IN      : 'in';
DO      : 'do';
BEGIN   : 'begin';
END     : 'end';
CONST   : 'const';
VAR     : 'var';
TRUE    : 'true';
FALSE   : 'false';
LENGTH  :'length';
NEW     :'new';
CLASS   :'class';
PRINT   :'print';
RETURN  :'return';
STRING2 :'String';
CHAR2   :'char';
INT2    :'int';
PUBLIC  :'public';

CHAR: COMILLA(LETTER|DIGIT)COMILLA;
STRING: COMILLA(LETTER|DIGIT)*COMILLA;
INT : [0-9]+;
ID : LETTER (LETTER|DIGIT)* ;
NUM : DIGIT DIGIT* ;
LETTER : 'a'..'z' | 'A'..'Z';
DIGIT : '0'..'9' ;

COMMENT : '<!--' .*? '-->' ;
WS  :   [ \t\n\r]+ -> skip ;

