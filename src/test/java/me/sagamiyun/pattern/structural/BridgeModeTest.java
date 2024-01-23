package me.sagamiyun.pattern.structural;

import me.sagamiyun.pattern.structural.bridge.*;
import org.junit.jupiter.api.Test;

/**
 * @author SagamiYun
 * <p>@ClassName BridgeModeTest</p>
 * <p>@Description 桥接模式测试 </p>
 * <p>@Date 2024/1/23</p>
 */
public class BridgeModeTest {
    @Test
    public void testPaymentBridge() {
        Payment onlinePayment = new OnlinePayment(new Alipay());
        onlinePayment.pay();

        Payment offlinePayment = new OfflinePayment(new WechatPay());
        offlinePayment.pay();
    }
}
