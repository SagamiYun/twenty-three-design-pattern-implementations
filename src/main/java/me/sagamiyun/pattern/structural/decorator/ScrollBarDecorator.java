package me.sagamiyun.pattern.structural.decorator;

/**
 * @author SagamiYun
 * <p>@ClassName ScrollBarDecorator</p>
 * <p>@Description 滚动条装饰器实现类 </p>
 * <p>@Date 2024/1/23</p>
 */
public class ScrollBarDecorator implements Component {
    private final Component component;

    public ScrollBarDecorator(Component component) {
        this.component = component;
    }

    @Override
    public String draw() {
        return component.draw() + " with a scrollbar";
    }
}
