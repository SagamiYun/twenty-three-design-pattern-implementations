package me.sagamiyun.pattern.behavioral.command;

/**
 * @author SagamiYun
 * <p>@ClassName RemoteControl</p>
 * <p>@Description 远程控制者 </p>
 * <p>@Date 2024/1/24</p>
 */
public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}
