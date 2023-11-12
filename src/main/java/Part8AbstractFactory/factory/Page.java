package Part8AbstractFactory.factory;

public interface Page extends Item{
    void add(Tray blogTray);

    void writeToFile(String fileName);
}
