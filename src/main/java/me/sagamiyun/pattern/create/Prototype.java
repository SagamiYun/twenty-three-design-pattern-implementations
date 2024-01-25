package me.sagamiyun.pattern.create;

import lombok.Getter;

/**
 * @author SagamiYun
 * <p>@ClassName Prototype</p>
 * <p>@Description 原型模式 </p>
 * <p>@Date 2024/1/23</p>
 */
@Getter
public class Prototype implements Cloneable {

    private final String name;

    public Prototype(String name) {
        this.name = name;
    }

    @Override
    public Prototype clone() {
        try {
            return (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
