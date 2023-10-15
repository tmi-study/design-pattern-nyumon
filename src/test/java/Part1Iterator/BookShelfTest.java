package Part1Iterator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

class BookShelfTest {
    Book book1;
    Book book2;
    BookShelf bookShelf;
    Iterator<Book> bookShelfIterator;

    @BeforeEach
    void setUp() {
        book1 = new Book("book1");
        book2 = new Book("book2");
        bookShelf = BookShelf.createSmallEmptyBookShelf();
        bookShelf.appendBook(book1);
        bookShelf.appendBook(book2);
        bookShelfIterator = BookShelfIterator.createInitialBookShelfIterator(bookShelf);
    }

    @Test
    void createSmallEmptyBookShelf() {
        assertEquals(bookShelf, BookShelf.createSmallEmptyBookShelf());
    }

    @Test
    void iterator() {
        assertEquals(bookShelfIterator, bookShelf.iterator());
    }

    @Test
    void getBookAt() {
        assertEquals(book2, bookShelf.getBookAt(1));
    }

    @Test
    void appendBook() {
        Book book3 = new Book("book3");
        BookShelf expectedBookShelf = new BookShelf(new Book[]{book1, book2, book3}, BookShelf.SMALL_BOOKSHELF_SIZE, 3);
        assertEquals(expectedBookShelf, bookShelf);
    }

    @Test
    void getLength() {
        assertEquals(2, bookShelf.getLength());
    }
}
