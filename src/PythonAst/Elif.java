package PythonAst;

public class Elif {
//     ELIF exp COLONE  (state)?  (else)? ;

    String ELIF;
    Exp exp ;
    String COLONE;
    State state ;
    Else anElse ;

    public String getELIF() {
        return ELIF;
    }

    public void setELIF(String ELIF) {
        this.ELIF = ELIF;
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

    public Else getAnElse() {
        return anElse;
    }

    public void setAnElse(Else anElse) {
        this.anElse = anElse;
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder("Elif { \n");
        if(exp != null){
            builder.append("Exp : " + " " + exp).append("\n");
        }
        if(state != null){
            builder.append("State : " + " " + state).append("\n");
        }
        if(anElse != null){
            builder.append("Else : " + " " + anElse).append("\n");
        }

        return builder + " }";
    }
}
