package me.sagamiyun.pattern.create;

/**
 * @author SagamiYun
 * <p>@ClassName Singleton</p>
 * <p>@Description 单例模式 </p>
 * <p>@Date 2024/1/23</p>
 */
public class Singleton {
    private static Singleton instance = null;

    private Singleton() {
        // Private constructor prevents instantiation from other classes
    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
