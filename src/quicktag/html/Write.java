package quicktag.html;

import quicktag.data.Controller;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Write has methods that allow you to finalize your content, and write your html/css to their respective pages.
 */

public class Write implements Controller {

    /**
     * When this method is called, all the previous content that you have made above this method call will be written to
     * an automatically generated html-file "index.html", and a css-file "styles.css" respectively.
     * This is the quick write method, so you will not be able to name your html and css files.
     * See the documentation for further details on how the write methods work.
     * @throws IOException Will happen if the files cannot be made and/or written to
     */

    public void quick() throws IOException {
        BufferedWriter htmlWriter = new BufferedWriter(new FileWriter("index.html"));
        BufferedWriter cssWriter = new BufferedWriter(new FileWriter( "styles.css"));

        String layoutHTML = "<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n<link rel=\"stylesheet\" href=\"styles.css\">\n<meta charset=\"UTF-8\">\n" + data.getHtmlTitle() + "\n</head>\n<body>\n" + data.getContent() + "\n</body>\n</html>";
        htmlWriter.write(layoutHTML);
        cssWriter.write(data.getStyling());

        htmlWriter.close();
        cssWriter.close();

        data.clearStyling();
        data.clearContent();
    }

    /**
     * When this method is called, all the previous content that you have made above this method call will be written to
     * generated html and css pages with the names you supplied. You can also select which stylesheet you want
     * this generated html file to actually use.
     * @param htmlFileName The name of your html file
     * @param cssFileName The name of your css file
     * @param stylesheetURL The name of the stylesheet you want this page to use (can be the same as cssFileName)
     * @throws IOException Will happen if the files cannot be made and/or written to
     */

    public void files(String htmlFileName, String cssFileName, String stylesheetURL) throws IOException {
        BufferedWriter htmlWriter = new BufferedWriter(new FileWriter(htmlFileName + ".html"));
        BufferedWriter cssWriter = new BufferedWriter(new FileWriter( cssFileName + ".css"));

        String layoutHTML = "<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n<link rel=\"stylesheet\" href=\"" + stylesheetURL + ".css\">\n<meta charset=\"UTF-8\">\n" + data.getHtmlTitle() + "\n</head>\n<body>\n" + data.getContent() + "\n</body>\n</html>";
        htmlWriter.write(layoutHTML);
        cssWriter.write(data.getStyling());

        htmlWriter.close();
        cssWriter.close();

        data.clearStyling();
        data.clearContent();
    }

    /**
     * Will generate a html file only, based on the name that you give it.
     * @param htmlFileName The name of your html file
     * @throws IOException Will happen if the files cannot be made and/or written to
     */

    public void html(String htmlFileName) throws IOException {
        BufferedWriter htmlWriter = new BufferedWriter(new FileWriter(htmlFileName + ".html"));

        String layoutHTML = "<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n<meta charset=\"UTF-8\">\n" + data.getHtmlTitle() + "\n</head>\n<body>\n" + data.getContent() +"\n</body>";

        htmlWriter.write(layoutHTML);

        htmlWriter.close();

        data.clearContent();
    }

    /**
     * Will generate a css file only, based on the name that you give it.
     * @param cssFileName The name of your css file
     * @throws IOException Will happen if the files cannot be made and/or written to
     */

    public void css (String cssFileName) throws IOException {
        BufferedWriter cssWriter = new BufferedWriter(new FileWriter( cssFileName + ".css"));

        cssWriter.write(data.getStyling());

        cssWriter.close();

        data.clearStyling();
    }



}
