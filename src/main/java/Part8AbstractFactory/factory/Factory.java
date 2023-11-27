package Part8AbstractFactory.factory;

public interface Factory {
    static Factory getFactory(String className) {
        Factory factory = null;
        try {
            factory = (Factory) Class.forName(className).getDeclaredConstructor().newInstance();
        } catch (ClassNotFoundException e) {
            System.out.println(className + "클래스가 발견되지 않았습니다.");
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return factory;
    }

    Page createPage(String title, String autho);

    Link createLink(String caption, String url);

    Tray createTray(String caption);
}
