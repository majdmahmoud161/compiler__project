package PythonAst;

import java.util.ArrayList;

public class FunctionDecler {

//    DEF ID OPENPRAC (ID(COMMA ID)*)* CLOSEPRAC COLONE (state)? return?;

    String DEF;

    ArrayList<String> ID = new ArrayList<>();
    ArrayList<String> COMMA = new ArrayList<>();

    String  OPENPRAC;
    String CLOSEPRAC ;
    String COLONE ;
    State state;
    Return aReturn;

    public String getDEF() {
        return DEF;
    }

    public void setDEF(String DEF) {
        this.DEF = DEF;
    }

    public ArrayList<String> getID() {
        return ID;
    }

    public void setID(ArrayList<String> ID) {
        this.ID = ID;
    }

    public ArrayList<String> getCOMMA() {
        return COMMA;
    }

    public void setCOMMA(ArrayList<String> COMMA) {
        this.COMMA = COMMA;
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

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Return getaReturn() {
        return aReturn;
    }

    public void setaReturn(Return aReturn) {
        this.aReturn = aReturn;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("FunctionDecler { \n");
        if(state != null){
            builder.append("State : " + " " + state).append("\n");
        }
        if(aReturn != null){
            builder.append("Return : " + " " + aReturn).append("\n");
        }

        return builder + " }";
    }
}
