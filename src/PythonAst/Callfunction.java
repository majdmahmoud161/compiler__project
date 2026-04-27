package PythonAst;

public class Callfunction {
    String ID;
    BuildInFunction buildInFunction;
    String OPENPRAC;
    String CLOSEPRAC;
    ParameterList parameterList;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public BuildInFunction getBuildInFunction() {
        return buildInFunction;
    }

    public void setBuildInFunction(BuildInFunction buildInFunction) {
        this.buildInFunction = buildInFunction;
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
}

