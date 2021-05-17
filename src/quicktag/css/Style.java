package quicktag.css;

import quicktag.data.Controller;

public class Style implements Controller {

    public void css (String ... args){

        for (int i = 0; i < args.length; i++){
            args[i] += ";";
        }

        String splitter = String.join("\n", args);

        data.setStyling("#" + data.getGeneratedId() + " {\n" + splitter + "\n}\n\n");
    }


    public void cssId (String id, String ... args){

        for (int i = 0; i < args.length; i++){
            args[i] += ";";
        }

        String splitter = String.join("\n", args);

        data.setStyling("#" + id + " {\n" + splitter + "\n}\n\n");
    }


    public void cssTarget (String target, String ... args){

        for (int i = 0; i < args.length; i++){
            args[i] += ";";
        }

        String splitter = String.join("\n", args);

        data.setStyling(target + " {\n" + splitter + "\n}\n\n");
    }
}
