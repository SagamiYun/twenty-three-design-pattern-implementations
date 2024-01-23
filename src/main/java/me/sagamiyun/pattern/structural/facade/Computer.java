package me.sagamiyun.pattern.structural.facade;

/**
 * @author SagamiYun
 * <p>@ClassName Computer</p>
 * <p>@Description 外观类 </p>
 * <p>@Date 2024/1/23</p>
 */
public class Computer {
    private final CPU cpu;
    private final Memory memory;
    private final HardDrive hardDrive;

    public Computer() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void start() {
        cpu.start();
        memory.start();
        hardDrive.start();
    }
}
