package me.sagamiyun.pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SagamiYun
 * <p>@ClassName Directory</p>
 * <p>@Description 文件夹类 </p>
 * <p>@Date 2024/1/23</p>
 */
public class Directory extends FileComponent {
    private final String name;
    private final List<FileComponent> components = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public void add(FileComponent fileComponent) {
        components.add(fileComponent);
    }

    @Override
    public void remove(FileComponent fileComponent) {
        components.remove(fileComponent);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void display() {
        System.out.println(getName());
        for (FileComponent component : components) {
            component.display();
        }
    }
}
