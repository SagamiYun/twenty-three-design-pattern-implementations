package me.sagamiyun.pattern.structural.proxy;

/**
 * @author SagamiYun
 * <p>@ClassName ProxyDatabaseService</p>
 * <p>@Description 代理数据 </p>
 * <p>@Date 2024/1/23</p>
 */
public class ProxyDatabaseService implements DatabaseService {
    private final DatabaseService realDatabaseService;

    public ProxyDatabaseService(DatabaseService realDatabaseService) {
        this.realDatabaseService = realDatabaseService;
    }

    @Override
    public void query(String sql) {
        System.out.println("Log: " + sql);
        if (checkAccess()) {
            realDatabaseService.query(sql);
        } else {
            System.out.println("Access denied for query: " + sql);
        }
    }

    private boolean checkAccess() {
        // Access control logic here
        return true;
    }
}
