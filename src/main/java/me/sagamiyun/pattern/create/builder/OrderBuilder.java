package me.sagamiyun.pattern.create.builder;

/**
 * @author SagamiYun
 * <p>@ClassName OrderBuilder</p>
 * <p>@Description TODO </p>
 * <p>@Date 2024/1/23</p>
 */
public class OrderBuilder {
    private String productId;
    private String userId;
    private String addressId;
    private int quantity;

    public OrderBuilder setProductId(String productId) {
        this.productId = productId;
        return this;
    }

    public OrderBuilder setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public OrderBuilder setAddressId(String addressId) {
        this.addressId = addressId;
        return this;
    }

    public OrderBuilder setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public Order build() {
        return new Order(productId, userId, addressId, quantity);
    }
}
