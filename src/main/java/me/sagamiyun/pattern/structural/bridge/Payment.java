package me.sagamiyun.pattern.structural.bridge;

/**
 * @author SagamiYun
 * <p>@ClassName Payment</p>
 * <p>@Description 桥接模式支付抽象类 </p>
 * <p>@Date 2024/1/23</p>
 */
public abstract class Payment {

    protected PayMethod payMethod;

    protected Payment(PayMethod payMethod) {
        this.payMethod = payMethod;
    }

    public abstract void pay();
}
