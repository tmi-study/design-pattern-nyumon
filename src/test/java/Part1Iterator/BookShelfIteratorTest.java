package Part1Iterator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class BookShelfIteratorTest {
    int bookSize;
    int bookLast;
    Book book1;
    Book book2;
    Book[] books;
    BookShelf bookShelf;
    BookShelfIterator bookShelfIterator;
    @BeforeEach
    void setUp() {
        bookSize = 10;
        book1 = new Book("book1");
        book2 = new Book("book2");
        books = new Book[bookSize];
        books[0] = book1;
        books[1] = book2;
        bookLast = 2;
        bookShelf = new BookShelf(books, bookSize, bookLast);
        bookShelfIterator = new BookShelfIterator(bookShelf, 0);
    }

    @Test
    void createInitialBookShelfIterator() {
        assertEquals(bookShelfIterator, BookShelfIterator.createInitialBookShelfIterator(bookShelf));
    }

    @Test
    void hasNextExist() {
        assertTrue(bookShelfIterator.hasNext());
    }

    @Test
    void hasNextNotExist() {
        BookShelfIterator notExistBookShelfIterator = new BookShelfIterator(bookShelf, 2);
        assertFalse(notExistBookShelfIterator.hasNext());
    }

    @Test
    void nextExist() {
        assertEquals(book1, bookShelfIterator.next());
    }

    @Test
    void nextNotExist() {
        BookShelfIterator notExistBookShelfIterator = new BookShelfIterator(bookShelf, 2);
        assertThrows(NoSuchElementException.class, () -> {
            notExistBookShelfIterator.next();
        });
    }
}
