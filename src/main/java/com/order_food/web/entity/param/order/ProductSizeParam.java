package com.order_food.web.entity.param.order;

import java.math.BigDecimal;

/**
 * 商品数量
 * <p>
 * Created by xingxiping on 2019/5/2.
 */
public class ProductSizeParam {

    /**
     * 商品主见id
     */
    private Long productId;

    /**
     * 单价
     */
    private BigDecimal unitPrice;

    /**
     * 购买数量
     */
    private Integer size;

    public Long getProductId() {
        return productId;
    }

    public ProductSizeParam setProductId(Long productId) {
        this.productId = productId;
        return this;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public ProductSizeParam setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
        return this;
    }

    public Integer getSize() {
        return size;
    }

    public ProductSizeParam setSize(Integer size) {
        this.size = size;
        return this;
    }
}
