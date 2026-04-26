package CssAST;

import java.util.ArrayList;
import java.util.List;

public class ShadowValue {
    List<String>CSSNUMBER  = new ArrayList<>();
    String UNIT;
    String RGBA;
    String OPENPRAC;
    List<String >COMMA=new ArrayList<>();
    String CLOSEPRAC;


    public List<String> getCSSNUMBER() {
        return CSSNUMBER;
    }

    public void setCSSNUMBER(List<String> CSSNUMBER) {
        this.CSSNUMBER = CSSNUMBER;
    }

    public String getUNIT() {
        return UNIT;
    }

    public void setUNIT(String UNIT) {
        this.UNIT = UNIT;
    }

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
//        StringBuilder sb=new StringBuilder("ShadowValue{\n");
//        if(RGBA!=null ){
//            sb.append("RGBA=").append(RGBA).append("\n");
//        }
//        if(UNIT!=null){
//            sb.append("UNIT=").append(UNIT).append("\n");
//        }
//        if(OPENPRAC!=null ){
//            sb.append("OPENPRAC=").append(OPENPRAC).append("\n");
//        }
//        if(CLOSEPRAC!=null ){
//            sb.append("CLOSEPRAC=").append(CLOSEPRAC).append("\n");
//        }
//        if(CSSNUMBER !=null && !CSSNUMBER .isEmpty() ){
//            sb.append("CSSNUMBER =").append(CSSNUMBER ).append("\n");
//        }
//        if(COMMA!=null && !COMMA.isEmpty() ){
//            sb.append("COMMA=").append(COMMA).append("\n");
//        }
//
//        sb.append("}");
//        return sb.toString();
//
//    }

}
