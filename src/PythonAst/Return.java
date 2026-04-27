package PythonAst;

public class Return {
//    RETURN value

    String RETURN;

    Value value;

    public String getRETURN() {
        return RETURN;
    }

    public void setRETURN(String RETURN) {
        this.RETURN = RETURN;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    @Override
    public String toString() {
        StringBuilder  builder = new StringBuilder("Return { \n");
        if(value != null){
            builder.append("Value : " + " " + value ).append("\n");
        }
        return builder + " }";
    }
}
