package me.sagamiyun.pattern.behavioral.iterator;

import lombok.Data;

/**
 * @author SagamiYun
 * <p>@ClassName Book</p>
 * <p>@Description 迭代器模式 书籍对象 </p>
 * <p>@Date 2024/1/24</p>
 */

@Data
public class Book {
    private final String name;

    public Book(String name) {
        this.name = name;
    }
}
