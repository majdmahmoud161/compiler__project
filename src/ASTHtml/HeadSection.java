package ASTHtml;

import java.util.ArrayList;
import java.util.List;

public class HeadSection {

    String TAG_OPEN;
    List<String> HEAD_TAG = new ArrayList<>();
    List<String> TAG_CLOSE = new ArrayList<>();
    String TAG_OPEN_SLASH;
    Content content;

    public String getTAG_OPEN() {
        return TAG_OPEN;
    }

    public void setTAG_OPEN(String TAG_OPEN) {
        this.TAG_OPEN = TAG_OPEN;
    }

    public List<String> getHEAD_TAG() {
        return HEAD_TAG;
    }

    public void setHEAD_TAG(List<String> HEAD_TAG) {
        this.HEAD_TAG = HEAD_TAG;
    }

    public List<String> getTAG_CLOSE() {
        return TAG_CLOSE;
    }

    public void setTAG_CLOSE(List<String> TAG_CLOSE) {
        this.TAG_CLOSE = TAG_CLOSE;
    }

    public String getTAG_OPEN_SLASH() {
        return TAG_OPEN_SLASH;
    }

    public void setTAG_OPEN_SLASH(String TAG_OPEN_SLASH) {
        this.TAG_OPEN_SLASH = TAG_OPEN_SLASH;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }


    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder("HeadSection { \n");

        if(content != null){
            builder.append("content : " + " " + content).append("\n");
        }

        return builder + " }";
    }
}
