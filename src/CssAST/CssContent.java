package CssAST;


public class CssContent {

FontFamily fontFamily ;
BackGroundColor backGroundColor ;
Margin margin ;
MarginTop  marginTop ;
MarginBottom marginBottom ;
Padding padding ;
FontWeight fontWeight ;
Color color ;
Width width ;
BorderRadius borderRadius ;
Background background ;
Border border ;
BoxShadow boxShadow ;
Cursor cursor ;
TextDecoration textDecoration ;
AlignItems alignItems ;
JustifyContent justifyContent ;
Display display ;
ListStyle listStyle;
FontSize fontSize ;


    public FontFamily getFontFamily() {
        return fontFamily;
    }

    public void setFontFamily(FontFamily fontFamily) {
        this.fontFamily = fontFamily;
    }

    public BackGroundColor getBackGroundColor() {
        return backGroundColor;
    }

    public void setBackGroundColor(BackGroundColor backGroundColor) {
        this.backGroundColor = backGroundColor;
    }

    public Margin getMargin() {
        return margin;
    }

    public void setMargin(Margin margin) {
        this.margin = margin;
    }

    public MarginTop getMarginTop() {
        return marginTop;
    }

    public void setMarginTop(MarginTop marginTop) {
        this.marginTop = marginTop;
    }

    public MarginBottom getMarginBottom() {
        return marginBottom;
    }

    public void setMarginBottom(MarginBottom marginBottom) {
        this.marginBottom = marginBottom;
    }

    public Padding getPadding() {
        return padding;
    }

    public void setPadding(Padding padding) {
        this.padding = padding;
    }

    public FontWeight getFontWeight() {
        return fontWeight;
    }

    public void setFontWeight(FontWeight fontWeight) {
        this.fontWeight = fontWeight;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Width getWidth() {
        return width;
    }

    public void setWidth(Width width) {
        this.width = width;
    }

    public BorderRadius getBorderRadius() {
        return borderRadius;
    }

    public void setBorderRadius(BorderRadius borderRadius) {
        this.borderRadius = borderRadius;
    }

    public Background getBackground() {
        return background;
    }

    public void setBackground(Background background) {
        this.background = background;
    }

    public Border getBorder() {
        return border;
    }

    public void setBorder(Border border) {
        this.border = border;
    }

    public BoxShadow getBoxShadow() {
        return boxShadow;
    }

    public void setBoxShadow(BoxShadow boxShadow) {
        this.boxShadow = boxShadow;
    }

    public Cursor getCursor() {
        return cursor;
    }

    public void setCursor(Cursor cursor) {
        this.cursor = cursor;
    }

    public TextDecoration getTextDecoration() {
        return textDecoration;
    }

    public void setTextDecoration(TextDecoration textDecoration) {
        this.textDecoration = textDecoration;
    }

    public AlignItems getAlignItems() {
        return alignItems;
    }

    public void setAlignItems(AlignItems alignItems) {
        this.alignItems = alignItems;
    }

    public JustifyContent getJustifyContent() {
        return justifyContent;
    }

    public void setJustifyContent(JustifyContent justifyContent) {
        this.justifyContent = justifyContent;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public ListStyle getListStyle() {
        return listStyle;
    }

    public void setListStyle(ListStyle listStyle) {
        this.listStyle = listStyle;
    }

    public FontSize getFontSize() {
        return fontSize;
    }

    public void setFontSize(FontSize fontSize) {
        this.fontSize = fontSize;
    }

    @Override
    public String toString() {
        StringBuilder builder=new StringBuilder("CssContent{\n");
        if(fontFamily!=null ){
            builder.append("fontFamily: " + " " + fontFamily).append("\n");
        }
        if(background!=null ){
            builder.append("background : " + " " + background).append("\n");
        }
        if(margin!=null ){
            builder.append("margin : " + " " + margin).append("\n");
        }
        if(marginTop!=null ){
            builder.append("marginTop : " + " " + marginTop).append("\n");
        }
        if(marginBottom!=null ){
            builder.append("marginBottom : " + " " + marginBottom).append("\n");
        }
        if(padding!=null ){
            builder.append("padding : " + " " + padding).append("\n");
        }
        if(fontWeight!=null ){
            builder.append("fontWeight : " + " " + fontWeight).append("\n");
        }
        if(color!=null ){
            builder.append("color : " + " " + color).append("\n");
        }
        if(width!=null ){
            builder.append("width : " + " " + width).append("\n");
        }
        if(borderRadius!=null ){
            builder.append("borderRadius : " + " " +borderRadius ).append("\n");
        }
        if(border!=null ){
            builder.append("border : " + " " + border).append("\n");
        }
        if(boxShadow!=null ){
            builder.append("boxShadow : " + " " + boxShadow).append("\n");
        }
        if(cursor!=null ){
            builder.append("cursor : " + " " + cursor).append("\n");
        }
        if(textDecoration!=null ){
            builder.append("textDecoration : "  + " " + textDecoration).append("\n");
        }
        if(alignItems!=null ){
            builder.append("alignItems : " + " " + alignItems).append("\n");
        }
        if(justifyContent!=null ){
            builder.append("justifyContent : " + " " +justifyContent).append("\n");
        }
        if(display!=null ){
            builder.append("display : " + " " + display).append("\n");
        }
        if(listStyle!=null ){
            builder.append("listStyle : " + " " + listStyle).append("\n");
        }
        if(fontSize!=null ){
            builder.append("fontSize : " + " " + fontSize).append("\n");
        }

        return builder + " } ";

    }


}
