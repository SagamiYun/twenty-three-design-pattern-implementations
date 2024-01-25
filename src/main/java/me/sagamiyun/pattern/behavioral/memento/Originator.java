package me.sagamiyun.pattern.behavioral.memento;

import lombok.Getter;

/**
 * @author SagamiYun
 * <p>@ClassName Originator</p>
 * <p>@Description 发起人 </p>
 * <p>@Date 2024/1/24</p>
 */
@Getter
public class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento) {
        state = memento.getState();
    }
}
