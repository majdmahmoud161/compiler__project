package CssAST;

public class Background {
    String BACKGROUND;
    String COLONE;
    Colors colors ;
    String HEXCOLOR;
    String SEMICOLON;


    public String getBACKGROUND() {
        return BACKGROUND;
    }

    public void setBACKGROUND(String BACKGROUND) {
        this.BACKGROUND = BACKGROUND;
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
        StringBuilder builder=new StringBuilder("BackGround { \n");

        if(colors!=null ) {
            builder.append("colors : " + " " + colors).append("\n");
        }

        return builder +" } ";

    }
}
