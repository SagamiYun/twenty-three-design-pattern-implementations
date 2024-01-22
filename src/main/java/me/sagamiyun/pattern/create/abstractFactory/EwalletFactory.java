package me.sagamiyun.pattern.create.abstractFactory;

/**
 * @author SagamiYun
 * <p>@ClassName EwalletFactory</p>
 * <p>@Description TODO </p>
 * <p>@Date 2024/1/23</p>
 */
public class EwalletFactory extends PaymentFactory {
    @Override
    public Payment createPayment() {
        return new Ewallet();
    }
}
