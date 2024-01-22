package me.sagamiyun.pattern.create.abstractFactory;

/**
 * @author SagamiYun
 * <p>@ClassName CreditCardFactory</p>
 * <p>@Description TODO </p>
 * <p>@Date 2024/1/23</p>
 */
public class CreditCardFactory extends PaymentFactory {
    @Override
    public Payment createPayment() {
        return new CreditCard();
    }
}
