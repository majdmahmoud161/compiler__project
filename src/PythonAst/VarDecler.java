package PythonAst;

public class VarDecler {

    String ID;
    String EQUALS;

    Value value ;

    Array array ;

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

    public Array getArray() {
        return array;
    }

    public void setArray(Array array) {
        this.array = array;
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder("VarDecler { \n");
        if(array != null){
            builder.append("Array : " + " " + array).append("\n");
        }
        if(value != null){
            builder.append("Value : " + " " + value).append("\n");
        }
        return  builder + " }" ;
    }
}
