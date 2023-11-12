package Part8AbstractFactory.listfactory;

import Part8AbstractFactory.factory.Factory;
import Part8AbstractFactory.factory.Link;
import Part8AbstractFactory.factory.Page;
import Part8AbstractFactory.factory.Tray;

public class ListFactory implements Factory {
    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }

    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }
}
