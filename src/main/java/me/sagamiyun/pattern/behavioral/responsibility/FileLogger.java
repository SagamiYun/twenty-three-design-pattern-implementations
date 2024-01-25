package me.sagamiyun.pattern.behavioral.responsibility;

/**
 * @author SagamiYun
 * <p>@ClassName FileLogger</p>
 * <p>@Description 文件记录器类 </p>
 * <p>@Date 2024/1/24</p>
 */
public class FileLogger extends Logger {

    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}