package Part1Iterator;

import Part1Iterator.Book;

import java.util.Iterator;

public class BookShelfIterator implements Iterator<Book> {
    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf, int index) {
        this.bookShelf = bookShelf;
        this.index = index;
    }

    public static BookShelfIterator createInitialBookShelfIterator(BookShelf bookShelf) {
        return new BookShelfIterator(bookShelf, 0);
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Book next() {
        return null;
    }
}
