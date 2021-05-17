package quicktag.html;

import quicktag.data.Controller;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Write implements Controller {

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

}
