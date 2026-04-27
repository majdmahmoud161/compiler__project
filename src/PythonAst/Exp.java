package PythonAst;

import java.util.ArrayList;

public class Exp {
    String POW;
    String MULT;
    String DIVISION;
    String MOD;
    String SUM;
    String SUB;
    String EQUALS;
    String ISEQUALS;
    String GRATER;
    String SMALLER;
    String OR;
    String AND;
    String IS;
    String INT;
    String DOT;
    String STRING;
    String TRUEBOOL;
    String FALSEBOOL;
    String NONE;
    Array ARRAY;
    ArrayList<String>Id = new ArrayList<>();

    public String getPOW() {
        return POW;
    }

    public void setPOW(String POW) {
        this.POW = POW;
    }

    public String getMULT() {
        return MULT;
    }

    public void setMULT(String MULT) {
        this.MULT = MULT;
    }

    public String getDIVISION() {
        return DIVISION;
    }

    public void setDIVISION(String DIVISION) {
        this.DIVISION = DIVISION;
    }

    public String getMOD() {
        return MOD;
    }

    public void setMOD(String MOD) {
        this.MOD = MOD;
    }

    public String getSUM() {
        return SUM;
    }

    public void setSUM(String SUM) {
        this.SUM = SUM;
    }

    public String getSUB() {
        return SUB;
    }

    public void setSUB(String SUB) {
        this.SUB = SUB;
    }

    public String getEQUALS() {
        return EQUALS;
    }

    public void setEQUALS(String EQUALS) {
        this.EQUALS = EQUALS;
    }

    public String getISEQUALS() {
        return ISEQUALS;
    }

    public void setISEQUALS(String ISEQUALS) {
        this.ISEQUALS = ISEQUALS;
    }

    public String getGRATER() {
        return GRATER;
    }

    public void setGRATER(String GRATER) {
        this.GRATER = GRATER;
    }

    public String getSMALLER() {
        return SMALLER;
    }

    public void setSMALLER(String SMALLER) {
        this.SMALLER = SMALLER;
    }

    public String getOR() {
        return OR;
    }

    public void setOR(String OR) {
        this.OR = OR;
    }

    public String getAND() {
        return AND;
    }

    public void setAND(String AND) {
        this.AND = AND;
    }

    public String getIS() {
        return IS;
    }

    public void setIS(String IS) {
        this.IS = IS;
    }

    public String getINT() {
        return INT;
    }

    public void setINT(String INT) {
        this.INT = INT;
    }

    public String getDOT() {
        return DOT;
    }

    public void setDOT(String DOT) {
        this.DOT = DOT;
    }

    public String getSTRING() {
        return STRING;
    }

    public void setSTRING(String STRING) {
        this.STRING = STRING;
    }

    public String getTRUEBOOL() {
        return TRUEBOOL;
    }

    public void setTRUEBOOL(String TRUEBOOL) {
        this.TRUEBOOL = TRUEBOOL;
    }

    public String getFALSEBOOL() {
        return FALSEBOOL;
    }

    public void setFALSEBOOL(String FALSEBOOL) {
        this.FALSEBOOL = FALSEBOOL;
    }

    public String getNONE() {
        return NONE;
    }

    public void setNONE(String NONE) {
        this.NONE = NONE;
    }

    public Array getARRAY() {
        return ARRAY;
    }

    public void setARRAY(Array ARRAY) {
        this.ARRAY = ARRAY;
    }

    public ArrayList<String> getId() {
        return Id;
    }

    public void setId(ArrayList<String> id) {
        Id = id;
    }
    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder("Exp { \n");

        if (ARRAY != null) {
            builder.append("Array : ").append(ARRAY).append("\n");
        }

        return builder.append(" }").toString();
    }
}
