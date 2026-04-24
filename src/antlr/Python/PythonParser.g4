parser grammar PythonParser;

options { tokenVocab =PythonLexer;}

programe : state+ EOF;

state :
    vardecler
    |array
    |loop
    |if
    |exp
    |function_decler
    |call_function;

vardecler : ID EQUALS (value|array);

value : INT|DOUBLE|STRING|TRUEBOOL|FALSEBOOL|ID;

array : (ID)? OPENSQUER (value(COMMA value)*)* CLOSESQUER ;

loop :
    for
    |while;

for : FOR ID IN RANGE OPENPRAC (INT|ID) CLOSEPRAC COLONE  (state)? (BREAK|CONTINUE)?;

while : WHILE value COLONE  (BREAK|CONTINUE)? ;

if: IF exp COLONE  (state)? (el_if)? ;

el_if : ELIF exp COLONE  (state)?  (else)? ;

else: ELSE COLONE  (state)? ;

function_decler: DEF ID OPENPRAC (ID(COMMA ID)*)* CLOSEPRAC COLONE (state)?;

call_function : (ID|build_in_function) OPENPRAC (paramterlist)? CLOSEPRAC  ;

build_in_function: PRINT|TYPE|LEN|INPUT ;

paramterlist: (value(COMMA value)*)* ;

exp: INT ;


