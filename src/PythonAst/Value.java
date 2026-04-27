package PythonAst;

public class Value {

    //INT|DOUBLE|STRING|TRUEBOOL|FALSEBOOL|ID;

    String INT;
    String DOUBLE;

    String STRING;

    String TRUBOOL;

    String FALSEBOOL;

    String ID;

    public String getINT() {
        return INT;
    }

    public void setINT(String INT) {
        this.INT = INT;
    }

    public String getDOUBLE() {
        return DOUBLE;
    }

    public void setDOUBLE(String DOUBLE) {
        this.DOUBLE = DOUBLE;
    }

    public String getSTRING() {
        return STRING;
    }

    public void setSTRING(String STRING) {
        this.STRING = STRING;
    }

    public String getTRUBOOL() {
        return TRUBOOL;
    }

    public void setTRUBOOL(String TRUBOOL) {
        this.TRUBOOL = TRUBOOL;
    }

    public String getFALSEBOOL() {
        return FALSEBOOL;
    }

    public void setFALSEBOOL(String FALSEBOOL) {
        this.FALSEBOOL = FALSEBOOL;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
}
