parser grammar miParser;
options {  tokenVocab = miScaner;   }

program                      :  singleCommand EOF                                          ;

command                      :  singleCommand (PyCOMA singleCommand)*                      ;


singleCommand                :  ID ASSIGN expression
                             |  ID PIZQ expression PDER
                             |  IF expression THEN singleCommand ELSE singleCommand
                             |  WHILE expression DO singleCommand
                             |  LET declaration IN singleCommand
                             |  BEGIN command END                                         ;


declaration                  :  singleDeclaration (PyCOMA singleDeclaration)*             ;


singleDeclaration            :  CONST ID VIR expression
                             |  VAR ID DOSPUN typedenoter                                ;


typedenoter                  :  ID                                                       ;
expression                   :  primaryExpression (operator primaryExpression)*          ;





operator                     :  SUM  |  SUB  |  MUL  |  DIV                               ;





primaryExpression            :  NUM
                             |  PIZQ expression PDER
                             |  ( STRING | SPECIAL_STRING)
                             |  ID                                     ;


