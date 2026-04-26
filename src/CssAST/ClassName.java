package CssAST;

import java.util.ArrayList;
import java.util.List;

public class ClassName {

    String DOT;
    String ID;
    CssTagName cssTagName ;
    String COLONE;
    Hov_Aft_Bef hovAftBef ;
    String OPENKPRA;
    List<CssContent>csscontent = new ArrayList<>();
    String CLOSEKPRA;


    public String getDOT() {
        return DOT;
    }

    public void setDOT(String DOT) {
        this.DOT = DOT;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public CssTagName getCssTagName() {
        return cssTagName;
    }

    public void setCssTagName(CssTagName cssTagName) {
        this.cssTagName = cssTagName;
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

    @Override
    public String toString() {
        StringBuilder builder=new StringBuilder("ClassName { \n");

        if(cssTagName!=null ){
            builder.append("cssTagName:"+" "+cssTagName).append("\n");
        }

        if(hovAftBef!=null){
            builder.append("hovAftBef : "+" "+hovAftBef).append("\n");
        }

        if(csscontent!=null && !csscontent.isEmpty()){
            builder.append("csscontent:"+" "+csscontent).append("\n");
        }


        return builder +" } ";

    }
}
