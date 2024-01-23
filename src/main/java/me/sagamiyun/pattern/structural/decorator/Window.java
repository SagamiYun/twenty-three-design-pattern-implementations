package me.sagamiyun.pattern.structural.decorator;

/**
 * @author SagamiYun
 * <p>@ClassName Window</p>
 * <p>@Description 窗口实现类 </p>
 * <p>@Date 2024/1/23</p>
 */
public class Window implements Component {
    @Override
    public String draw() {
        return "Drawing a window";
    }
}

