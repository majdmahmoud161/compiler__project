parser grammar CssParser;
options { tokenVocab = CssLexer; }


cssdocument
    : (nameOfTag
     | classname
     | idname)+ EOF
    ;

///////////////////// TAG_OPEN_SLASH
nameOfTag
    :
     (csstagName (COMMA csstagName)* OPENKPRA csscontent* CLOSEKPRA)
    | (csstagName COLONE hov_aft_bef OPENKPRA csscontent* CLOSEKPRA)
    | (csstagName csstagName OPENKPRA csscontent* CLOSEKPRA)
    ;


    hov_aft_bef
    :HOVER
    |AFTER
    |BEFORE
    ;

csstagName
    :
     BODY_TAG
    | P_TAG
    | H1_TAG
    | H2_TAG
    | BUTTON_TAG
    | INPUT_TAG
    | UL_TAG
    | LI_TAG
    | A_TAG
    | FORM_TAG
    | LABEL_TAG
    | IMG_TAG
    ;

classname
    : DOT ID csstagName? COLONE? hov_aft_bef?  OPENKPRA  csscontent* CLOSEKPRA
    ;

idname
    : ID_SELECTOR ID  OPENKPRA csscontent*CLOSEKPRA
    ;

csscontent
    : font_family
    | background_color
    | margin
    | margin_top
    | margin_bottom
    | padding
    | font_weight
    | color
    | width
    | border_radius
    | background
    | border
    | box_shadow
    | cursor
    | text_decoration
    | align_items
    | justify_content
    | display
    | list_style
    | font_size
    ;
font_size
    :FONTSIZE COLONE CSSNUMBER UNIT? SEMICOLON;

font_family
    : FONTFAMILY COLONE ARIAL_FONTFAMILY COMMA SENSSERIF SEMICOLON
    ;

background_color
    : BACKGROUNDCOLOR COLONE colors SEMICOLON
    ;

background
    : BACKGROUND COLONE colors SEMICOLON
    ;

margin
    : MARGIN COLONE marginValue*  SEMICOLON
    ;
marginValue
    : CSSNUMBER UNIT?
    | AUTO
    ;

    color:COLOR COLONE colors SEMICOLON;

margin_top
    : MARGINTOP COLONE (CSSNUMBER (UNIT)? | (AUTO)?) SEMICOLON
    ;

padding
    : PADDING COLONE ((CSSNUMBER (UNIT)?)* | AUTO) SEMICOLON
    ;
font_weight
    : FONTWEIGHT   COLONE (BOLD  |CSSNUMBER ) SEMICOLON
    ;
colors
    : WHITE
    | RED
    | GREEN
    | BLUE
    | YELLOW
    | BLACK
    | HEXCOLOR
    | ID
    ;


 width
     : WIDTH COLONE ((CSSNUMBER (UNIT)?) | AUTO) SEMICOLON
     ;

border_radius
    :BORDERRADIOS   COLONE ((CSSNUMBER (UNIT)?) | AUTO) SEMICOLON
    ;
  border
      :
        BORDER COLONE (CSSNUMBER(UNIT)? SOLID? colors? ( HEXCOLOR)? | (NONEcss ) ) SEMICOLON
      ;

     box_shadow
         : BOXSHADOW COLONE shadowValue+ SEMICOLON
         ;

     shadowValue
         : CSSNUMBER UNIT?
         | RGBA OPENPRAC CSSNUMBER COMMA CSSNUMBER COMMA CSSNUMBER COMMA CSSNUMBER CLOSEPRAC
         ;


   list_style
       : LISTSTYLE COLONE (NONEcss  | UNDERLINE) SEMICOLON
       ;

   display
       : DISPLAY COLONE (FLEX | INLINEBLOCK) SEMICOLON
       ;

   justify_content
       : JUSTIFYCONTENT COLONE SPACEBETWEEN SEMICOLON
       ;

   align_items
       : ALIGNITEM COLONE CENTER SEMICOLON
       ;

   text_decoration
       : TEXTDECORATION COLONE (NONEcss | UNDERLINE) SEMICOLON
       ;

   cursor
       : COURSER COLONE POINTER SEMICOLON
       ;

    margin_bottom:  MARGINBOTTOM  COLONE ((CSSNUMBER (UNIT)?) ) SEMICOLON;