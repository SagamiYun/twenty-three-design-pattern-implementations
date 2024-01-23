package me.sagamiyun.pattern.structural.adapter;

/**
 * @author SagamiYun
 * <p>@ClassName CreditCardPaymentAdapter</p>
 * <p>@Description TODO </p>
 * <p>@Date 2024/1/23</p>
 */
public class CreditCardPaymentAdapter implements Payment {

    private final CreditCardPayment creditCardPayment;

    public CreditCardPaymentAdapter(CreditCardPayment creditCardPayment) {
        this.creditCardPayment = creditCardPayment;
    }

    @Override
    public void pay(double amount) {
        creditCardPayment.makePayment(amount);
    }

    public static class CreditCardPayment {
        public void makePayment(double amount) {
            // DO
        }

        public boolean isPaid() {
            return true;
        }
    }
}
