package Part1Iterator;

import java.util.Iterator;

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

    }

    public int getLength() { return 0; }
}
