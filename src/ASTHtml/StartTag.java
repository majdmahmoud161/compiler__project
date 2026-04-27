package ASTHtml;

import java.util.ArrayList;
import java.util.List;

public class StartTag {

    String TAG_OPEN;
    String TAG_CLOSE;
    TagName tagName ;
    List<Attribute>attribute=new ArrayList<>();

    public String getTAG_OPEN() {
        return TAG_OPEN;
    }

    public void setTAG_OPEN(String TAG_OPEN) {
        this.TAG_OPEN = TAG_OPEN;
    }

    public String getTAG_CLOSE() {
        return TAG_CLOSE;
    }

    public void setTAG_CLOSE(String TAG_CLOSE) {
        this.TAG_CLOSE = TAG_CLOSE;
    }

    public TagName getTagName() {
        return tagName;
    }

    public void setTagName(TagName tagName) {
        this.tagName = tagName;
    }

    public List<Attribute> getAttribute() {
        return attribute;
    }

    public void setAttribute(List<Attribute> attribute) {
        this.attribute = attribute;
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder("StartTag { \n");

        if(tagName  != null){
            builder.append(" TagName : " + " " + tagName ).append("\n");
        }
        if(attribute != null){
            builder.append("attribute : " + " " + attribute).append("\n");
        }


        return builder + " }";
    }
}
