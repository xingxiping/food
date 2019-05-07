package com.order_food.web.entity.dto.order;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OrderInfoDTO {
    /**
     * 商品id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 订单id
     */
    private Long orderId;

    private Long userId;

    private String name;

    private Long phone;

    private String address;

    private BigDecimal totleAmount;

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

    /**
     * 创建时间-字符串
     */
    private String createTimeStr;

    public String getCreateTimeStr() {
        if (createTime != null) {
            SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            return sf.format(createTime);
        }
        return createTimeStr;
    }

    public OrderInfoDTO setCreateTimeStr(String createTimeStr) {
        this.createTimeStr = createTimeStr;
        return this;
    }

    public Long getId() {
        return id;
    }

    public OrderInfoDTO setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getOrderId() {
        return orderId;
    }

    public OrderInfoDTO setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }

    public Long getProductId() {
        return productId;
    }

    public OrderInfoDTO setProductId(Long productId) {
        this.productId = productId;
        return this;
    }

    public Integer getSize() {
        return size;
    }

    public OrderInfoDTO setSize(Integer size) {
        this.size = size;
        return this;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public OrderInfoDTO setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
        return this;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public OrderInfoDTO setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public OrderInfoDTO setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public OrderInfoDTO setUserId(Long userId) {
        this.userId = userId;
        return this;
    }

    public Long getUserId() {
        return userId;
    }

    public OrderInfoDTO setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public Long getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public OrderInfoDTO setPhone(Long phone) {
        this.phone = phone;
        return this;
    }

    public OrderInfoDTO setAddress(String address) {
        this.address = address;
        return this;
    }

    public BigDecimal getTotleAmount() {
        return totleAmount;
    }

    public OrderInfoDTO setTotleAmount(BigDecimal totleAmount) {
        this.totleAmount = totleAmount;
        return this;
    }
}
