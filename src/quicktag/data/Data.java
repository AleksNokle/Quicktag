package quicktag.data;

/**
 * Data contains the variables that handle and store the html/css information.
 */

public class Data {

    private String content = "";
    private String styling = "";
    private String currentContainer = "";
    private int generatedId = 0;

    private String htmlTitle = "<title>Default Title</title>";

    /**
     * Gets the "content" variable, which stores all the HTML data.
     * @return content
     */

    public String getContent(){
        return content;
    }

    /**
     * Appends new data to the "content" variable.
     * @param content The variable that stores all HTML data
     */

    public void setContent(String content){
        this.content += content;
    }

    /**
     * Clears all data stored in the "content" variable. Used at the end of write methods so that data
     * does not carry over to new html pages.
     */

    public void clearContent(){
        this.content = "";
    }

    /**
     * Gets the "styling" variable, which stores all the CSS data.
     * @return styling
     */

    public String getStyling() {
        return styling;
    }

    /**
     * Appends new data to the "styling" variable.
     * @param styling The variable that stores all CSS data
     */

    public void setStyling(String styling) {
        this.styling += styling;
    }

    /**
     * Clears all data stored in the "styling" variable. Used at the end of write methods so that data
     * does not carry over to new css pages.
     */

    public void clearStyling(){
        this.styling = "";
    }

    /**
     * All the Basic HTML elements that are not given an ID by the user, will call on this method to
     * generate a new ID automatically in this format: obj1, obj2, obj3, obj4 ...
     * @return A generated id for HTML elements
     */

    public String generateId(){
        generatedId++;
        return "obj" + generatedId;
    }

    /**
     * Gets the most recently generated ID. Used by the Style method "css" to style elements that
     * were not given an ID by the user.
     * @return The most recently generated ID
     */

    public String getGeneratedId(){
        return "obj" + generatedId;
    }

    /**
     * Gets the current title of the HTML page.
     * @return htmlTitle
     */

    public String getHtmlTitle() {
        return htmlTitle;
    }

    /**
     * Sets the title of the HTML page that will be used by the Write methods.
     * @param htmlTitle The current title
     */

    public void setHtmlTitle(String htmlTitle) {
        this.htmlTitle = htmlTitle;
    }

    /**
     * Gets the current most recently opened container type. The "close" method in Container will use this to
     * close the most recently opened container.
     * @return currentContainer
     */

    public String getCurrentContainer(){
        return currentContainer;
    }

    /**
     * Used by the Container methods, as they will set currentContainer to be their own container type.
     * (i.e the "div" method will set the currentContainer type to "div".)
     * @param container The type of the most recent container
     */

    public void setCurrentContainer(String container){
        this.currentContainer = container;
    }

    /**
     * Clears the current container type when a container is closed.
     */

    public void clearCurrentContainer(){
        this.currentContainer = "";
    }
}
