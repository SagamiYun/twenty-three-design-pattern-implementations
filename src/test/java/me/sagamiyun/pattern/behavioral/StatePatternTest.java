package me.sagamiyun.pattern.behavioral;

import me.sagamiyun.pattern.behavioral.state.Document;
import me.sagamiyun.pattern.behavioral.state.Published;
import me.sagamiyun.pattern.behavioral.state.Review;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author SagamiYun
 * <p>@ClassName StatePatternTest</p>
 * <p>@Description 状态模式测试类 </p>
 * <p>@Date 2024/1/24</p>
 */
public class StatePatternTest {

    @Test
    public void testDocumentState() {
        Document document = new Document();
        document.publish();
        assertTrue(document.getState() instanceof Published);

        document = new Document();
        document.review();
        assertTrue(document.getState() instanceof Review);
    }
}
