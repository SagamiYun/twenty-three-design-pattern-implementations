package me.sagamiyun.pattern.behavioral;

import me.sagamiyun.pattern.behavioral.visitor.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SagamiYun
 * <p>@ClassName VisitorPatternTest</p>
 * <p>@Description 访问者模式测试类 </p>
 * <p>@Date 2024/1/24</p>
 */
public class VisitorPatternTest {

    @Test
    public void testVisitor() {
        List<Product> productList = new ArrayList<>();
        productList.add(new Book());
        productList.add(new Electronic());

        Visitor visitor = new DiscountVisitor();
        for (Product product : productList) {
            product.accept(visitor);
        }
    }
}
