package me.sagamiyun.pattern.behavioral.visitor;

/**
 * @author SagamiYun
 * <p>@ClassName Book</p>
 * <p>@Description TODO </p>
 * <p>@Date 2024/1/24</p>
 */
public class Book implements Product {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
