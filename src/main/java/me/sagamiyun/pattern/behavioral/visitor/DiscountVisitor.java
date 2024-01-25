package me.sagamiyun.pattern.behavioral.visitor;

/**
 * @author SagamiYun
 * <p>@ClassName DiscountVisitor</p>
 * <p>@Description 享有折扣者 </p>
 * <p>@Date 2024/1/24</p>
 */
public class DiscountVisitor implements Visitor {
    @Override
    public void visit(Book book) {
        System.out.println("Apply 10% discount on books.");
    }

    @Override
    public void visit(Electronic electronic) {
        System.out.println("Apply 20% discount on electronics.");
    }
}
