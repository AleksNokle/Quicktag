package quicktag.html;

import quicktag.data.Controller;

/**
 * Table contains a method that allows users to make a basic html table.
 */

public class Table implements Controller {

    /**
     * Creates a HTML5 table element with table rows (tr) and table data (td) inside. The split value determines
     * how many table data entries to put inside a single row before a new row is made. Ultimately the split value
     * can then be seen as the amount of columns in your table.
     * @param split The amount of columns in the table
     * @param args The data to be inserted into the table
     */

    public void table (int split, String ... args){

        data.setContent("\n<table>\n");

        for (int i = 0; i < args.length;){
            data.setContent("\n<tr>\n");
            for (int x = 0; x < split; x++){
                data.setContent("<td>" + args[i] + "</td>\n");
                i++;
            }
            data.setContent("</tr>\n");
        }

        data.setContent("\n</table>\n");

    }

}
