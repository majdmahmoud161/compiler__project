package CssAST;

public class Color {
    String COLOR;
    String COLONE;
    Colors colors ;
    String HEXCOLOR;
    String SEMICOLON;

    public String getCOLOR() {
        return COLOR;
    }

    public void setCOLOR(String COLOR) {
        this.COLOR = COLOR;
    }

    public String getCOLONE() {
        return COLONE;
    }

    public void setCOLONE(String COLONE) {
        this.COLONE = COLONE;
    }

    public Colors getColors() {
        return colors;
    }

    public void setColors(Colors colors) {
        this.colors = colors;
    }

    public String getHEXCOLOR() {
        return HEXCOLOR;
    }

    public void setHEXCOLOR(String HEXCOLOR) {
        this.HEXCOLOR = HEXCOLOR;
    }

    public String getSEMICOLON() {
        return SEMICOLON;
    }

    public void setSEMICOLON(String SEMICOLON) {
        this.SEMICOLON = SEMICOLON;
    }

    @Override
    public String toString() {
        StringBuilder builder=new StringBuilder("Color{\n");



        if(colors!=null ){
            builder.append("colors : " + " " + colors).append("\n");
        }


        return builder +" } ";

    }
}
