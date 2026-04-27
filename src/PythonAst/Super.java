package PythonAst;

public class Super {
//        : SUPER DOT ID OPENPRAC paramterlist CLOSEPRAC
   String SUPER;
   String DOT;
   String ID;
   String OPENPRAC;
   String CLOSEPRAC;
   ParameterList parameterList;

    public String getSUPER() {
        return SUPER;
    }

    public void setSUPER(String SUPER) {
        this.SUPER = SUPER;
    }

    public String getDOT() {
        return DOT;
    }

    public void setDOT(String DOT) {
        this.DOT = DOT;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getOPENPRAC() {
        return OPENPRAC;
    }

    public void setOPENPRAC(String OPENPRAC) {
        this.OPENPRAC = OPENPRAC;
    }

    public String getCLOSEPRAC() {
        return CLOSEPRAC;
    }

    public void setCLOSEPRAC(String CLOSEPRAC) {
        this.CLOSEPRAC = CLOSEPRAC;
    }

    public ParameterList getParameterList() {
        return parameterList;
    }

    public void setParameterList(ParameterList parameterList) {
        this.parameterList = parameterList;
    }
    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder("Super { \n");

        if (parameterList != null) {
            builder.append("ParameterList : ").append(parameterList).append("\n");
        }

        return builder.append(" }").toString();
    }
}
