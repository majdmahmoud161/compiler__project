package CssAST;

public class BackGroundColor {
    String BACKGROUNDCOLOR;
    String COLONE;
    Colors colors ;
    String SEMICOLON;

    public String getBACKGROUNDCOLOR() {
        return BACKGROUNDCOLOR;
    }

    public void setBACKGROUNDCOLOR(String BACKGROUNDCOLOR) {
        this.BACKGROUNDCOLOR = BACKGROUNDCOLOR;
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

    public String getSEMICOLON() {
        return SEMICOLON;
    }

    public void setSEMICOLON(String SEMICOLON) {
        this.SEMICOLON = SEMICOLON;
    }

    @Override
    public String toString() {
        StringBuilder builder=new StringBuilder("BackGroundColor{\n");



        if(colors!=null ){
            builder.append("colors : " + " " + colors).append("\n");
        }

        return builder + " } " ;

    }
}
