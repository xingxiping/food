package com.order_food.web.entity.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 订单
 * Created by xingxiping on 2019/5/2.
 */
public class FoodOrder {
    /**
     * 主见id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 地址id
     */
    private Long addressId;


    /**
     * 订单总金额
     */
    private BigDecimal totalAmount;

    /**
     * 配送时间
     */
    private Date shippingTime;

    /**
     * 工单状态
     */
    private String status;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 创建时间
     */
    private Date createTime;

    public Long getId() {
        return id;
    }

    public FoodOrder setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getUserId() {
        return userId;
    }

    public FoodOrder setUserId(Long userId) {
        this.userId = userId;
        return this;
    }

    public Long getAddressId() {
        return addressId;
    }

    public FoodOrder setAddressId(Long addressId) {
        this.addressId = addressId;
        return this;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public FoodOrder setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }

    public Date getShippingTime() {
        return shippingTime;
    }

    public FoodOrder setShippingTime(Date shippingTime) {
        this.shippingTime = shippingTime;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public FoodOrder setStatus(String status) {
        this.status = status;
        return this;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public FoodOrder setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public FoodOrder setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }
}
