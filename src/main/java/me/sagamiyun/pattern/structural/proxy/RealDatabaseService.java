package me.sagamiyun.pattern.structural.proxy;

/**
 * @author SagamiYun
 * <p>@ClassName RealDatabaseService</p>
 * <p>@Description TODO </p>
 * <p>@Date 2024/1/23</p>
 */
public class RealDatabaseService implements DatabaseService {
    @Override
    public void query(String sql) {
        System.out.println("Executing query: " + sql);
    }
}
