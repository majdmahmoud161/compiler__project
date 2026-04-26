package CssAST;

public class MarginValue {
    String CSSNUMBER;
    String UNIT;
    String AUTO;

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

    public String getAUTO() {
        return AUTO;
    }

    public void setAUTO(String AUTO) {
        this.AUTO = AUTO;
    }
//
//    @Override
//    public String toString() {
//        StringBuilder sb=new StringBuilder("MarginValue{\n");
//
//
//        if(CSSNUMBER!=null ){
//            sb.append("CSSNUMBER=").append(CSSNUMBER).append("\n");
//        }
//        if(UNIT!=null ){
//            sb.append("UNIT=").append(UNIT).append("\n");
//        }
//        if(AUTO!=null ){
//            sb.append("AUTO=").append(AUTO).append("\n");
//        }
//
//        sb.append("}");
//        return sb.toString();
//
//    }
}
