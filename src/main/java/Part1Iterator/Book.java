package Part1Iterator;

public class Book {
    String name;

    public Book(String name) {
        this.name = name;
    }

    public static Book createBook(String name) {
        return new Book(name);
    }

    public String getName() {
        return name;
    }
}
