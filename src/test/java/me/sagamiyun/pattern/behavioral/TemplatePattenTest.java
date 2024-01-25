package me.sagamiyun.pattern.behavioral;

import me.sagamiyun.pattern.behavioral.template.ClassificationTask;
import me.sagamiyun.pattern.behavioral.template.ClusteringTask;
import me.sagamiyun.pattern.behavioral.template.DataMiningTask;
import org.junit.jupiter.api.Test;

/**
 * @author SagamiYun
 * <p>@ClassName TemplatePattenTest</p>
 * <p>@Description 模板方法测试 </p>
 * <p>@Date 2024/1/24</p>
 */
public class TemplatePattenTest {

    @Test
    public void testClusteringTask() {
        DataMiningTask task = new ClusteringTask();
        task.executeTask();

        task = new ClassificationTask();
        task.executeTask();
    }
}
