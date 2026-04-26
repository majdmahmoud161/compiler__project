package CssAST;

import java.util.ArrayList;
import java.util.List;

public class IdName {
    String ID_SELECTOR;
    String ID;
    String OPENKPRA ;
    List<CssContent> csscontent = new ArrayList<>();
    String CLOSEKPRA;

    public String getID_SELECTOR() {
        return ID_SELECTOR;
    }

    public void setID_SELECTOR(String ID_SELECTOR) {
        this.ID_SELECTOR = ID_SELECTOR;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
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
        StringBuilder builder=new StringBuilder("IdName{\n");


        if(csscontent!=null && !csscontent.isEmpty()){
            builder.append("csscontent : " + " " + csscontent).append("\n");
        }

        return builder + "}";

    }
}
