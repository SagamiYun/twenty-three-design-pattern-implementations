package me.sagamiyun.pattern.behavioral.iterator;

import java.util.Iterator;

/**
 * @author SagamiYun
 * <p>@ClassName BookShelfIterator</p>
 * <p>@Description TODO </p>
 * <p>@Date 2024/1/24</p>
 */
public class BookShelfIterator implements Iterator<Book> {
    private final BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < bookShelf.getLength();
    }

    @Override
    public Book next() {
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}