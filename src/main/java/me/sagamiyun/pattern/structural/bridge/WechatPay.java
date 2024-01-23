package me.sagamiyun.pattern.structural.bridge;

/**
 * @author SagamiYun
 * <p>@ClassName WechatPay</p>
 * <p>@Description 例子：微信支付 </p>
 * <p>@Date 2024/1/23</p>
 */
public class WechatPay implements PayMethod {

    @Override
    public void processPayment() {
        System.out.println("Processing payment with WechatPay...");
    }
}
