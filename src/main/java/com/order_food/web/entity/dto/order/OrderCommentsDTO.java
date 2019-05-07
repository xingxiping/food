package com.order_food.web.entity.dto.order;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by xingxiping on 2019/5/8.
 */
public class OrderCommentsDTO {

    private Long id;

    private Long orderId;

    private String comments;

    private Date createTime;

    private String createTimeStr;

    public String getCreateTimeStr() {
        if (createTime != null) {
            SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            return sf.format(createTime);
        }

        return createTimeStr;
    }

    public OrderCommentsDTO setCreateTimeStr(String createTimeStr) {
        this.createTimeStr = createTimeStr;
        return this;
    }

    public Long getId() {
        return id;
    }

    public OrderCommentsDTO setId(Long id) {
        this.id = id;
        return this;
    }

    public String getComments() {
        return comments;
    }

    public OrderCommentsDTO setComments(String comments) {
        this.comments = comments;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public OrderCommentsDTO setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Long getOrderId() {
        return orderId;
    }

    public OrderCommentsDTO setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
}
