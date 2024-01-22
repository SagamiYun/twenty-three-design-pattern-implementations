package me.sagamiyun.pattern.create.abstractFactory;

/**
 * @author SagamiYun
 * <p>@ClassName CreditCard</p>
 * <p>@Description TODO </p>
 * <p>@Date 2024/1/23</p>
 */
public class CreditCard implements Payment {
    @Override
    public void pay() {
        System.out.println("Pay with credit card");
    }
}
