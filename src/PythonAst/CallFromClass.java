package PythonAst;

import java.util.ArrayList;

public class CallFromClass {
//       :ID DOT (call_function|ID) (EQUALS value)?

   ArrayList <String> ID =new ArrayList<>();
    String DOT;
    String EQUALS;
    Value value;
    Callfunction callfunction;

    public ArrayList<String> getID() {
        return ID;
    }

    public void setID(ArrayList<String> ID) {
        this.ID = ID;
    }

    public String getDOT() {
        return DOT;
    }

    public void setDOT(String DOT) {
        this.DOT = DOT;
    }

    public String getEQUALS() {
        return EQUALS;
    }

    public void setEQUALS(String EQUALS) {
        this.EQUALS = EQUALS;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public Callfunction getCallfunction() {
        return callfunction;
    }

    public void setCallfunction(Callfunction callfunction) {
        this.callfunction = callfunction;
    }
    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder("CallFromClass { \n");

        if (value != null) {
            builder.append("Value : ").append(value).append("\n");
        }

        if (callfunction != null) {
            builder.append("Callfunction : ").append(callfunction).append("\n");
        }

        return builder.append(" }").toString();
    }
}
