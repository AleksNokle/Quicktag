package quicktag.html;

import quicktag.data.Controller;

public class List implements Controller {

    /**
     * Creates a HTML5 ul element with li elements inside. Each argument represents the content of a single li element.
     * The li element(s) will be nested within a single unordered list (bullet point list).
     * @param args The content of the li element(s)
     */

    public void ul (String ... args){
        data.setContent("\n<ul>");

        for (String arg : args) {
            data.setContent("\n<li>" + arg + "</li>");
        }

        data.setContent("\n</ul>\n");
    }

    /**
     * Creates a HTML5 ul element with li elements inside. Each argument represents the content of a single li element.
     * The li element(s) will be nested within a single unordered list (bullet point list).
     * You can give the element an ID of your choice.
     * @param id The id you want for your HTML element
     * @param args The content of the li element
     */

    public void ulID (String id, String ... args){
        data.setContent("\n<ul id=\"" + id + "\">");

        for (String arg : args) {
            data.setContent("\n<li>" + arg + "</li>");
        }

        data.setContent("\n</ul>\n");

    }

    /**
     * Creates a HTML5 ol element with li elements inside. Each argument represents the content of a single li element.
     * The li element(s) will be nested within a single ordered list (numbered list).
     * @param args The content of the li element(s)
     */

    public void ol (String ... args){
        data.setContent("\n<ol>");

        for (String arg : args) {
            data.setContent("\n<li>" + arg + "</li>");
        }

        data.setContent("\n</ol>\n");

    }

    /**
     * Creates a HTML5 ol element with li elements inside. Each argument represents the content of a single li element.
     * The li element(s) will be nested within a single ordered list (numbered list).
     * You can give the element an ID of your choice.
     * @param id The id you want for your HTML element
     * @param args The content of the li element
     */

    public void olID (String id, String ... args){
        data.setContent("\n<ol id=\"" + id + "\">");

        for (String arg : args) {
            data.setContent("\n<li>" + arg + "</li>");
        }

        data.setContent("\n</ol>\n");
    }

    /**
     * Creates a HTML5 list element for every argument given. Regular HTML conventions dictate that you should not
     * make li elements without a wrapper like ol or ul however.
     * @param args
     */

    public void li (String ... args){

        for (String arg : args) {
            data.setContent("\n<li>" + arg + "</li>");
        }

    }

}
