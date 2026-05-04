package CssAST;

import java.util.ArrayList;
import java.util.List;

public class CssDocument extends ASTNode{

NameOfTag nameOfTag;
ClassName className;
IdName idName;

    public NameOfTag getNameOfTag() {
        return nameOfTag;
    }

    public void setNameOfTag(NameOfTag nameOfTag) {
        this.nameOfTag = nameOfTag;
    }

    public ClassName getClassName() {
        return className;
    }

    public void setClassName(ClassName className) {
        this.className = className;
    }

    public IdName getIdName() {
        return idName;
    }

    public void setIdName(IdName idName) {
        this.idName = idName;
    }

    @Override
    public String toString() {
        StringBuilder builder=new StringBuilder("CssDocument{\n");

        if(nameOfTag!=null ){
            builder.append("nameOfTag : " + " " + nameOfTag).append("\n");
        }
        if(className!=null ){
            builder.append("className : " + " "+ className).append("\n");
        }
        if(idName!=null ){
            builder.append("idName : " + " " + idName).append("\n");
        }

               return builder + "}";

    }

}
