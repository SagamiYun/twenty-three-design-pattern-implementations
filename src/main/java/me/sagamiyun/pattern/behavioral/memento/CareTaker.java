package me.sagamiyun.pattern.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SagamiYun
 * <p>@ClassName CareTaker</p>
 * <p>@Description 负责人类 </p>
 * <p>@Date 2024/1/24</p>
 */
public class CareTaker {
    private final List<Memento> mementoList = new ArrayList<>();

    public void add(Memento state) {
        mementoList.add(state);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}
