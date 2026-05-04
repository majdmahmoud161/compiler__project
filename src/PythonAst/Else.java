package PythonAst;

public class Else {

//    ELSE COLONE  (state)? ;;

    String ELSE;
    String COLONE;
    State state;

    public String getELSE() {
        return ELSE;
    }

    public void setELSE(String ELSE) {
        this.ELSE = ELSE;
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

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("Else { \n");
        if(state != null){
            builder.append("State : " + " " + state).append("\n");
        }

        return builder + " }";
    }
}
