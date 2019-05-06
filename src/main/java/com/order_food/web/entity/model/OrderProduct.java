package com.order_food.web.entity.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 订单商品
 * <p>
 * Created by xingxiping on 2019/5/2.
 */
public class OrderProduct {

    /**
     * 商品id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 订单id
     */
    private Long orderId;

    /**
     * 商品id
     */
    private Long productId;

    /**
     * 购买数量
     */
    private Integer size;

    /**
     * 单价
     */
    private BigDecimal unitPrice;

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

    public OrderProduct setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getOrderId() {
        return orderId;
    }

    public OrderProduct setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }

    public Long getProductId() {
        return productId;
    }

    public OrderProduct setProductId(Long productId) {
        this.productId = productId;
        return this;
    }

    public Integer getSize() {
        return size;
    }

    public OrderProduct setSize(Integer size) {
        this.size = size;
        return this;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public OrderProduct setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
        return this;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public OrderProduct setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public OrderProduct setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }
}
