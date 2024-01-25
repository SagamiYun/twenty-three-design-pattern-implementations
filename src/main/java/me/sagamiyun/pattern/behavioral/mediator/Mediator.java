package me.sagamiyun.pattern.behavioral.mediator;

/**
 * @author SagamiYun
 * <p>@InterfaceName Mediator</p>
 * <p>@Description 中介者模式接口 </p>
 * <p>@Date 2024/1/24</p>
 */
public interface Mediator {
    void sendMessage(String msg, User user);
}
