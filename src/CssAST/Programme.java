package CssAST;

import java.util.ArrayList;
import java.util.List;

public class Programme {
    List<CssDocument>cssDocuments=new ArrayList<>();

    public List<CssDocument> getCssDocuments() {
        return cssDocuments;
    }

    public void setCssDocuments(List<CssDocument> cssDocuments) {
        this.cssDocuments = cssDocuments;
    }
    public String toString() {
        StringBuilder builder=new StringBuilder("Programme{\n");

        if(cssDocuments!=null && !cssDocuments.isEmpty() ){
            builder.append("cssDocuments : " + " " + cssDocuments).append("\n");
        }

        return builder + "}";

    }
}
