package quicktag.html;

public class Build {

    /**
     *
     * @param args
     */

    public void nav(String ... args){
        String data = "";
        String ul = "";

        for (int i = 0; i < args.length; i++){
            if (i % 2 == 0){
                data += "<li><a href=\"" + args[i] + "\">";
            }
            else{
                data += args[i] + "</a></li>\n";
            }
        }

        ul += "\n<ul>\n" + data + "</ul>\n";

        //storage += ul;

    }

    /**
     *
     * @param id
     * @param args
     */

    public void navID(String id, String ... args){
        String data = "";
        String ul = "";

        for (int i = 0; i < args.length; i++){
            if (i % 2 == 0){
                data += "<li><a href=\"" + args[i] + "\">";
            }
            else{
                data += args[i] + "</a></li>\n";
            }
        }

        ul += "\n<ul id =\"" + id + "\">\n" + data + "</ul>\n";

        //storage += ul;

    }

    /**
     *
     * @param items
     * @param itemContent
     * @param gridArea
     */

    public void gridLayout(String items, String itemContent, String ... gridArea){
        String stuff = "";

        String[] convertedItems = items.split(" ");
        String[] convertedItemContent = itemContent.split(" ");
        String tempItems = "";
        String tempItemContent = "";

        for (int i = 0; i < convertedItems.length; i++){
            int count = i + 1;
            tempItems += ".item" + count + " { grid-area: " + convertedItems[i] + "; }\n";
            tempItemContent += "<div class=\"item" + count + "\">" + convertedItemContent[i] + "</div>\n";
        }

        String finalItemContent = "<div class=\"grid-container\">\n" + tempItemContent + "</div>";


        for (int i = 0; i < gridArea.length; i++){
            stuff += "'" + gridArea[i] + "'\n";
        }

        //style += tempItems;
        //style += "\n.grid-container {\ndisplay: grid;\ngrid-template-areas:\n" + stuff + ";\n}\n\n";
        //storage += finalItemContent;

    }

}
