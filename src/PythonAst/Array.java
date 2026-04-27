package PythonAst;

import java.util.ArrayList;

public class Array {

    //(ID)? OPENSQUER (value(COMMA value)*)* CLOSESQUER ;

    String ID;

    String OPENSQUER;

    ParameterList parameterList;

    String CLOSESQUER;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getOPENSQUER() {
        return OPENSQUER;
    }

    public void setOPENSQUER(String OPENSQUER) {
        this.OPENSQUER = OPENSQUER;
    }



    public String getCLOSESQUER() {
        return CLOSESQUER;
    }

    public void setCLOSESQUER(String CLOSESQUER) {
        this.CLOSESQUER = CLOSESQUER;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("Array { \n");

        if(parameterList != null){
            builder.append("Value : " + " " + parameterList).append("\n");
        }

        return builder + " }";

    }
}
