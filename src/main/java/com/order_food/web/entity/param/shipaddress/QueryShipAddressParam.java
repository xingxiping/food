package com.order_food.web.entity.param.shipaddress;

public class QueryShipAddressParam {
    /**
     * 用户主键id
     */
    private Long userId;

    public QueryShipAddressParam setUserId(Long userId) {
        this.userId = userId;
        return this;
    }

    public Long getUserId() {

        return userId;
    }
}

