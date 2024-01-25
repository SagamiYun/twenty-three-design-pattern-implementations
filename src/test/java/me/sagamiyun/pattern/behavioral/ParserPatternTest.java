package me.sagamiyun.pattern.behavioral;

import me.sagamiyun.pattern.behavioral.interpreter.Expression;
import me.sagamiyun.pattern.behavioral.interpreter.Parser;
import org.junit.jupiter.api.Test;

/**
 * @author SagamiYun
 * <p>@ClassName ParserPatternTest</p>
 * <p>@Description 解释器模式测试类 </p>
 * <p>@Date 2024/1/24</p>
 */
public class ParserPatternTest {

    @Test
    public void testParser() {
        Parser parser = new Parser();
        String expression = "2 + 3 - 4";
        Expression expr = parser.parse(expression);
        System.out.println(expression + " = " + expr.interpret());
    }
}
