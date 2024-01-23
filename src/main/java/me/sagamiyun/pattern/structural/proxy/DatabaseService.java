package me.sagamiyun.pattern.structural.proxy;

/**
 * @author SagamiYun
 * <p>@InterfaceName DatabaseService</p>
 * <p>@Description 代理模式数据库服务接口 </p>
 * <p>@Date 2024/1/23</p>
 */
public interface DatabaseService {
    void query(String sql);
}
