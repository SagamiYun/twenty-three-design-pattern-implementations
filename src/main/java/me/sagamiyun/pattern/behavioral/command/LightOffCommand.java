package me.sagamiyun.pattern.behavioral.command;

/**
 * @author SagamiYun
 * <p>@ClassName LightOffCommand</p>
 * <p>@Description TODO </p>
 * <p>@Date 2024/1/24</p>
 */
public class LightOffCommand implements Command {
    private final Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
