package ASTHtml;

public class FullHtmlDocument extends Document{

    Doctypehtml doctypehtml;
    HtmlOpen htmlOpen;
    HtmlClose htmlClose;
    HeadSection headSection ;
    BodySection bodySection ;


    public Doctypehtml getDoctypehtml() {
        return doctypehtml;
    }

    public void setDoctypehtml(Doctypehtml doctypehtml) {
        this.doctypehtml = doctypehtml;
    }

    public HtmlOpen getHtmlOpen() {
        return htmlOpen;
    }

    public void setHtmlOpen(HtmlOpen htmlOpen) {
        this.htmlOpen = htmlOpen;
    }

    public HtmlClose getHtmlClose() {
        return htmlClose;
    }

    public void setHtmlClose(HtmlClose htmlClose) {
        this.htmlClose = htmlClose;
    }

    public HeadSection getHeadSection() {
        return headSection;
    }

    public void setHeadSection(HeadSection headSection) {
        this.headSection = headSection;
    }

    public BodySection getBodySection() {
        return bodySection;
    }

    public void setBodySection(BodySection bodySection) {
        this.bodySection = bodySection;
    }



    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder("FullHtmlDocument { \n");

        if(doctypehtml != null){
            builder.append("  Doctypehtml : " + " " + doctypehtml).append("\n");
        }
        if(htmlOpen != null){
            builder.append(" HtmlOpen : " + " " + htmlOpen).append("\n");
        }
        if(htmlClose!= null){
            builder.append("  HtmlClose : " + " " + htmlClose).append("\n");
        }
        if(headSection!= null){
            builder.append(" HeadSection : " + " " + headSection).append("\n");
        }
        if(bodySection!= null){
            builder.append("    BodySection : " + " " + bodySection).append("\n");
        }
        return builder + " }";
    }
}
