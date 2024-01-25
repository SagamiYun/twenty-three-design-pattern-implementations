package me.sagamiyun.pattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author SagamiYun
 * <p>@ClassName News</p>
 * <p>@Description 观察者模式 新闻对象 </p>
 * <p>@Date 2024/1/24</p>
 */
public class News {

    private final List<Consumer<String>> listeners = new ArrayList<>();

    public void registerListener(Consumer<String> listener) {
        listeners.add(listener);
    }

    public void unregisterListener(Consumer<String> listener) {
        listeners.remove(listener);
    }

    public void publishNews(String news) {
        listeners.forEach(listener -> listener.accept(news));
    }
}
