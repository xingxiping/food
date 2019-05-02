package com.order_food.web.entity.param.order;

import java.math.BigDecimal;
import java.util.List;

/**
 * 创建工单入参
 * <p>
 * Created by xingxiping on 2019/5/2.
 */
public class CreateOrderParam {

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

    public CreateOrderParam setUserId(Long userId) {
        this.userId = userId;
        return this;
    }

    public Long getAddressId() {
        return addressId;
    }

    public CreateOrderParam setAddressId(Long addressId) {
        this.addressId = addressId;
        return this;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public CreateOrderParam setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }

    public List<ProductSizeParam> getProductSize() {
        return productSize;
    }

    public CreateOrderParam setProductSize(List<ProductSizeParam> productSize) {
        this.productSize = productSize;
        return this;
    }
}
