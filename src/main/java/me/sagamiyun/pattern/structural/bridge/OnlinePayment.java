package me.sagamiyun.pattern.structural.bridge;

/**
 * @author SagamiYun
 * <p>@ClassName OnlinePayment</p>
 * <p>@Description 继承实现自Payment的线上支付 </p>
 * <p>@Date 2024/1/23</p>
 */
public class OnlinePayment extends Payment {

    public OnlinePayment(PayMethod payMethod) {
        super(payMethod);
    }

    @Override
    public void pay() {
        payMethod.processPayment();
    }
}