package quicktag.html;

import quicktag.data.Controller;

import java.io.IOException;

public class Main implements Controller{

    public static void main(String[] args) throws IOException {


        basic.p("Below is a picture of gumshoe ...");
        image.img("gumfuck1", "https://i1.sndcdn.com/artworks-000060012468-1u6dl3-t500x500.jpg", "Gumshoe");

        link.a("https://www.youtube.com/watch?v=OwpnmTXBidw", "Absolute slapper");

        container.div("mycont1");
        container.close();

        list.li("Banana", "Apple", "Orange");

        write.quick();
    }
}
