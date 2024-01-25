package me.sagamiyun.pattern.behavioral.mediator;

import lombok.Data;

/**
 * @author SagamiYun
 * <p>@ClassName User</p>
 * <p>@Description TODO </p>
 * <p>@Date 2024/1/24</p>
 */
@Data
public class User {
    private String name;
    private final Mediator chatRoom;

    public User(String name, Mediator chatRoom) {
        this.name = name;
        this.chatRoom = chatRoom;
    }

    public void send(String msg) {
        chatRoom.sendMessage(msg, this);
    }
}
