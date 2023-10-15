package Part1Iterator;

import Part1Iterator.Book;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

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
        if (index >= bookShelf.getLength()) {
            return false;
        }
        return true;
    }

    @Override
    public Book next() {
        if (!hasNext()) {
            throw new NoSuchElementException("This is the end of the BookShelfIterator");
        }
        return bookShelf.getBookAt(index++);
    }

    @Override
    public String toString() {
        return "BookShelfIterator{" +
                "bookShelf=" + bookShelf +
                ", index=" + index +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookShelfIterator that = (BookShelfIterator) o;
        return index == that.index && Objects.equals(bookShelf, that.bookShelf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookShelf, index);
    }
}
