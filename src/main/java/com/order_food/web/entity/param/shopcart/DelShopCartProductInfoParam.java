package com.order_food.web.entity.param.shopcart;

/**
 * 删除购物车信息
 * <p>
 * Created by xingxiping on 2019/4/2.
 */
public class DelShopCartProductInfoParam {

    /**
     * 购物车id
     */
    private Long id;

    /**
     * 用户id
     */
    private Long userId;

    public Long getId() {
        return id;
    }

    public DelShopCartProductInfoParam setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getUserId() {
        return userId;
    }

    public DelShopCartProductInfoParam setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
}
