package me.sagamiyun.pattern.structural.flyweight;

/**
 * @author SagamiYun
 * <p>@ClassName ConcreteCircle</p>
 * <p>@Description TODO </p>
 * <p>@Date 2024/1/23</p>
 */
public class ConcreteCircle implements Circle {
    private final String color;

    public ConcreteCircle(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Drawing circle of color : " + color);
    }
}