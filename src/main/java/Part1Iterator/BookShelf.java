package Part1Iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

import static Part1Iterator.BookShelfIterator.createInitialBookShelfIterator;

public class BookShelf implements Iterable<Book>{
    public static int SMALL_BOOKSHELF_SIZE = 10;

    private Book[] books;
    private int size;
    private int last;

    public BookShelf(Book[] books, int size, int last) {
        this.books = books;
        this.size = size;
        this.last = last;
        validate(books, size, last);
    }

    private void validate(Book[] books, int size, int last) {
        if (books.length != size) {
            throw new RuntimeException(String.format("Book array size %d is not equal to size %d", books.length, size));
        }
        if (last >= size) {
            throw new ArrayIndexOutOfBoundsException(String.format("Last %d is larger than size %d", last, size));
        }
    }

    public static BookShelf createSmallEmptyBookShelf() {
        int size = SMALL_BOOKSHELF_SIZE;
        int last = 0;
        return new BookShelf(new Book[size], size, last);
    }

    @Override
    public Iterator<Book> iterator() {
        return createInitialBookShelfIterator(this);
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public void appendBook(Book book) {
        validate(books, size, last);
        books[last++] = book;
    }

    public int getLength() { return last; }

    @Override
    public String toString() {
        return "BookShelf{" +
                "books=" + Arrays.toString(books) +
                ", size=" + size +
                ", last=" + last +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookShelf bookShelf = (BookShelf) o;
        return size == bookShelf.size && last == bookShelf.last && Arrays.equals(books, bookShelf.books);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(size, last);
        result = 31 * result + Arrays.hashCode(books);
        return result;
    }
}
