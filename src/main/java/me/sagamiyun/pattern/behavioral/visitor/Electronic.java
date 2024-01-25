package me.sagamiyun.pattern.behavioral.visitor;

/**
 * @author SagamiYun
 * <p>@ClassName Electronic</p>
 * <p>@Description TODO </p>
 * <p>@Date 2024/1/24</p>
 */
public class Electronic implements Product {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}