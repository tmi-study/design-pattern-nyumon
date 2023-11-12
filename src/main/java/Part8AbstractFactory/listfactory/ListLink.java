package Part8AbstractFactory.listfactory;

import Part8AbstractFactory.factory.Link;

public class ListLink implements Link {
    public ListLink(String caption, String url) {
    }

    @Override
    public String makeHTML(String caption) {
        return null;
    }
}
