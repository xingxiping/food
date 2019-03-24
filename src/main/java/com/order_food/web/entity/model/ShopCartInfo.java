package com.order_food.web.entity.model;

import java.util.Date;

/**
 * 购物车实体
 * <p>
 * Created by xingxiping on 2019/3/24.
 */
public class ShopCartInfo {

    /**
     * 主键id
     */
    private Long id;

    /**
     * 用户主键id
     */
    private Long userId;

    /**
     * 商品主键id
     */
    private Long productId;

    /**
     * 商品数量
     */
    private Integer number;

    /**
     * 创建时间
     */
    private Date ct;

    /**
     * 修改时间
     */
    private Date ut;

    public Long getId() {
        return id;
    }

    public ShopCartInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getUserId() {
        return userId;
    }

    public ShopCartInfo setUserId(Long userId) {
        this.userId = userId;
        return this;
    }

    public Long getProductId() {
        return productId;
    }

    public ShopCartInfo setProductId(Long productId) {
        this.productId = productId;
        return this;
    }

    public Integer getNumber() {
        return number;
    }

    public ShopCartInfo setNumber(Integer number) {
        this.number = number;
        return this;
    }

    public Date getCt() {
        return ct;
    }

    public ShopCartInfo setCt(Date ct) {
        this.ct = ct;
        return this;
    }

    public Date getUt() {
        return ut;
    }

    public ShopCartInfo setUt(Date ut) {
        this.ut = ut;
        return this;
    }
}
