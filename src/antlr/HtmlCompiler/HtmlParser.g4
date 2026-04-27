parser grammar HtmlParser;

options { tokenVocab=HtmlLexer; }


document
    : fullHtmlDocument      #FullHtmlDocumentLabel
    | tagsDocument          #TagsDocumentLabel
    ;

tagsDocument
    : (tagtype
    | TEXT)+
    ;

fullHtmlDocument
    : doctypehtml htmlOpen headSection bodySection htmlClose
    ;

doctypehtml
    : TAG_OPEN DOCTYPEHTML_TAG TAG_CLOSE
    ;

htmlOpen
    :TAG_OPEN HTML_TAG TAG_CLOSE
    ;

htmlClose
    : TAG_OPEN_SLASH HTML_TAG TAG_CLOSE
    ;

headSection
    : TAG_OPEN HEAD_TAG TAG_CLOSE content? TAG_OPEN_SLASH HEAD_TAG TAG_CLOSE
    ;

bodySection
    : TAG_OPEN BODY_TAG TAG_CLOSE content? TAG_OPEN_SLASH BODY_TAG TAG_CLOSE
    ;
content
    : (tagtype
    | TEXT)+
    ;
tagtype
    : startTag content? endTag
    | selfClosingtag
    ;
startTag
    : TAG_OPEN tagName (attribute)* TAG_CLOSE
    ;
endTag
    : TAG_OPEN_SLASH tagName TAG_CLOSE
    ;
attribute
    :(CLASS
     |IDHTML
     |STYLE
     |SRC
     |ALT
     |TYPE
     |HREF
     |VALUE
     |PLACEHOLDER
     |NAMEHTML
     |REL
     |METHOD
     |ENCTYPE
     |RQUIRED

     ) (EQUALS STRING)?
     ;
tagName
    : DIV_TAG
    | P_TAG
    | H1_TAG
    | H2_TAG
    | H3_TAG
    | H4_TAG
    | TITLE
    | BUTTON_TAG
    | UL_TAG
    | LI_TAG
    | A_TAG
    | FORM
    | LABEL_TAG
    | LINK
    | SPAN
    ;
selfClosingtag
    : TAG_OPEN (IMG_TAG | INPUT) attribute* (SLASH_CLOSE)?
    ;


