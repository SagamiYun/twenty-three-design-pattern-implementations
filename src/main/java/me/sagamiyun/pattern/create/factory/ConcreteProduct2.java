package me.sagamiyun.pattern.create.factory;

/**
 * @author SagamiYun
 * <p>@ClassName ConcreteProduct2</p>
 * <p>@Description TODO </p>
 * <p>@Date 2024/1/23</p>
 */
public class ConcreteProduct2 implements Product {
    @Override
    public void use() {
        System.out.println("Using ConcreteProduct2");
    }
}
