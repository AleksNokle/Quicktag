package quicktag.html;

import quicktag.data.Controller;

/**
 * Link contains a single method that allow you to make a standard html link element.
 */

public class Link implements Controller {

    /**
     * Creates a HTML5 hyperlink (a href) element. Provide the url/path for the link, and then the text of the link.
     * @param url The path your link will lead to
     * @param text The text your link will display
     */

    public void a (String url, String text){
        data.setContent("<a href=\"" + url + "\">" + text + "</a>\n");
    }

}
