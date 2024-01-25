package me.sagamiyun.pattern.behavioral.iterator;

import java.util.Iterator;

/**
 * @author SagamiYun
 * <p>@ClassName BookShelf</p>
 * <p>@Description TODO </p>
 * <p>@Date 2024/1/24</p>
 */
public class BookShelf implements Iterable<Book> {
    private final Book[] books;
    private int last = 0;

    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }

    public int getLength() {
        return last;
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }
}
