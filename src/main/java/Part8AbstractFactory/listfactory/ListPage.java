package Part8AbstractFactory.listfactory;

import Part8AbstractFactory.factory.Page;
import Part8AbstractFactory.factory.Tray;

public class ListPage implements Page {
    public ListPage(String title, String author) {
    }

    @Override
    public String makeHTML(String caption) {
        return null;
    }

    @Override
    public void add(Tray blogTray) {

    }

    @Override
    public void writeToFile(String fileName) {

    }
}
