package me.sagamiyun.pattern.structural;

import me.sagamiyun.pattern.structural.flyweight.Circle;
import me.sagamiyun.pattern.structural.flyweight.CircleFactory;
import org.junit.jupiter.api.Test;

/**
 * @author SagamiYun
 * <p>@ClassName FlyweightPatternTest</p>
 * <p>@Description 享元模式测试类 </p>
 * <p>@Date 2024/1/23</p>
 */
public class FlyweightPatternTest {
    private static final String[] colors = {"Red", "Green", "Blue", "White", "Black"};

    @Test
    public void testFlyweightPattern() {
        for (int i = 0; i < 10; ++i) {
            Circle circle = CircleFactory.getCircle(getRandomColor());
            circle.draw();
        }
    }

    private String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }
}
