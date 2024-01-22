package me.sagamiyun.pattern.create;

import me.sagamiyun.pattern.create.factory.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author SagamiYun
 * <p>@ClassName FactoryMethodTest</p>
 * <p>@Description 工厂方法模式 </p>
 * <p>@Date 2024/1/23</p>
 */
public class FactoryMethodTest {

    @Test
    public void testFactoryMethod() {

        /*
         * 这个测试方法首先创建了两个工厂对象，
         * 然后使用这两个工厂对象创建了两个产品对象，并验证了这两个产品对象的类型。
         * 如果这两个产品对象的类型与预期的类型一致，那么这个测试方法就会通过。
         */

        Factory factory1 = new ConcreteFactory1();
        Product product1 = factory1.createProduct();
        assertTrue(product1 instanceof ConcreteProduct1);

        Factory factory2 = new ConcreteFactory2();
        Product product2 = factory2.createProduct();
        assertTrue(product2 instanceof ConcreteProduct2);
    }
}
