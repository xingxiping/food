package com.order_food.web.entity.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.util.Date;

/**
 * 订单评论
 * Created by xingxiping on 2019/5/8.
 */
public class OrderComments {

    /**
     * 主见id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    private Long userId;

    private Long orderId;

    private String comments;

    private Date createTime;

    public Long getId() {
        return id;
    }

    public OrderComments setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getUserId() {
        return userId;
    }

    public OrderComments setUserId(Long userId) {
        this.userId = userId;
        return this;
    }

    public Long getOrderId() {
        return orderId;
    }

    public OrderComments setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }

    public String getComments() {
        return comments;
    }

    public OrderComments setComments(String comments) {
        this.comments = comments;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public OrderComments setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }
}
