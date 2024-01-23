package me.sagamiyun.pattern.structural.bridge;

/**
 * @author SagamiYun
 * <p>@ClassName OfflinePayment</p>
 * <p>@Description 继承实现自Payment的线下支付 </p>
 * <p>@Date 2024/1/23</p>
 */
public class OfflinePayment extends Payment {
    public OfflinePayment(PayMethod payMethod) {
        super(payMethod);
    }

    @Override
    public void pay() {
        payMethod.processPayment();
    }
}