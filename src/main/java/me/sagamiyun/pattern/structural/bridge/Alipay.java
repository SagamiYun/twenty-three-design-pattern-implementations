package me.sagamiyun.pattern.structural.bridge;

/**
 * @author SagamiYun
 * <p>@ClassName Alipay</p>
 * <p>@Description 例子： 支付宝 </p>
 * <p>@Date 2024/1/23</p>
 */
public class Alipay implements PayMethod {

    @Override
    public void processPayment() {
        System.out.println("Processing payment with Alipay...");
    }
}

