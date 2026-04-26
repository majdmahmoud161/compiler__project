package CssAST;

import java.util.ArrayList;
import java.util.List;

public class BoxShadow {
    String BOXSHADOW;
    String COLONE;
    List<ShadowValue>shadowValues=new ArrayList<>();
    String SEMICOLON;

    public String getBOXSHADOW() {
        return BOXSHADOW;
    }

    public void setBOXSHADOW(String BOXSHADOW) {
        this.BOXSHADOW = BOXSHADOW;
    }

    public String getCOLONE() {
        return COLONE;
    }

    public void setCOLONE(String COLONE) {
        this.COLONE = COLONE;
    }

    public List<ShadowValue> getShadowValues() {
        return shadowValues;
    }

    public void setShadowValues(List<ShadowValue> shadowValues) {
        this.shadowValues = shadowValues;
    }

    public String getSEMICOLON() {
        return SEMICOLON;
    }

    public void setSEMICOLON(String SEMICOLON) {
        this.SEMICOLON = SEMICOLON;
    }

    @Override
    public String toString() {
        StringBuilder builder=new StringBuilder("BoxShadow{\n");

        if(shadowValues!=null && !shadowValues.isEmpty()){
            builder.append("shadowValues : "+ " "+shadowValues ).append("\n");
        }

        return builder +"}";

    }

}
