package Part1Iterator;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = BookShelf.createSmallEmptyBookShelf();
        bookShelf.appendBook(Book.createBook("Around the World in 80 Days"));
        bookShelf.appendBook(Book.createBook("Bible"));
        bookShelf.appendBook(Book.createBook("Cinderella"));
        bookShelf.appendBook(Book.createBook("Daddy-Long-Legs"));

        // 명시적 Iterator 사용
        Iterator<Book> it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = it.next();
            System.out.println(book);
        }
        System.out.println();

        // 확장 for문 사용
        for (Book book: bookShelf) {
            System.out.println(book);
        }
        System.out.println();
    }
}
