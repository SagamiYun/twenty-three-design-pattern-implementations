package me.sagamiyun.pattern.create.adapter;

/**
 * @author SagamiYun
 * <p>@ClassName PayPalPaymentAdapter</p>
 * <p>@Description TODO </p>
 * <p>@Date 2024/1/23</p>
 */
public class PayPalPaymentAdapter implements Payment {
    private final PayPalPayment payPalPayment;

    public PayPalPaymentAdapter(PayPalPayment payPalPayment) {
        this.payPalPayment = payPalPayment;
    }

    @Override
    public void pay(double amount) {
        payPalPayment.processPayment(amount);
    }

    public static class PayPalPayment {
        public void processPayment(double amount) {
            // DO
        }

        public boolean isPaid() {
            return true;
        }
    }
}
