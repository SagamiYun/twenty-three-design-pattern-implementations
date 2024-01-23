package me.sagamiyun.pattern.structural.composite;

/**
 * @author SagamiYun
 * <p>@ClassName FileComponent</p>
 * <p>@Description 组合模式文件抽象类 </p>
 * <p>@Date 2024/1/23</p>
 */
public abstract class FileComponent {
    public void add(FileComponent fileComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(FileComponent fileComponent) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        throw new UnsupportedOperationException();
    }

    public abstract void display();
}
