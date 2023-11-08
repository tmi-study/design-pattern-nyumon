package Part8AbstractFactory;

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
        createMainPage(factory);
    }

    private static void createMainPage(Factory factory) {
        Page page = factory.createPage("Blog and News", "Youngjin.com");
        Tray blogTray = createBlog("Blog Site");
        Tray newsTray = createNews("News 3");
        page.add(blogTray);
        page.add(newsTray);
    }

    private static Tray createNews(String s) {
        return null;
    }

    private static Tray createBlog(String blogSite) {
    }
}
