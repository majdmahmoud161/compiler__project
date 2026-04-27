package ASTHtml;

import java.util.ArrayList;
import java.util.List;

public class TagsDocument extends Document {
    List<TagType>tagTypes=new ArrayList<>();
    List<String> TEXT = new ArrayList<>();


    public List<TagType> getTagTypes() {
        return tagTypes;
    }

    public void setTagTypes(List<TagType> tagTypes) {
        this.tagTypes = tagTypes;
    }

    public List<String> getTEXT() {
        return TEXT;
    }

    public void setTEXT(List<String> TEXT) {
        this.TEXT = TEXT;
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder("TagsDocument { \n");

        if(tagTypes != null){
            builder.append("tagTypes : " + " " + tagTypes).append("\n");
        }


        return builder + " }";
    }
}
