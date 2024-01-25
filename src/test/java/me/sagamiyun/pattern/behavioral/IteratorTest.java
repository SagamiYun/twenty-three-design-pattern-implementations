package me.sagamiyun.pattern.behavioral;

import me.sagamiyun.pattern.behavioral.iterator.Book;
import me.sagamiyun.pattern.behavioral.iterator.BookShelf;
import org.junit.jupiter.api.Test;

/**
 * @author SagamiYun
 * <p>@ClassName IteratorTest</p>
 * <p>@Description 迭代器 测试 </p>
 * <p>@Date 2024/1/24</p>
 */
public class IteratorTest {

    @Test
    public void testIterator() {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Around the World in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));
        for (Book book : bookShelf) {
            System.out.println(book.getName());
        }
    }
}
