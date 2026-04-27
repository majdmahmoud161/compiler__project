package PythonAst;

import java.util.ArrayList;

public class ClassDecler {
//      :CLASS ID COLONE class_body*
    String CLASS;
    String ID;
    String COLONE;
   ArrayList<ClassBody> classBodies= new ArrayList<>();

    public String getCLASS() {
        return CLASS;
    }

    public void setCLASS(String CLASS) {
        this.CLASS = CLASS;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getCOLONE() {
        return COLONE;
    }

    public void setCOLONE(String COLONE) {
        this.COLONE = COLONE;
    }

    public ArrayList<ClassBody> getClassBodies() {
        return classBodies;
    }

    public void setClassBodies(ArrayList<ClassBody> classBodies) {
        this.classBodies = classBodies;
    }
    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder("ClassBodies { \n");

        if (classBodies != null && !classBodies.isEmpty()) {
            builder.append("ClassBodies : ").append(classBodies).append("\n");
        }

        return builder.append(" }").toString();
    }
}
