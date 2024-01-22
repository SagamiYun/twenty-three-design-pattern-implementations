package me.sagamiyun.pattern.create.abstractFactory;

/**
 * @author SagamiYun
 * <p>@ClassName Ewallet</p>
 * <p>@Description 抽象产品类Ewallet </p>
 * <p>@Date 2024/1/23</p>
 */
public class Ewallet implements Payment {
    @Override
    public void pay() {
        System.out.println("Pay with credit card");
    }
}
