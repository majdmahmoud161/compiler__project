package PythonAst;

import java.util.ArrayList;

public class Inheritance {
//       : CLASS ID OPENPRAC ID CLOSEPRAC COLONE (super)? (class_body)*

    String CLASS;
    ArrayList<String> ID= new ArrayList<>();
    String OPENPRAC;
    String CLOSEPRAC;
   String COLONE;
   Super aSuper;
   ArrayList<ClassBody> classBodies=new ArrayList<>();

    public String getCLASS() {
        return CLASS;
    }

    public void setCLASS(String CLASS) {
        this.CLASS = CLASS;
    }

    public ArrayList<String> getID() {
        return ID;
    }

    public void setID(ArrayList<String> ID) {
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

    public String getCOLONE() {
        return COLONE;
    }

    public void setCOLONE(String COLONE) {
        this.COLONE = COLONE;
    }

    public Super getaSuper() {
        return aSuper;
    }

    public void setaSuper(Super aSuper) {
        this.aSuper = aSuper;
    }

    public ArrayList<ClassBody> getClassBodies() {
        return classBodies;
    }

    public void setClassBodies(ArrayList<ClassBody> classBodies) {
        this.classBodies = classBodies;
    }
    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder("Inheritance { \n");

        if (aSuper != null) {
            builder.append("Super : ").append(aSuper).append("\n");
        }

        if (classBodies != null && !classBodies.isEmpty()) {
            builder.append("ClassBodies : ").append(classBodies).append("\n");
        }

        return builder.append(" }").toString();
    }
}
