package me.sagamiyun.pattern.behavioral;

import me.sagamiyun.pattern.behavioral.mediator.ChatRoom;
import me.sagamiyun.pattern.behavioral.mediator.Mediator;
import me.sagamiyun.pattern.behavioral.mediator.User;
import org.junit.jupiter.api.Test;

/**
 * @author SagamiYun
 * <p>@ClassName MediatorPatternTest</p>
 * <p>@Description 中介者模式测试 </p>
 * <p>@Date 2024/1/24</p>
 */
public class MediatorPatternTest {

    @Test
    public void testMediator() {
        Mediator chatRoom = new ChatRoom();
        User john = new User("John", chatRoom);
        User jane = new User("Jane", chatRoom);

        john.send("Hi, Jane!");
        jane.send("Hello, John!");
    }
}
