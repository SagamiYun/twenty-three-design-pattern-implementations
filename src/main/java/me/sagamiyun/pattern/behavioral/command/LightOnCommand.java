package me.sagamiyun.pattern.behavioral.command;

/**
 * @author SagamiYun
 * <p>@ClassName LightOnCommand</p>
 * <p>@Description TODO </p>
 * <p>@Date 2024/1/24</p>
 */
public class LightOnCommand  implements Command {
    private final Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}