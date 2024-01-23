package me.sagamiyun.pattern.structural.decorator;

/**
 * @author SagamiYun
 * <p>@ClassName BorderDecorator</p>
 * <p>@Description 边框装饰器 </p>
 * <p>@Date 2024/1/23</p>
 */
public class BorderDecorator implements Component {
    private final Component component;

    public BorderDecorator(Component component) {
        this.component = component;
    }

    @Override
    public String draw() {
        return component.draw() + " with a border";
    }
}
