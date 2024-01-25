package me.sagamiyun.pattern.behavioral.responsibility;

/**
 * @author SagamiYun
 * <p>@ClassName ConsoleLogger</p>
 * <p>@Description 具体的记录器类 </p>
 * <p>@Date 2024/1/24</p>
 */
public class ConsoleLogger extends Logger {

    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
