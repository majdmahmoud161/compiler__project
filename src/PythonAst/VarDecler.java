package PythonAst;

public class VarDecler {

    String ID;
    String EQUALS;

    Value value ;


    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
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


    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder("VarDecler { \n");

        if(value != null){
            builder.append("Value : " + " " + value).append("\n");
        }
        return  builder + " }" ;
    }
}
