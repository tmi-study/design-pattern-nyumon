package Part8AbstractFactory;

import Part8AbstractFactory.factory.Factory;
import Part8AbstractFactory.factory.Link;
import Part8AbstractFactory.factory.Page;
import Part8AbstractFactory.factory.Tray;

public class Main {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java Main filename.html class.name.of.ConcreteFactory");
            System.out.println("Example 1: java Main List.html listfactory.ListFactory");
            System.out.println("Example 2: java Main div.html divfactory.DivFactory");
            System.exit(0);
        }

        String fileName = args[0];
        String className = args[1];

        Factory factory = Factory.getFactory(className);

        // Page
        createMainPage(factory, fileName);
    }

    private static void createMainPage(Factory factory, String fileName) {
        Page page = factory.createPage("Blog and News", "Youngjin.com");
        Tray blogTray = createBlog(factory, "Blog Site");
        Tray newsTray = createNews(factory, "News 3");
        page.add(blogTray);
        page.add(newsTray);
        page.writeToFile(fileName);
    }

    private static Tray createBlog(Factory factory, String trayName) {
        Link blog1 = factory.createLink("Blog 1", "https://example.com/blog1");

        Tray blogTray = factory.createTray(trayName);
        blogTray.add(blog1);

        return blogTray;
    }
    private static Tray createNews(Factory factory, String trayName) {
        Link news1 = factory.createLink("News 1", "https://example.com/news1");

        Tray newsTray = factory.createTray(trayName);
        newsTray.add(news1);

        return newsTray;
    }

}
