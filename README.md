# مشروع المترجمات 1 : 


تقنية Flask هي إطار عمل بسيط بلغة Python يُستخدم لتطوير تطبيقات الويب، باالعتماد على نظام
القوالب Jinja2إلنشاء صفحات ديناميكية. ويتم استخدام HTML و CSS لبناء الواجهات وتصميم الشكل
العام للتطبيق. يوفّر Flask بيئة خفيفة وسهلة لبناء تطبيقات ويب قابلة للتطوير والعمل على مختلف
األنظمة.

يحتوي المراحل الاربعة الاولى من مراحل المترجمات وهي : 
* Lexer
* Parser
* AST
* Symbol Table
---
Sub Of Code From Lexer :
```
lexer grammar LexerName;

OPENKPRA    : '{';
CLOSEKPRA   : '}';
DOT: '.';
SEMICOLON      : ';';
COLONE          : ':';
OPENPRAC   : '(';
CLOSEPRAC  : ')';
COMMA          : ',';
```
---
Sub Of Code From Parser : 
```
parser grammar ParserName;
options { tokenVocab = LexerName; }


cssdocument
    : (nameOfTag
     | classname
     | idname)+ EOF
    ;

```
---
Sub Of Code From Class From AST Clases : 
```
public Class NameOfRule{
  String Token1;
  String Token2;
  Rule rule();
  List<Rule>NameOfList = new ArrayList<>();
  Setter();
  Getter();
  ToString();
}
```



