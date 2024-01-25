package me.sagamiyun.pattern.behavioral;

import me.sagamiyun.pattern.behavioral.memento.CareTaker;
import me.sagamiyun.pattern.behavioral.memento.Originator;
import org.junit.jupiter.api.Test;

/**
 * @author SagamiYun
 * <p>@ClassName MementoPatternTest</p>
 * <p>@Description 备忘录模式测试 </p>
 * <p>@Date 2024/1/24</p>
 */
public class MementoPatternTest {

    /*
     * 在这个测试方法中，我们首先创建了一个发起人和一个负责人。
     * 然后，我们改变了发起人的状态，并保存了每个状态。
     * 最后，我们从负责人中恢复了每个状态，并打印出来。
     */
    @Test
    public void testMemento() {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("State #1");
        originator.setState("State #2");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("State #3");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("State #4");
        System.out.println("Current State: " + originator.getState());

        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getState());
    }
}
