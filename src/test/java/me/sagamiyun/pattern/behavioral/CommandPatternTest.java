package me.sagamiyun.pattern.behavioral;

import me.sagamiyun.pattern.behavioral.command.*;
import org.junit.jupiter.api.Test;

/**
 * @author SagamiYun
 * <p>@ClassName CommandPatternTest</p>
 * <p>@Description 命令模式测试类 </p>
 * <p>@Date 2024/1/24</p>
 */
public class CommandPatternTest {

    @Test
    public void testCommandPattern() {
        Light light = new Light();
        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);

        RemoteControl remoteControl = new RemoteControl();

        // Turn on the light
        remoteControl.setCommand(lightOnCommand);
        remoteControl.pressButton();

        // Turn off the light
        remoteControl.setCommand(lightOffCommand);
        remoteControl.pressButton();
    }
}
