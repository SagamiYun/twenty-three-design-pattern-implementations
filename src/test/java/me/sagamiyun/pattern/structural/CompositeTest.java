package me.sagamiyun.pattern.structural;

import me.sagamiyun.pattern.structural.composite.Directory;
import me.sagamiyun.pattern.structural.composite.File;
import me.sagamiyun.pattern.structural.composite.FileComponent;
import org.junit.jupiter.api.Test;

/**
 * @author SagamiYun
 * <p>@ClassName Composite</p>
 * <p>@Description 组合模式测试类 </p>
 * <p>@Date 2024/1/23</p>
 */
public class CompositeTest {

    @Test
    public void testComposite() {
        // 创建文件
        FileComponent file1 = new File("File1");
        FileComponent file2 = new File("File2");

        // 创建文件夹，并向其中添加文件
        FileComponent directory = new Directory("Directory");
        directory.add(file1);
        directory.add(file2);

        // 测试显示文件和文件夹
        file1.display();
        file2.display();
        directory.display();
    }
}
