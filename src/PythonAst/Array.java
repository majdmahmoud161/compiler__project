package PythonAst;

import java.util.ArrayList;

public class Array {

    //(ID)? OPENSQUER (value(COMMA value)*)* CLOSESQUER ;

    String ID;

    String OPENSQUER;

    ArrayList<Value> values = new ArrayList<>();

    ArrayList<String> COMMA = new ArrayList<>();

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

    public ArrayList<Value> getValues() {
        return values;
    }

    public void setValues(ArrayList<Value> values) {
        this.values = values;
    }

    public ArrayList<String> getCOMMA() {
        return COMMA;
    }

    public void setCOMMA(ArrayList<String> COMMA) {
        this.COMMA = COMMA;
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

        if(!values.isEmpty()){
            builder.append("Value : " + " " + values).append("\n");
        }

        return builder + " }";

    }
}
