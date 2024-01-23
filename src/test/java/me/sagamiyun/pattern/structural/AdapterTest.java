package me.sagamiyun.pattern.structural;

import me.sagamiyun.pattern.structural.adapter.CreditCardPaymentAdapter;
import me.sagamiyun.pattern.structural.adapter.PayPalPaymentAdapter;
import me.sagamiyun.pattern.structural.adapter.Payment;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author SagamiYun
 * <p>@ClassName AdapterTest</p>
 * <p>@Description 适配器模式测试 </p>
 * <p>@Date 2024/1/23</p>
 */
public class AdapterTest {
    @Test
    public void testPaymentAdapters() {
        // 创建信用卡支付适配器
        CreditCardPaymentAdapter.CreditCardPayment creditCardPayment = new CreditCardPaymentAdapter.CreditCardPayment();
        Payment creditCardPaymentAdapter = new CreditCardPaymentAdapter(creditCardPayment);
        creditCardPaymentAdapter.pay(100.0);

        // 创建PayPal支付适配器
        PayPalPaymentAdapter.PayPalPayment payPalPayment = new PayPalPaymentAdapter.PayPalPayment();
        Payment payPalPaymentAdapter = new PayPalPaymentAdapter(payPalPayment);
        payPalPaymentAdapter.pay(200.0);

        // 检查支付是否成功
        assertTrue(creditCardPayment.isPaid());
        assertTrue(payPalPayment.isPaid());
    }
}
