package quicktag.html;

import quicktag.data.Controller;

/**
 * Basic contains methods to make the most simple and common html elements.
 */

public class Basic implements Controller {

    /**
     * Creates a HTML5 paragraph element. The content of this paragraph will be the text string that is provided.
     * A generic ID will be automatically assigned to this element. See the documentation for further details on how the generic
     * ID system works.
     * @param text The text you want in your paragraph
     */

    public void p (String text){
        data.setContent("<p id=\"" + data.generateId() + "\">"  + text + "</p>\n");
    }

    /**
     * Creates a HTML5 paragraph element with an ID. The content of this paragraph will be the text string that the is provided.
     * You can give the element an ID of your choice.
     * @param id The id you want for your HTML element
     * @param text The text of your paragraph
     */

    public void p (String id, String text)  {
        data.setContent("<p id=\"" + id + "\">"  + text + "</p>\n");
    }

    /**
     * Creates a HTML5 heading element with the specified level.
     * Possible heading levels are 1 to 6 (h1 to h6).
     * The content of this heading will be the text string that is provided.
     * A generic ID will be automatically assigned to this element. See the documentation for further details on how the generic
     * ID system works.
     * @param level The level of your heading (1-6)
     * @param text The text of your heading
     */

    public void h (int level, String text){
        data.setContent("<h" + level + " id=\"" + data.generateId() + "\">" + text + "</h" + level + ">\n");
    }

    /**
     * Creates a HTML5 heading element with the specified level.
     * Possible heading levels are 1 to 6 (h1 to h6).
     * The content of this heading will be the text string that is provided.
     * You can give the element an ID of your choice.
     * @param id The id you want for your HTML element
     * @param level The level of your heading (1-6)
     * @param text The text of your heading
     */

    public void h (String id, int level, String text){
        data.setContent("<h" + level + " id=\"" + id + "\">"  + text + "</h" + level + ">\n");
    }

    /**
     * Creates a HTML5 footer element. The content of the footer will be the text string that is provided.
     * A generic ID will be automatically assigned to this element. See the documentation for further details on how the generic
     * ID system works.
     * @param text The text of your footer
     */

    public void footer (String text){
        data.setContent("\n<footer id=\"" + data.generateId() + "\">" + text + "</footer>\n");
    }

    /**
     * Creates a HTML5 footer element. The content of the footer will be the text string that is provided.
     * You can give the element an ID of your choice.
     * @param id The id you want for your HTML element
     * @param text The text of your footer
     */

    public void footer (String id, String text){
        data.setContent("\n<footer id=\"" + id + "\">" + text + "</footer>\n");
    }

    /**
     * Initializes a HTML5 break element. Creates a line break on your page (spacing).
     */

    public void br(){
        data.setContent("<br>\n");
    }

    /**
     * Sets the current title for your HTML page. This title will be used in the html page made by
     * any of the Write methods.
     * @param title The title of your page
     */

    public void title(String title){
        data.setHtmlTitle("<title>" + title + "</title>");
    }

}
