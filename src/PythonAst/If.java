package PythonAst;

public class If {
//    IF exp COLONE  (state)? (el_if)?

    String IF;
    Exp exp ;
    String COLONE;
    State state ;
    Elif elif;

    public String getIF() {
        return IF;
    }

    public void setIF(String IF) {
        this.IF = IF;
    }

    public Exp getExp() {
        return exp;
    }

    public void setExp(Exp exp) {
        this.exp = exp;
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

    public Elif getElif() {
        return elif;
    }

    public void setElif(Elif elif) {
        this.elif = elif;
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder("IF { \n");

        if(exp != null){
            builder.append("Exp : " + " " + exp).append("\n");
        }
        if(state != null){
            builder.append("State : " + " " + state).append("\n");
        }
        if(elif != null){
            builder.append("Elif : " + " " + elif).append("\n");
        }

        return builder + " }";
    }
}
