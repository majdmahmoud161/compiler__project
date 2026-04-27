package PythonAst;

public class Loop {

    For aFor ;

    While aWhile ;

    public For getaFor() {
        return aFor;
    }

    public void setaFor(For aFor) {
        this.aFor = aFor;
    }

    public While getaWhile() {
        return aWhile;
    }

    public void setaWhile(While aWhile) {
        this.aWhile = aWhile;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("Loop { \n");
        if(aFor != null){
            builder.append("For : " + " " + aFor).append("\n");
        }
        if(aWhile != null){
            builder.append("While : " + " " + aWhile).append("\n");
        }

        return builder + " }" ;
    }
}
