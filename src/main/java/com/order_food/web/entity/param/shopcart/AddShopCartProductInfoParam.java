package com.order_food.web.entity.param.shopcart;

/**
 * 新增购物车信息
 * <p>
 * Created by xingxiping on 2019/4/2.
 */
public class AddShopCartProductInfoParam {

    /**
     * 购物车id
     */
    private Long id;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 商品id
     */
    private Long productId;

    /**
     * 数量
     */
    private Integer number;

    public Long getId() {
        return id;
    }

    public AddShopCartProductInfoParam setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getUserId() {
        return userId;
    }

    public AddShopCartProductInfoParam setUserId(Long userId) {
        this.userId = userId;
        return this;
    }

    public Long getProductId() {
        return productId;
    }

    public AddShopCartProductInfoParam setProductId(Long productId) {
        this.productId = productId;
        return this;
    }

    public Integer getNumber() {
        return number;
    }

    public AddShopCartProductInfoParam setNumber(Integer number) {
        this.number = number;
        return this;
    }
}
