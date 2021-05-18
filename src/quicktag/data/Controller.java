package quicktag.data;

import quicktag.css.Style;
import quicktag.html.*;

public interface Controller {

    Data data = new Data();

    Basic basic = new Basic();
    Style style = new Style();
    Write write = new Write();
    Image image = new Image();
    Link link = new Link();
    Container container = new Container();
    List list = new List();
    Table table = new Table();
}
