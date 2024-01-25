package me.sagamiyun.pattern.behavioral.interpreter;

/**
 * @author SagamiYun
 * <p>@ClassName AddExpression</p>
 * <p>@Description 解释器模式 加法表达式 </p>
 * <p>@Date 2024/1/24</p>
 */
public class AddExpression  implements Expression {
    private final Expression leftExpression;
    private final Expression rightExpression;

    public AddExpression(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public int interpret() {
        return leftExpression.interpret() + rightExpression.interpret();
    }
}
