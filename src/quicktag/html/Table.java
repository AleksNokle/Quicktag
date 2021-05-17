package quicktag.html;

public class Table {

    /**
     *
     * @param split
     * @param args
     */

    public void table (int split, String ... args){

        int x;
        String content = "";
        String row = "";

        for (int i = 0; i < args.length;){
            for (x = 0; x < split; x++){
                content += "<th>" + args[i] + "</th>\n";
                i++;
            }
            row += "\n<tr>\n" + content + "</tr>\n";
            x = 0;
            content = "";
        }

        String table = "\n<table>" + row + "</table>\n";
        //storage += table;

    }

}
