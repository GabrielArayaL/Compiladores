lexer grammar miScaner;

//símbolos
PyCOMA  : ';' ;
ASSIGN  : ':=';
PIZQ    : '(';
PDER    : ')';
VIR     : '~';
DOSPUN  : ':';
SUM     : '+';
SUB     : '-';
MUL     : '*';
DIV     : '/';

//palabras reservadas


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

INT-LITERAL = 

REAL-LITERAL = DIGIT (DIGIT)*'.'(DIGIT)*

BOOL-LITERAL   : 'true' | 'false'
STRING-LITERAL : '"' (PRINTABLE)* '"'; 

PRINTABLE   :  DIGIT | LETTER | '' | '!' | '"' | '#' | '$' | '%' | '&'
                    | ''' | '(' | ')' | '*' | '+' |',' | '-' | '.' | '/' | ':' | ';'
                    | '<'| '=' | '>' | '?' | '@' | '[' | '\' | ']' | '^' | '_' | '`'
                    | '{' | '|' | '}' | '~' ;


ID : LETTER (LETTER|DIGIT)* ;
NUM : DIGIT DIGIT* ;

fragment LETTER : 'a'..'z' | 'A'..'Z';
fragment DIGIT : '0'..'9' ;

WS  :   [ \t\n\r]+ -> skip ;