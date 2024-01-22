package me.sagamiyun.pattern.create.builder;

import lombok.Data;

/**
 * @author SagamiYun
 * <p>@ClassName Order</p>
 * <p>@Description 该类包含了一个订单的各种属性，如 productId、userId、addressId、quantity 等 </p>
 * <p>@Date 2024/1/23</p>
 */

@Data
public class Order {
    private String productId;
    private String userId;
    private String addressId;
    private int quantity;

    public Order(String productId, String userId, String addressId, int quantity) {
        this.productId = productId;
        this.userId = userId;
        this.addressId = addressId;
        this.quantity = quantity;
    }
}

