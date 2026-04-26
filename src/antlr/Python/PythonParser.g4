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
    |encapsulation      #EncapsulationLabel
    |constructor_decl   #ConstructorLabel
    |decorator          #DecoratorLabel
    |call_fromclass     #CallFromClassLabel
    ;

vardecler : ID EQUALS (value|array);

value : INT|DOUBLE|STRING|TRUEBOOL|FALSEBOOL|ID;

array : (ID)? OPENSQUER (value(COMMA value)*)* CLOSESQUER ;

loop :
    for                 #ForLable
    |while              #WhileLable;


for : FOR ID IN RANGE OPENPRAC (INT|ID) CLOSEPRAC COLONE  (state)? (BREAK|CONTINUE)?;

while : WHILE value COLONE (state)? (BREAK|CONTINUE)? ;

if: IF exp COLONE  (state)? (el_if)? ;

el_if : ELIF exp COLONE  (state)?  (else)? ;

else: ELSE COLONE  (state)? ;

function_decler: DEF ID OPENPRAC (ID(COMMA ID)*)* CLOSEPRAC COLONE (state)? return?;

call_function : (ID|build_in_function) OPENPRAC paramterlist? CLOSEPRAC  ;

build_in_function: PRINT|TYPE|LEN|INPUT ;

paramterlist: (value(COMMA value)*)* ;

return : RETURN value ;
exp: INT ;

class_decl
   :CLASS ID COLONE encapsulation* (state)* constructor_decl*
   ;
constructor_decl
   : DEF ID OPENPRAC (ID (COMMA)? paramterlist)? CLOSEPRAC COLONE (ID DOT ID EQUALS value)* state*
   ;
object
   : ID EQUALS ID OPENPRAC (paramterlist)? CLOSEPRAC
   ;
call_fromclass
   :ID DOT call_function
   ;

decorator : AT ID ;

inheritance
   : CLASS ID OPENPRAC ID (COMMA ID)* CLOSEPRAC COLONE (SUPER DOT ID OPENPRAC paramterlist? CLOSEPRAC)? (state)*
   ;
encapsulation
   : PRIVATE vardecler
   | PROTECTED vardecler
   ;


