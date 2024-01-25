package me.sagamiyun.pattern.behavioral.interpreter;

/**
 * @author SagamiYun
 * <p>@ClassName SubtractExpression</p>
 * <p>@Description 解释器模式 减法表达式 </p>
 * <p>@Date 2024/1/24</p>
 */
public class SubtractExpression  implements Expression {
    private final Expression leftExpression;
    private final Expression rightExpression;

    public SubtractExpression(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public int interpret() {
        return leftExpression.interpret() - rightExpression.interpret();
    }
}
