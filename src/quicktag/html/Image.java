package quicktag.html;

import quicktag.data.Controller;

public class Image implements Controller {

    /**
     * Creates a HTML5 img element. Provide a source link or url for the image to add it to your page.
     * A generic ID will be automatically assigned to this element. See the documentation for further details on how the generic
     * ID system works.
     * @param source The url/source of your image
     */

    public void img (String source){
        data.setContent("<img id=\"" + data.generateId() + "\" src=\"" + source + "\">\n");
    }

    /**
     * Creates a HTML5 img element. Provide a source link or url for the image to add it to your page.
     * You can give the element an ID of your choice.
     * @param id The id you want for your HTML element
     * @param source The url/source of your image
     */

    public void img (String id, String source){
        data.setContent("<img id=\"" + id + "\"" + " src=\"" + source + "\">\n");
    }

    /**
     * Creates a HTML5 img element. Provide a source link or url for the image to add it to your page.
     * You can give the element an ID and an image title of your choice.
     * @param id The id you want for your HTML element
     * @param source The url/source of your image
     * @param alt The title of your image
     */

    public void img (String id, String source, String alt){
        data.setContent("<img id=\"" + id + "\"" + " src=\"" + source + "\"" + " alt=\"" + alt + "\">\n");
    }

}
