package PythonAst;

import java.util.ArrayList;

public class For {
//    FOR ID IN RANGE OPENPRAC (INT|ID) CLOSEPRAC COLONE  (state)? (BREAK|CONTINUE)?;

    String FOR ;
    ArrayList<String> ID = new ArrayList<>();
    String IN;
    String RANGE;
    String OPENPRAC;
    String INT;
    String CLOSEPRAC;
    String COLONE;
    String BREAK;
    String CONTINUE;

    State state ;


    public String getFOR() {
        return FOR;
    }

    public void setFOR(String FOR) {
        this.FOR = FOR;
    }

    public ArrayList<String> getID() {
        return ID;
    }

    public void setID(ArrayList<String> ID) {
        this.ID = ID;
    }

    public String getIN() {
        return IN;
    }

    public void setIN(String IN) {
        this.IN = IN;
    }

    public String getRANGE() {
        return RANGE;
    }

    public void setRANGE(String RANGE) {
        this.RANGE = RANGE;
    }

    public String getOPENPRAC() {
        return OPENPRAC;
    }

    public void setOPENPRAC(String OPENPRAC) {
        this.OPENPRAC = OPENPRAC;
    }

    public String getINT() {
        return INT;
    }

    public void setINT(String INT) {
        this.INT = INT;
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

    public String getBREAK() {
        return BREAK;
    }

    public void setBREAK(String BREAK) {
        this.BREAK = BREAK;
    }

    public String getCONTINUE() {
        return CONTINUE;
    }

    public void setCONTINUE(String CONTINUE) {
        this.CONTINUE = CONTINUE;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("For { \n");

        if(state != null){
            builder.append("State : " + " " + state).append("\n");
        }

        return builder + "\n";
    }
}
