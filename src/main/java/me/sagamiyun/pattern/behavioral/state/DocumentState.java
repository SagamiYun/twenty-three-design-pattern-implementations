package me.sagamiyun.pattern.behavioral.state;

/**
 * @author SagamiYun
 * <p>@InterfaceName DocumentState</p>
 * <p>@Description 状态模式 文件状态接口 </p>
 * <p>@Date 2024/1/24</p>
 */
public interface DocumentState {
    void handlePublish(Document document);
    void handleReview(Document document);
}
