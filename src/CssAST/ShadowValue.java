package CssAST;

import java.util.ArrayList;
import java.util.List;

public class ShadowValue {
    String CSSNUMBER;
    String UNIT;
    Rgba rgba;

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

    public Rgba getRgba() {
        return rgba;
    }

    public void setRgba(Rgba rgba) {
        this.rgba = rgba;
    }

    @Override
    public String toString() {
        StringBuilder builder=new StringBuilder("ShadowValue{\n");
        if(rgba!=null ){
            builder.append("rgba : " + " " + rgba).append("\n");
        }
        return builder + " } " ;

    }

}
