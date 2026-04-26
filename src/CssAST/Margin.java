package CssAST;

import java.util.ArrayList;
import java.util.List;

public class Margin {
    String MARGIN;
    String COLONE;
    List<MarginValue>marginValues = new ArrayList<>();
    String SEMICOLON;

    public String getMARGIN() {
        return MARGIN;
    }

    public void setMARGIN(String MARGIN) {
        this.MARGIN = MARGIN;
    }

    public String getCOLONE() {
        return COLONE;
    }

    public void setCOLONE(String COLONE) {
        this.COLONE = COLONE;
    }

    public List<MarginValue> getMarginValues() {
        return marginValues;
    }

    public void setMarginValues(List<MarginValue> marginValues) {
        this.marginValues = marginValues;
    }

    public String getSEMICOLON() {
        return SEMICOLON;
    }

    public void setSEMICOLON(String SEMICOLON) {
        this.SEMICOLON = SEMICOLON;
    }

    @Override
    public String toString() {
        StringBuilder builder=new StringBuilder("Margin{\n");

        if(marginValues!=null && !marginValues.isEmpty() ){
            builder.append("marginValues : " + " " + marginValues).append("\n");
        }

        return builder + " } ";

    }

}
