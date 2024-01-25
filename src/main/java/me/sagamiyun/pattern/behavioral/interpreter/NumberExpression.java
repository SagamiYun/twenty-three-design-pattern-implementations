package me.sagamiyun.pattern.behavioral.interpreter;

/**
 * @author SagamiYun
 * <p>@ClassName NumberExpression</p>
 * <p>@Description 解释器模式 数字表达式 </p>
 * <p>@Date 2024/1/24</p>
 */
public class NumberExpression implements Expression {
    private final int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    @Override
    public int interpret() {
        return this.number;
    }
}
