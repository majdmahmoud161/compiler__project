package CssAST;

public class Border {
    String BORDER;
    String COLONE;
    String CSSNUMBER;
    String UNIT;
    String SOLID;
    Colors colors ;
    String HEXCOLOR;
    String NONEcss;
    String SEMICOLON;

    public String getBORDER() {
        return BORDER;
    }

    public void setBORDER(String BORDER) {
        this.BORDER = BORDER;
    }

    public String getCOLONE() {
        return COLONE;
    }

    public void setCOLONE(String COLONE) {
        this.COLONE = COLONE;
    }

    public String getCSSNUMBER() {
        return CSSNUMBER;
    }

    public void setCSSNUMBER(String CSSNUMBER) {
        this.CSSNUMBER = CSSNUMBER;
    }

    public String getUNIT() {
        return UNIT;
    }

    public void setUNIT(String UNIT) {
        this.UNIT = UNIT;
    }

    public String getSOLID() {
        return SOLID;
    }

    public void setSOLID(String SOLID) {
        this.SOLID = SOLID;
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

    public String getNONEcss() {
        return NONEcss;
    }

    public void setNONEcss(String NONEcss) {
        this.NONEcss = NONEcss;
    }

    public String getSEMICOLON() {
        return SEMICOLON;
    }

    public void setSEMICOLON(String SEMICOLON) {
        this.SEMICOLON = SEMICOLON;
    }

    @Override
    public String toString() {
        StringBuilder builder=new StringBuilder("Border{\n");

        if(colors!=null ){
            builder.append("colors : "+" "+colors).append("\n");
        }


        return builder + "}";

    }


}
