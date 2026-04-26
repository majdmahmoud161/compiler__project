package CssAST;

import java.util.ArrayList;
import java.util.List;

public class NameOfTag {

List<String > Comma = new ArrayList<>();

List<CssTagName> cssTagNames = new ArrayList<>();

String OPENKPRA ;

List<CssContent> csscontent = new ArrayList<>();

String CLOSEKPRA;

String COLONE;

Hov_Aft_Bef hovAftBef ;


    public List<String> getComma() {
        return Comma;
    }

    public void setComma(List<String> comma) {
        Comma = comma;
    }

    public List<CssTagName> getCssTagNames() {
        return cssTagNames;
    }

    public void setCssTagNames(List<CssTagName> cssTagNames) {
        this.cssTagNames = cssTagNames;
    }

    public String getOPENKPRA() {
        return OPENKPRA;
    }

    public void setOPENKPRA(String OPENKPRA) {
        this.OPENKPRA = OPENKPRA;
    }

    public List<CssContent> getCsscontent() {
        return csscontent;
    }

    public void setCsscontent(List<CssContent> csscontent) {
        this.csscontent = csscontent;
    }

    public String getCLOSEKPRA() {
        return CLOSEKPRA;
    }

    public void setCLOSEKPRA(String CLOSEKPRA) {
        this.CLOSEKPRA = CLOSEKPRA;
    }

    public String getCOLONE() {
        return COLONE;
    }

    public void setCOLONE(String COLONE) {
        this.COLONE = COLONE;
    }

    public Hov_Aft_Bef getHovAftBef() {
        return hovAftBef;
    }

    public void setHovAftBef(Hov_Aft_Bef hovAftBef) {
        this.hovAftBef = hovAftBef;
    }


    public String toString() {
        StringBuilder builder=new StringBuilder("NameOfTag{\n");
        if(csscontent!=null && !csscontent.isEmpty()){
            builder.append("csscontent : " + " " +csscontent).append("\n");
        }
        if(cssTagNames!=null && !cssTagNames.isEmpty()){
            builder.append("cssTagNames : " +  " " +cssTagNames).append("\n");
        }
        if(hovAftBef!=null){
            builder.append("Hov_Aft_Bef : " + " " + hovAftBef).append("\n");
        }
        return builder +" } ";
    }

}
