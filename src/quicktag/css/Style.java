package quicktag.css;

import quicktag.data.Controller;

/**
 * Style contains all of the css/styling methods.
 */

public class Style implements Controller {

    /**
     * The standard method of styling objects with no unique ID required. The Basic HTML objects will
     * have an automatically generated ID if a unique ID is not given. This method can be used to style
     * these objects if called right after their creation, as it will pick up their generated ID.
     * Arguments must be given in this manner: font-size: 20px
     * @param args The css attribute and its value (i.e color: red)
     */

    public void css (String ... args){

        for (int i = 0; i < args.length; i++){
            args[i] += ";";
        }

        String splitter = String.join("\n", args);

        data.setStyling("#" + data.getGeneratedId() + " {\n" + splitter + "\n}\n\n");
    }

    /**
     * Style objects by their specific ID. Supply the same ID that you have given to a HTML element, and you
     * can style that particular element. Arguments for styling must be given the same way as the default
     * CSS method. (i.e color: purple)
     * @param id The id of the element you want to style
     * @param args The css attribute and its value (i.e color: red)
     */

    public void cssId (String id, String ... args){

        for (int i = 0; i < args.length; i++){
            args[i] += ";";
        }

        String splitter = String.join("\n", args);

        data.setStyling("#" + id + " {\n" + splitter + "\n}\n\n");
    }

    /**
     * This style method gives you free access to style any specific thing. The supplied "target" can be
     * an ID (#myElement1), a class (.myClass1) or an entire HTML tag (body). You can use this method to
     * create styling for any target, but the target is then dependant on the correct CSS syntax.
     * ID = #    Class = .   Tag = body, head ...
     * Styling arguments must be given in the same format as the default css method.
     * @param target The target of your styling (i.e #myId1 or .myClass1)
     * @param args The css attribute and its value (i.e color: red)
     */

    public void cssTarget (String target, String ... args){

        for (int i = 0; i < args.length; i++){
            args[i] += ";";
        }

        String splitter = String.join("\n", args);

        data.setStyling(target + " {\n" + splitter + "\n}\n\n");
    }
}
