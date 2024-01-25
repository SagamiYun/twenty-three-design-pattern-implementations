package me.sagamiyun.pattern.behavioral.mediator;

/**
 * @author SagamiYun
 * <p>@ClassName ChatRoom</p>
 * <p>@Description TODO </p>
 * <p>@Date 2024/1/24</p>
 */
public class ChatRoom implements Mediator {
    @Override
    public void sendMessage(String msg, User user) {
        System.out.println(user.getName() + " says: " + msg);
    }
}
