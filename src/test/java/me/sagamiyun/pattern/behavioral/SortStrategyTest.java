package me.sagamiyun.pattern.behavioral;

import me.sagamiyun.pattern.behavioral.strategy.BubbleSortStrategy;
import me.sagamiyun.pattern.behavioral.strategy.QuickSortStrategy;
import me.sagamiyun.pattern.behavioral.strategy.Sorter;
import org.junit.jupiter.api.Test;

/**
 * @author SagamiYun
 * <p>@ClassName SortStrategyTest</p>
 * <p>@Description 策略模式 排序测试 </p>
 * <p>@Date 2024/1/24</p>
 */
public class SortStrategyTest {

    @Test
    public void testSortStrategy() {
        int[] numbers = {5, 2, 4, 6, 1, 3};
        Sorter sorter = new Sorter(new BubbleSortStrategy());
        sorter.sort(numbers);
        // 断言排序结果

        sorter = new Sorter(new QuickSortStrategy());
        sorter.sort(numbers);
        // 断言排序结果
    }
}
