package me.sagamiyun.pattern.create.factory;

/**
 * @author SagamiYun
 * <p>@ClassName ConcreteFactory1</p>
 * <p>@Description TODO </p>
 * <p>@Date 2024/1/23</p>
 */
public class ConcreteFactory1 implements Factory {
    @Override
    public Product createProduct() {
        return new ConcreteProduct1();
    }
}
