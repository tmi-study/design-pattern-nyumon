package Part1Iterator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    Book book;
    String bookName;
    @BeforeEach
    void setUp() {
        bookName = "";
        book = new Book(bookName);
    }

    @Test
    void createBook() {
        assertEquals(book, Book.createBook(bookName));
    }

    @Test
    void getName() {
        assertEquals("design pattern", book.getName());
    }
}
