package com.order_food.web.entity.param.order;

/**
 * Created by xingxiping on 2019/5/8.
 */
public class QueryOrderCommentsParam {

    private Long userId;

    public Long getUserId() {
        return userId;
    }

    public QueryOrderCommentsParam setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
}
