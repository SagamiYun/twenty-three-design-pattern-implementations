package me.sagamiyun.pattern.behavioral.memento;

import lombok.Data;
import lombok.Getter;

/**
 * @author SagamiYun
 * <p>@ClassName Memento</p>
 * <p>@Description 备忘录模式备忘录类 </p>
 * <p>@Date 2024/1/24</p>
 */
@Getter
public class Memento {
    private final String state;

    public Memento(String state) {
        this.state = state;
    }

}
