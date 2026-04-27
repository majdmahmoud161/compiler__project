lexer grammar HtmlLexer;

// =====================
// DEFAULT MODE
// =====================
// Comments
COMMENT
    : '<!--' .*? '-->' -> skip
    ;
// Text
TEXT
    : [a-zA-Z0-9_:]+
    ;
TAG_OPEN
    : '<' -> pushMode(TAG_MODE)
    ;
TAG_OPEN_SLASH
    : '</' -> pushMode(TAG_MODE)
    ;

// Whitespace OUTSIDE tags
WS
    : [ \t\r\n]+ -> skip
    ;

// =====================
// TAG MODE
// =====================

mode TAG_MODE;

// Whitespace INSIDE tags
WS_TAG
    : [ \t\r\n]+ -> skip
    ;

// Close tags
SLASH_CLOSE
    : '/>' -> popMode
    ;

TAG_CLOSE
    : '>' -> popMode
    ;

// Symbols
EQUALS : '=';
SLASH : '/';

// Attribute values
STRING
    : '"' (~["\\] | '\\' .)* '"'
    | '\'' (~['\\] | '\\' .)* '\''
    ;

// =====================
// TAG NAMES
// =====================

DOCTYPEHTML_TAG : '!DOCTYPE html';
HTML_TAG   : 'html';
HEAD_TAG   : 'head';
BODY_TAG   : 'body';
DIV_TAG    : 'div';
P_TAG      : 'p';
IMG_TAG    : 'img';
H1_TAG     : 'h1';
H2_TAG     : 'h2';
H3_TAG     : 'h3';
H4_TAG     : 'h4';
TITLE      : 'title';
BUTTON_TAG : 'button';
INPUT : 'input';
UL_TAG     : 'ul';
LI_TAG     : 'li';
A_TAG      : 'a';
FORM  : 'form';
LABEL_TAG  : 'label';
LINK       : 'link';

// =====================
// ATTRIBUTES
// =====================

CLASS       : 'class';
IDHTML         : 'id';
STYLE       : 'style';
SRC         : 'src';
ALT         : 'alt';
TYPE        : 'type';
HREF        : 'href';
VALUE       : 'value';
NAMEHTML       : 'name';
PLACEHOLDER : 'placeholder';
REL         : 'rel';
METHOD      : 'method';
ENCTYPE     : 'enctype';
RQUIRED     : 'required';