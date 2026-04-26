package CssAST;

import java.util.ArrayList;
import java.util.List;

public class CssDocument extends ASTNode{
List<NameOfTag>nameOfTags = new ArrayList<>();
List<ClassName>classNames = new ArrayList<>();
List<IdName>idNames = new ArrayList<>();

    public List<NameOfTag> getNameOfTags() {
        return nameOfTags;
    }

    public void setNameOfTags(List<NameOfTag> nameOfTags) {
        this.nameOfTags = nameOfTags;
    }

    public List<ClassName> getClassNames() {
        return classNames;
    }

    public void setClassNames(List<ClassName> classNames) {
        this.classNames = classNames;
    }

    public List<IdName> getIdNames() {
        return idNames;
    }

    public void setIdNames(List<IdName> idNames) {
        this.idNames = idNames;
    }

    @Override
    public String toString() {
        StringBuilder builder=new StringBuilder("CssDocument{\n");

        if(nameOfTags!=null && !nameOfTags.isEmpty() ){
            builder.append("nameOfTags : " + " " + nameOfTags).append("\n");
        }
        if(classNames!=null && !classNames.isEmpty()){
            builder.append("classNames : " + " "+ classNames).append("\n");
        }
        if(idNames!=null && !idNames.isEmpty()){
            builder.append("idNames : " + " " + idNames).append("\n");
        }

               return builder + "}";

    }

}
