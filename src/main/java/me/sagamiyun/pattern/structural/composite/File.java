package me.sagamiyun.pattern.structural.composite;

/**
 * @author SagamiYun
 * <p>@ClassName File</p>
 * <p>@Description 文件类 </p>
 * <p>@Date 2024/1/23</p>
 */
public class File extends FileComponent {
    private final String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void display() {
        System.out.println(getName());
    }
}

