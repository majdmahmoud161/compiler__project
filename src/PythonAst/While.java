package PythonAst;

public class While {

//    WHILE value COLONE  (BREAK|CONTINUE)? ;

    String WHILE;
    Value value ;

    String COLONE;
    String BREAK;

    String CONTINUE;
    State state ;

    public String getWHILE() {
        return WHILE;
    }

    public void setWHILE(String WHILE) {
        this.WHILE = WHILE;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public String getCOLONE() {
        return COLONE;
    }

    public void setCOLONE(String COLONE) {
        this.COLONE = COLONE;
    }

    public String getCONTINUE() {
        return CONTINUE;
    }

    public void setCONTINUE(String CONTINUE) {
        this.CONTINUE = CONTINUE;
    }

    public String getBREAK() {
        return BREAK;
    }

    public void setBREAK(String BREAK) {
        this.BREAK = BREAK;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("While { \n");
        if(value != null){
            builder.append("Value : " + " " + value).append("\n");
        }
        if (state != null){
            builder.append("State : " + " " + state).append("\n");
        }

        return builder + " }";
    }
}
