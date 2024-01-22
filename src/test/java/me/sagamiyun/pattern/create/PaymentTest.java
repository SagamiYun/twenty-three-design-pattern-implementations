package me.sagamiyun.pattern.create;
import me.sagamiyun.pattern.create.abstractFactory.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author SagamiYun
 * <p>@ClassName PaymentTest</p>
 * <p>@Description 抽象工厂模式测试 </p>
 * <p>@Date 2024/1/23</p>
 */
public class PaymentTest {

    @Test
    public void testCreditCardPayment() {
        PaymentFactory factory = new CreditCardFactory();
        Payment payment = factory.createPayment();
        assertTrue(payment instanceof CreditCard);
    }

    @Test
    public void testEwalletPayment() {
        PaymentFactory factory = new EwalletFactory();
        Payment payment = factory.createPayment();
        assertTrue(payment instanceof Ewallet);
    }
}
