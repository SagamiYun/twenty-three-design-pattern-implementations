package me.sagamiyun.pattern.behavioral;

import me.sagamiyun.pattern.behavioral.observer.News;
import org.junit.jupiter.api.Test;

import java.util.function.Consumer;

/**
 * @author SagamiYun
 * <p>@ClassName ObserverTest</p>
 * <p>@Description 观察者模式测试 </p>
 * <p>@Date 2024/1/24</p>
 */
public class ObserverTest {

    @Test
    public void testObserver() {
        News news = new News();

        Consumer<String> listener1 = (newsItem) -> System.out.println("Listener 1 received news: " + newsItem);
        Consumer<String> listener2 = (newsItem) -> System.out.println("Listener 2 received news: " + newsItem);

        news.registerListener(listener1);
        news.registerListener(listener2);

        news.publishNews("Big news!");
    }
}
