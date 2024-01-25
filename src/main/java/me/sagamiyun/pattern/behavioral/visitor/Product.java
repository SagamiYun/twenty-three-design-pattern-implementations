package me.sagamiyun.pattern.behavioral.visitor;

/**
 * @author SagamiYun
 * <p>@InterfaceName Product</p>
 * <p>@Description 访客者模式 产品接口 </p>
 * <p>@Date 2024/1/24</p>
 */
public interface Product {
    void accept(Visitor visitor);
}
