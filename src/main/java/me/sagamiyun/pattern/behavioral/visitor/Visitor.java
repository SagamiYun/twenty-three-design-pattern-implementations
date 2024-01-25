package me.sagamiyun.pattern.behavioral.visitor;

/**
 * @author SagamiYun
 * <p>@InterfaceName Visitor</p>
 * <p>@Description 访问者接口 </p>
 * <p>@Date 2024/1/24</p>
 */
public interface Visitor {
    void visit(Book book);
    void visit(Electronic electronic);
}
