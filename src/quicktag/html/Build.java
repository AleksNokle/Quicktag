package quicktag.html;

import quicktag.data.Controller;

/**
 * Build contains more advanced methods that allow you to make more complex html/css creations, but can be
 * more difficult to use.
 */

public class Build implements Controller {

    /**
     * Creates a navbar that consists of multiple HTML5 elements. The first argument given must be the
     * link or URL, and the argument after must be the title you want to give your link / URL.
     * Alternate this pattern for every link you want in your navbar.
     * See the documentation for examples on the more advanced Build methods.
     * @param args The first argument must be a URL, and the second must be the text you want for the URL.
     */

    public void nav(String ... args){

        data.setContent("\n<ul>\n");

        for (int i = 0; i < args.length; i++){
            if (i % 2 == 0){
                data.setContent("<li><a href=\"" + args[i] + "\">");
            }
            else{
                data.setContent(args[i] + "</a></li>\n");
            }
        }

        data.setContent("</ul>\n");

    }

    /**
     * Creates a navbar that consists of multiple HTML5 elements. The first argument given must be the
     * link or URL, and the argument after must be the title you want to give your link / URL.
     * Alternate this pattern for every link you want in your navbar.
     * See the documentation for examples on the more advanced Build methods.
     * You can give the navbar an ID of your choice.
     * @param id The id you want for your HTML element
     * @param args The first argument must be a URL, and the second must be the text you want for the URL.
     */

    public void navID(String id, String ... args){

        data.setContent("\n<ul id=\"" + id + "\">\n");

        for (int i = 0; i < args.length; i++){
            if (i % 2 == 0){
                data.setContent("<li><a href=\"" + args[i] + "\">");
            }
            else{
                data.setContent(args[i] + "</a></li>\n");
            }
        }

        data.setContent("</ul>\n");

    }

    /**
     * Creates a grid layout that consists of both HTML and CSS elements and properties.
     * The "items" String require you to specify all your item names in a single string, seperated by a whitespace
     * for each name (header menu main footer). The "itemContent" string is the content you want inside
     * your items, and must be supplied in the same way (HeaderContent MenuContent MainContent FooterContent).
     * Lastly, the gridArea is how you distribute your grid items around the page. Each argument you give here
     * can be seen as one row of a grid area distribution ("header header", "main main", "footer footer").
     * See the documentation for examples on the more advanced Build methods.
     * @param items The names of your grid items (i.e header menu main) seperated with a space
     * @param itemContent The content inside of your grid items seperated with a space
     * @param gridArea The area distribution of your grid items (i.e header header main main menu menu)
     */

    public void gridLayout(String items, String itemContent, String ... gridArea){
        String[] convertedItems = items.split(" ");
        String[] convertedItemContent = itemContent.split(" ");

        data.setContent("<div class=\"grid-container\">\n");

        for (int i = 0; i < convertedItems.length; i++){
            int count = i + 1;
            data.setStyling(".item" + count + " { grid-area: " + convertedItems[i] + "; }\n");
            data.setContent("<div class=\"item" + count + "\">" + convertedItemContent[i] + "</div>\n");
        }

        data.setContent("</div>");


        data.setStyling("\n.grid-container {\ndisplay: grid;\ngrid-template-areas:\n");
        for (String s : gridArea) {
            data.setStyling("'" + s + "'\n");
        }

    }

}
