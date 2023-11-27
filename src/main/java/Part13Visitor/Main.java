package Part13Visitor;

public class Main {
    public static void main(String[] args) {
        System.out.println("Making root entries");
        Directory rootDir = new Directory("root");
        Directory binDir = new Directory("bin");

        rootDir.add(binDir);
        binDir.add(new File("vi", 10000));

        rootDir.accept(new ListVisitor());
    }
}
