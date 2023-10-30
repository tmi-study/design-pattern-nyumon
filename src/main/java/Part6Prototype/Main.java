package Part6Prototype;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        MessageBox mbox = new MessageBox('*');

        manager.register("warning box", mbox);

        Product p2 = manager.create("warning box");
        p2.use("Hello, world.");
    }
}
