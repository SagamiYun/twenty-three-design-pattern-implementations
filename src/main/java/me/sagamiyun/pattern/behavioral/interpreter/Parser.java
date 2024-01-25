package me.sagamiyun.pattern.behavioral.interpreter;

/**
 * @author SagamiYun
 * <p>@ClassName Parser</p>
 * <p>@Description 解释器 </p>
 * <p>@Date 2024/1/24</p>
 */
public class Parser {
    public Expression parse(String str) {
        // 这里简化了解析过程，只处理形如 "2 + 3 - 4" 的表达式
        String[] elements = str.split(" ");
        Expression left = new NumberExpression(Integer.parseInt(elements[0]));
        for (int i = 1; i < elements.length; i += 2) {
            String operator = elements[i];
            int number = Integer.parseInt(elements[i + 1]);
            switch (operator) {
                case "+":
                    left = new AddExpression(left, new NumberExpression(number));
                    break;
                case "-":
                    left = new SubtractExpression(left, new NumberExpression(number));
                    break;
                default:
                    throw new IllegalArgumentException("Unsupported operator: " + operator);
            }
        }
        return left;
    }
}
