package me.sagamiyun.pattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author SagamiYun
 * <p>@ClassName CircleFactory</p>
 * <p>@Description 圆工厂 </p>
 * <p>@Date 2024/1/23</p>
 */
public class CircleFactory {
    private static final Map<String, Circle> CIRCLE_MAP = new HashMap<>();

    public static Circle getCircle(String color) {
        Circle circle = CIRCLE_MAP.get(color);

        if (circle == null) {
            circle = new ConcreteCircle(color);
            CIRCLE_MAP.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }

        return circle;
    }
}
