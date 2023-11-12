package Part8AbstractFactory.listfactory;

import Part8AbstractFactory.factory.Link;
import Part8AbstractFactory.factory.Tray;

public class ListTray implements Tray {
    public ListTray(String caption) {
    }

    @Override
    public String makeHTML(String caption) {
        return null;
    }

    @Override
    public void add(Link blog1) {

    }
}
