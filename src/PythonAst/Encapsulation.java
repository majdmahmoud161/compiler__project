package PythonAst;

public class Encapsulation {
    String PRIVATE;
    String PROTECTED;
    VarDecler varDecler;
    public String getPRIVATE() {
        return PRIVATE;
    }

    public void setPRIVATE(String PRIVATE) {
        this.PRIVATE = PRIVATE;
    }

    public String getPROTECTED() {
        return PROTECTED;
    }

    public void setPROTECTED(String PROTECTED) {
        this.PROTECTED = PROTECTED;
    }

    public VarDecler getVarDecler() {
        return varDecler;
    }

    public void setVarDecler(VarDecler varDecler) {
        this.varDecler = varDecler;
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder("Encapsulation { \n");

        if (varDecler != null) {
            builder.append("VarDecler : ").append(varDecler).append("\n");
        }

        return builder.append(" }").toString();
    }

}
