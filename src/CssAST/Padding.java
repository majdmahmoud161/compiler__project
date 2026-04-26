package CssAST;

import java.util.ArrayList;
import java.util.List;

public class Padding {
    String PADDING;
    String COLONE;
    List<String>CSSNUMBER = new ArrayList<>();
    List<String >UNIT = new ArrayList<>();
    String AUTO;
    String SEMICOLON;

    public String getPADDING() {
        return PADDING;
    }

    public void setPADDING(String PADDING) {
        this.PADDING = PADDING;
    }

    public String getCOLONE() {
        return COLONE;
    }

    public void setCOLONE(String COLONE) {
        this.COLONE = COLONE;
    }

    public List<String> getCSSNUMBER() {
        return CSSNUMBER;
    }

    public void setCSSNUMBER(List<String> CSSNUMBER) {
        this.CSSNUMBER = CSSNUMBER;
    }

    public List<String> getUNIT() {
        return UNIT;
    }

    public void setUNIT(List<String> UNIT) {
        this.UNIT = UNIT;
    }

    public String getAUTO() {
        return AUTO;
    }

    public void setAUTO(String AUTO) {
        this.AUTO = AUTO;
    }

    public String getSEMICOLON() {
        return SEMICOLON;
    }

    public void setSEMICOLON(String SEMICOLON) {
        this.SEMICOLON = SEMICOLON;
    }
//
//    @Override
//    public String toString() {
//        StringBuilder sb=new StringBuilder("Padding{\n");
//
//
//        if(PADDING!=null ){
//            sb.append("PADDING=").append(PADDING).append("\n");
//        }
//        if(UNIT!=null && !UNIT.isEmpty()){
//            sb.append("UNIT=").append(UNIT).append("\n");
//        }
//        if(AUTO!=null ){
//            sb.append("AUTO=").append(AUTO).append("\n");
//        }
//        if(COLONE!=null ){
//            sb.append("COLONE=").append(COLONE).append("\n");
//        }
//        if(CSSNUMBER!=null && !CSSNUMBER.isEmpty() ){
//            sb.append("CSSNUMBER=").append(CSSNUMBER).append("\n");
//        }
//        if(SEMICOLON!=null ){
//            sb.append("SEMICOLON=").append(SEMICOLON).append("\n");
//        }
//        sb.append("}");
//        return sb.toString();
//
//    }

}
