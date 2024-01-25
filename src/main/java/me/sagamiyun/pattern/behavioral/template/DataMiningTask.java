package me.sagamiyun.pattern.behavioral.template;

/**
 * @author SagamiYun
 * <p>@ClassName DataMiningTask</p>
 * <p>@Description 模板模式 数据挖掘任务 </p>
 * <p>@Date 2024/1/24</p>
 */
public abstract class DataMiningTask {
    // Template method
    public final void executeTask() {
        preprocessData();
        runDataMiningAlgorithm();
        postprocessResults();
    }

    // Steps defined in the template method
    public abstract void preprocessData();
    public abstract void runDataMiningAlgorithm();
    public abstract void postprocessResults();
}
