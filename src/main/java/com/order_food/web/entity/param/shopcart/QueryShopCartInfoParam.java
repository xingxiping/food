package com.order_food.web.entity.param.shopcart;

/**
 * 查询购物车信息
 * Created by xingxiping on 2019/4/2.
 */
public class QueryShopCartInfoParam {

    /**
     * 用户主键id
     */
    private Long userId;

    public Long getUserId() {
        return userId;
    }

    public QueryShopCartInfoParam setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
}
