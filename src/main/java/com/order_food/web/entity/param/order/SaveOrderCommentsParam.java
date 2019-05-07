package com.order_food.web.entity.param.order;

/**
 * Created by xingxiping on 2019/5/8.
 */
public class SaveOrderCommentsParam {

    private Long userId;

    private Long orderId;

    private String comments;

    public Long getUserId() {
        return userId;
    }

    public SaveOrderCommentsParam setUserId(Long userId) {
        this.userId = userId;
        return this;
    }

    public Long getOrderId() {
        return orderId;
    }

    public SaveOrderCommentsParam setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }

    public String getComments() {
        return comments;
    }

    public SaveOrderCommentsParam setComments(String comments) {
        this.comments = comments;
        return this;
    }
}
