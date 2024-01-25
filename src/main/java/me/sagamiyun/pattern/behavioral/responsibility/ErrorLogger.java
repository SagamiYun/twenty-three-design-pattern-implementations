package me.sagamiyun.pattern.behavioral.responsibility;

/**
 * @author SagamiYun
 * <p>@ClassName ErrorLogger</p>
 * <p>@Description 错误记录器类 </p>
 * <p>@Date 2024/1/24</p>
 */
public class ErrorLogger extends Logger {

    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
