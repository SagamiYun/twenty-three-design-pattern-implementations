package me.sagamiyun.pattern.create;

/**
 * @author SagamiYun
 * <p>@ClassName Prototype</p>
 * <p>@Description 原型模式 </p>
 * <p>@Date 2024/1/23</p>
 */
public class Prototype implements Cloneable {

    private String name;

    public Prototype(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
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
