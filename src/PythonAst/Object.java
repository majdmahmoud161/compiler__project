package PythonAst;

import java.util.ArrayList;

public class Object {
//       : ID EQUALS ID OPENPRAC (paramterlist) CLOSEPRAC

    ArrayList<String> ID= new ArrayList<>();
    String EQUALS;
    String OPENPRAC;
    String CLOSEPRAC;
    ParameterList parameterList;


    public ArrayList<String> getID() {
        return ID;
    }

    public void setID(ArrayList<String> ID) {
        this.ID = ID;
    }

    public String getEQUALS() {
        return EQUALS;
    }

    public void setEQUALS(String EQUALS) {
        this.EQUALS = EQUALS;
    }

    public String getOPENPRAC() {
        return OPENPRAC;
    }

    public void setOPENPRAC(String OPENPRAC) {
        this.OPENPRAC = OPENPRAC;
    }

    public String getCLOSEPRAC() {
        return CLOSEPRAC;
    }

    public void setCLOSEPRAC(String CLOSEPRAC) {
        this.CLOSEPRAC = CLOSEPRAC;
    }

    public ParameterList getParameterList() {
        return parameterList;
    }

    public void setParameterList(ParameterList parameterList) {
        this.parameterList = parameterList;
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder("Object { \n");

        if (parameterList != null) {
            builder.append("ParameterList : ").append(parameterList).append("\n");
        }

        return builder.append(" }").toString();
    }
}
