parser grammar PythonParser;

options { tokenVocab =PythonLexer;}

programe : state* EOF;

state :
    vardecler           #VarLable
    |array              #ArrayLable
    |loop               #LoopLable
    |if                 #IfLable
    |exp                #ExpLable
    |function_decler    #FunctionDeclerLable
    |call_function      #CallFunctionLable
    |class_decl         #ClassDeclLabel
    |object             #ObjectLabel
    |call_fromclass     #CallFromClassLabel
    |inheritance        #InheritanceLabel;


vardecler : ID EQUALS value;

value : INT|DOUBLE|STRING|TRUEBOOL|FALSEBOOL|ID|array;

array : (ID)? OPENSQUER paramterlist CLOSESQUER ;

loop :
    for                 #ForLable
    |while              #WhileLable;


for : FOR ID IN RANGE OPENPRAC (INT|ID) CLOSEPRAC COLONE  (state)? (BREAK|CONTINUE)?;

while : WHILE value COLONE (state)? (BREAK|CONTINUE)? ;

if: IF exp COLONE  (state)? (el_if)? ;

el_if : ELIF exp COLONE  (state)?  (else)? ;

else: ELSE COLONE  (state)? ;

function_decler: DEF ID OPENPRAC (ID(COMMA ID)*)* CLOSEPRAC COLONE (state)? return?;

call_function : (ID|build_in_function) OPENPRAC paramterlist CLOSEPRAC  ;

build_in_function: PRINT|TYPE|LEN|INPUT ;

return : RETURN value ;

 exp
     : exp POW exp
     | exp MULT exp
     | exp DIVISION exp
     | exp MOD exp
     | exp SUM exp
     | exp SUB exp
     | exp ISEQUALS exp
     | exp GREATER EQUALS exp
     | exp SMALLER EQUALS exp
     | exp OR exp
     | exp AND exp
     | exp IS exp
     | INT
     | ID
     | ID DOT ID
     | STRING
     | TRUEBOOL
     | FALSEBOOL
     | NONE
     ;

class_decl
   :CLASS ID COLONE class_body*
   ;

class_body
    : constructor_decl      #ConstructerDeclerLabel
    | encapsulation         #EncapsulationLabel
    | state                 #StateLabel
    | decorator             #DecoratorLabel
    ;

constructor_decl
   : DEF ID OPENPRAC (paramterlist) CLOSEPRAC COLONE state*
   ;
object
   : ID EQUALS ID OPENPRAC (paramterlist) CLOSEPRAC
   ;

call_fromclass
   :ID DOT (call_function|ID) (EQUALS value)?
   ;

decorator : AT ID ;

inheritance
   : CLASS ID OPENPRAC ID CLOSEPRAC COLONE (super)? (class_body)*
   ;

super
    : SUPER DOT ID OPENPRAC paramterlist CLOSEPRAC
    ;

encapsulation
   : (PRIVATE|PROTECTED) vardecler
   ;

paramterlist: (value(COMMA value)*)* ;


