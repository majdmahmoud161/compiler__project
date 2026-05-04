package PythonAst;

import java.util.AbstractList;
import java.util.ArrayList;

public class ParameterList {

//    (value(COMMA value)*)*

    ArrayList<Value> values = new ArrayList<>();

    ArrayList<String> COMMA = new ArrayList<>();

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

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("ParameterList { \n");
        if(values != null){
            builder.append("Value : " + " " + values).append("\n");
        }

        return builder + " }";
    }
}
