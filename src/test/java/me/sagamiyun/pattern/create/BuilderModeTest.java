package me.sagamiyun.pattern.create;

import me.sagamiyun.pattern.create.builder.Order;
import me.sagamiyun.pattern.create.builder.OrderBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author SagamiYun
 * <p>@ClassName BuilderModeTest</p>
 * <p>@Description 建造者模式 </p>
 * <p>@Date 2024/1/23</p>
 */
public class BuilderModeTest {

    // 订单创建？ 创建的是谁？ 这就是一个简单的建造者模式
    @Test
    public void testOrderBuilder() {
        OrderBuilder builder = new OrderBuilder();
        Order order = builder.setProductId("p1")
                .setUserId("u1")
                .setAddressId("a1")
                .setQuantity(2)
                .build();

        assertEquals("p1", order.getProductId());
        assertEquals("u1", order.getUserId());
        assertEquals("a1", order.getAddressId());
        assertEquals(2, order.getQuantity());
    }
}
