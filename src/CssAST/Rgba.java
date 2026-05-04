package CssAST;

import java.util.ArrayList;
import java.util.List;

public class Rgba {
String RGBA;
String OPENPRAC;
List<String>CSSNUMBER=new ArrayList<>();
List<String>COMMA = new ArrayList<>();
String CLOSEPRAC;

    public String getRGBA() {
        return RGBA;
    }

    public void setRGBA(String RGBA) {
        this.RGBA = RGBA;
    }

    public String getOPENPRAC() {
        return OPENPRAC;
    }

    public void setOPENPRAC(String OPENPRAC) {
        this.OPENPRAC = OPENPRAC;
    }

    public List<String> getCSSNUMBER() {
        return CSSNUMBER;
    }

    public void setCSSNUMBER(List<String> CSSNUMBER) {
        this.CSSNUMBER = CSSNUMBER;
    }

    public List<String> getCOMMA() {
        return COMMA;
    }

    public void setCOMMA(List<String> COMMA) {
        this.COMMA = COMMA;
    }

    public String getCLOSEPRAC() {
        return CLOSEPRAC;
    }

    public void setCLOSEPRAC(String CLOSEPRAC) {
        this.CLOSEPRAC = CLOSEPRAC;
    }

//    @Override
//    public String toString() {
//    StringBuilder builder = new StringBuilder("Rgba{\n");
//    if(CSSNUMBER!=null && !CSSNUMBER.isEmpty()){
//        builder.append("CSSNUMBER : " + " " + CSSNUMBER).append("\n");
//    }
//
//    }
}
