package PythonAst;

import java.util.ArrayList;

public class ConstructorDecler {
//    : DEF ID OPENPRAC (paramterlist) CLOSEPRAC COLONE state*
    String DEF;
    String ID;
    String OPENPRAC;
    String CLOSEPRAC;
    String COLONE;

    ParameterList parameterList;
    ArrayList<State>states= new ArrayList<>();

    public String getDEF() {
        return DEF;
    }

    public void setDEF(String DEF) {
        this.DEF = DEF;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
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

    public String getCOLONE() {
        return COLONE;
    }

    public void setCOLONE(String COLONE) {
        this.COLONE = COLONE;
    }

    public ParameterList getParameterList() {
        return parameterList;
    }

    public void setParameterList(ParameterList parameterList) {
        this.parameterList = parameterList;
    }

    public ArrayList<State> getStates() {
        return states;
    }

    public void setStates(ArrayList<State> states) {
        this.states = states;
    }
    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder("ConstructorDecler { \n");

        if (parameterList != null) {
            builder.append("ParameterList : ").append(parameterList).append("\n");
        }

        if (states != null && !states.isEmpty()) {
            builder.append("States : ").append(states).append("\n");
        }

        return builder.append(" }").toString();
    }
}
