package me.sagamiyun.pattern.behavioral.responsibility;

/**
 * @author SagamiYun
 * <p>@ClassName Logger</p>
 * <p>@Description 责任链模式 抽象的记录器类 </p>
 * <p>@Date 2024/1/24</p>
 */
public abstract class Logger {
    protected int level;
    protected Logger nextLogger;

    public void setNextLogger(Logger nextLogger){
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message){
        if(this.level <= level){
            write(message);
        }
        if(nextLogger !=null){
            nextLogger.logMessage(level, message);
        }
    }

    abstract protected void write(String message);

}
