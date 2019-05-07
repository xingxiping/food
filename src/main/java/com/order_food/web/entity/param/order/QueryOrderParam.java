package com.order_food.web.entity.param.order;

import java.math.BigDecimal;
import java.util.List;

public class QueryOrderParam {


    /**
     * 用户id
     */
    private Long userId;

    /**
     * 配送地址id
     */
    private Long addressId;

    /**
     * 订单总金额
     */
    private BigDecimal totalAmount;

    /**
     * 订单关联商品信息
     */
    private List<ProductSizeParam> productSize;

    public Long getUserId() {
        return userId;
    }

    public QueryOrderParam setUserId(Long userId) {
        this.userId = userId;
        return this;
    }

    public Long getAddressId() {
        return addressId;
    }

    public QueryOrderParam setAddressId(Long addressId) {
        this.addressId = addressId;
        return this;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public QueryOrderParam setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }

    public List<ProductSizeParam> getProductSize() {
        return productSize;
    }

    public QueryOrderParam setProductSize(List<ProductSizeParam> productSize) {
        this.productSize = productSize;
        return this;
    }
}
