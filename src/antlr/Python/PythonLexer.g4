lexer grammar PythonLexer;
//operation
SUM:'+';
SUB:'-';
MULT:'*';
DIVISION:'/';
EQUALS:'=';
ISEQUALS:'==';
POW:'**';
MOD:'%';
GREATER:'>';
SMALLER:'<';
OR:'or'|'||';
AND:'and' | '&&';
NOT:'not' | '!';
IS:'is';
IN:'in';
TRUEBOOL:'True';
FALSEBOOL:'False';

//keyword
FOR:'for';
IF:'if';
ELSE:'else';
ELIF:'elif';
WHILE:'while';
BREAK:'break';
CONTINUE:'continue';
RETURN:'return';
RANGE:'range';
DEF:'def';


//build in function
PRINT:'print';
TYPE:'type';
INPUT:'input';
LEN:'len';
APPEND:'append';

//sympole
DOT:'.';
COLONE:':';
COMMA:',';
OPENPRAC:'(';
CLOSEPRAC:')';
OPENKPRA:'{';
CLOSEKPRA:'}';
OPENSQUER:'[';
CLOSESQUER:']';


INT:[0-9]+;
DOUBLE:INT'.'INT;
ID :[a-zA-Z_][0-9a-zA-Z_]*;
STRING:'"' [0-9a-zA-Z ]* '"'
       |'\''[0-9a-zA-Z ]*'\'';
WHSPACE:[ \t\r]+->skip;
NEWLINE: [\n]+->skip;