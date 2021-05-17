package quicktag.html;

import quicktag.data.Controller;

public class Container implements Controller {

    /**
     * Initializes a HTML5 div container. Any generic container can then be closed by calling close() afterwards.
     * Elements that you want to put inside this container need to be created after this method is called, but before close() is called (inbetween).
     * A generic ID will be automatically assigned to this element. See the documentation for further details on how the generic
     * ID system works.
     */

    public void div(){
        data.setContent("\n<div id=\"" + data.generateId() + "\">\n");
        data.setCurrentContainer("<div>");
    }

    /**
     * Initializes a HTML5 div container. Any generic container can then be closed by calling close() afterwards.
     * Elements that you want to put inside this container need to be created after this method is called, but before close() is called (inbetween).
     * You can give the element an ID of your choice.
     * @param id The id you want for your HTML element
     */

    public void div(String id){
        data.setContent("\n<div id=\"" + id + "\">\n");
        data.setCurrentContainer("<div>");
    }


    /**
     *
     */

    public void main() {
        data.setContent("\n<main>\n");
        data.setCurrentContainer("<main>");
    }

    /**
     *
     * @param id
     */

    public void main (String id){
        data.setContent("\n<main id=\"" + id + "\">\n");
        data.setCurrentContainer("<main>");
    }

    /**
     *
     */

    public void section(){
        data.setContent("\n<section>\n");
        data.setCurrentContainer("<section>");
    }

    /**
     *
     * @param id
     */

    public void section (String id){
        data.setContent("\n<section id=\"" + id + "\">\n");
        data.setCurrentContainer("<section>");
    }

    /**
     *
     */

    public void article(){
        data.setContent("\n<article>\n");
        data.setCurrentContainer("<article>");
    }

    /**
     *
     * @param id
     */

    public void article(String id){
        data.setContent("\n<article id=\"" + id + "\">\n");
        data.setCurrentContainer("<article>");

    }

    /**
     *
     */

    public void header (){
        data.setContent("\n<header>\n");
        data.setCurrentContainer("<header>");
    }

    /**
     *
     * @param id
     */

    public void header (String id){
        data.setContent("\n<header id=\"" + id + "\">\n");
        data.setCurrentContainer("<header>");
    }

    /**
     * A generic closing method for containers. Any containers initialized can and should be closed eventually
     * by calling on this method.
     * Any opened container must be closed before you can open a new container.
     * Any elements created inbetween a container & close statement will be nested
     * inside the container.
     */

    public void close (){
        if (data.getCurrentContainer().contains("<div>")){
            data.setContent("\n</div>\n");
        }
        else if (data.getCurrentContainer().contains("main")){
            data.setContent("\n</main>\n");
        }
        else if (data.getCurrentContainer().contains("section")){
            data.setContent("\n</section>\n");
        }
        else if (data.getCurrentContainer().contains("article")){
            data.setContent("\n</article>\n");
        }
        else if (data.getCurrentContainer().contains("header")){
            data.setContent("\n</header>\n");
        }

        data.clearCurrentContainer();
    }

}
