package me.sagamiyun.pattern.behavioral.strategy;

/**
 * @author SagamiYun
 * <p>@ClassName Sorter</p>
 * <p>@Description 排序器 </p>
 * <p>@Date 2024/1/24</p>
 */
public class Sorter {
    private final SortStrategy strategy;

    public Sorter(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void sort(int[] numbers) {
        strategy.sort(numbers);
    }
}
