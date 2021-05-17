package quicktag.data;

public class Data {

    private String content = "";
    private String styling = "";
    private String currentContainer = "";
    private int generatedId = 0;

    private String htmlTitle = "<title>Default Title</title>";


    public String getContent(){
        return content;
    }

    public void setContent(String content){
        this.content += content;
    }

    public void clearContent(){
        this.content = "";
    }

    public String getStyling() {
        return styling;
    }

    public void setStyling(String styling) {
        this.styling += styling;
    }

    public void clearStyling(){
        this.styling = "";
    }

    public String generateId(){
        generatedId++;
        return "obj" + generatedId;
    }

    public String getGeneratedId(){
        return "obj" + generatedId;
    }

    public String getHtmlTitle() {
        return htmlTitle;
    }

    public void setHtmlTitle(String htmlTitle) {
        this.htmlTitle = htmlTitle;
    }

    public String getCurrentContainer(){
        return currentContainer;
    }

    public void setCurrentContainer(String container){
        this.currentContainer = container;
    }

    public void clearCurrentContainer(){
        this.currentContainer = "";
    }
}
