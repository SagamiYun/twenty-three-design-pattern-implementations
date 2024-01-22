package me.sagamiyun.pattern.create;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author SagamiYun
 * <p>@ClassName PrototypeTest</p>
 * <p>@Description 原型模式测试 </p>
 * <p>@Date 2024/1/23</p>
 */
public class PrototypeTest {
    @Test
    public void testPrototype() {
        Prototype prototype = new Prototype("Original");
        Prototype clone = prototype.clone();

        // assertNotSame方法来确保原型和克隆是不同的对象，使用assertEquals方法来确保它们有相同的名字。
        assertNotSame(prototype, clone);
        assertEquals(prototype.getName(), clone.getName());
    }
}
