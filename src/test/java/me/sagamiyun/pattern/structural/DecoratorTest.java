package me.sagamiyun.pattern.structural;

import me.sagamiyun.pattern.structural.decorator.BorderDecorator;
import me.sagamiyun.pattern.structural.decorator.Component;
import me.sagamiyun.pattern.structural.decorator.ScrollBarDecorator;
import me.sagamiyun.pattern.structural.decorator.Window;
import org.junit.jupiter.api.Test;

/**
 * @author SagamiYun
 * <p>@ClassName DecoratorTest</p>
 * <p>@Description 装饰器模式实现 </p>
 * <p>@Date 2024/1/23</p>
 */
public class DecoratorTest {

    @Test
    public void testDecorator(){
        Component window = new Window();
        Component windowWithScrollbar = new ScrollBarDecorator(window);
        Component windowWithScrollbarAndBorder = new BorderDecorator(windowWithScrollbar);

        System.out.println(window.draw());  // Output: Drawing a window
        System.out.println(windowWithScrollbar.draw());  // Output: Drawing a window with a scrollbar
        System.out.println(windowWithScrollbarAndBorder.draw());  // Output: Drawing a window with a scrollbar with a border
    }
}
