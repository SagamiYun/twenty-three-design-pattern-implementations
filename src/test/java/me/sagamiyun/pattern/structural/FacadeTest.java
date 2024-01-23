package me.sagamiyun.pattern.structural;

import me.sagamiyun.pattern.structural.facade.Computer;
import org.junit.jupiter.api.Test;

/**
 * @author SagamiYun
 * <p>@ClassName FacadeTest</p>
 * <p>@Description 外观模式测试类 </p>
 * <p>@Date 2024/1/23</p>
 */
public class FacadeTest {

    @Test
    public void testFacade() {
        Computer computer = new Computer();
        computer.start();
    }
}
