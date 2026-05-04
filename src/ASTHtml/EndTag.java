package ASTHtml;

public class EndTag {

    String TAG_OPEN_SLASH;
    String TAG_CLOSE;
    TagName tagName;

    public String getTAG_OPEN_SLASH() {
        return TAG_OPEN_SLASH;
    }

    public void setTAG_OPEN_SLASH(String TAG_OPEN_SLASH) {
        this.TAG_OPEN_SLASH = TAG_OPEN_SLASH;
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


    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder("EndTag{ \n");

        if(tagName!= null){
            builder.append(" TagName: " + " " + tagName).append("\n");
        }


        return builder + " }";
    }
}
