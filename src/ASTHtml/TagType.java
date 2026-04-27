package ASTHtml;
public class TagType {

    StartTag startTag;
    Content content;
    EndTag endTag;
    SelfClosingTag selfClosingTag ;


    public StartTag getStartTag() {
        return startTag;
    }
    public void setStartTag(StartTag startTag) {
        this.startTag = startTag;
    }
    public Content getContent() {
        return content;
    }
    public void setContent(Content content) {
        this.content = content;
    }
    public EndTag getEndTag() {
        return endTag;
    }

    public void setEndTag(EndTag endTag) {
        this.endTag = endTag;
    }

    public SelfClosingTag getSelfClosingTag() {
        return selfClosingTag;
    }

    public void setSelfClosingTag(SelfClosingTag selfClosingTag) {
        this.selfClosingTag = selfClosingTag;
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder("TagType { \n");

        if(startTag != null){
            builder.append("  StartTag: " + " " + startTag).append("\n");
        }
        if(content != null){
            builder.append("  Content : " + " " + content).append("\n");
        }
        if(endTag != null){
            builder.append("    EndTag : " + " " + endTag).append("\n");
        }
        if(selfClosingTag != null){
            builder.append(" SelfClosingTag : " + " " + selfClosingTag).append("\n");
        }

        return builder + " }";
    }
}
