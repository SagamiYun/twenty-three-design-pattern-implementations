package me.sagamiyun.pattern.create;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author SagamiYun
 * <p>@ClassName SingletonTest</p>
 * <p>@Description 单例模式测试 </p>
 * <p>@Date 2024/1/23</p>
 */
public class SingletonTest {
    @Test
    public void testSingleton() {
        Singleton firstInstance = Singleton.getInstance();
        Singleton secondInstance = Singleton.getInstance();

        // Check if two instances are the same
        assertSame(firstInstance, secondInstance);
    }
}
