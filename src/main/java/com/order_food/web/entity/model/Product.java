package com.order_food.web.entity.model;

import java.math.BigDecimal;
import java.util.Date;

public class Product {

    /**
     * 产品主键id
     */
    private String productId;

    /**
     * 标题
     */
    private String title;

    /**
     * 图片路径
     */
    private String projectImg;

    /**
     * 价格
     */
    private BigDecimal price;

    /**
     * 状态
     */
    private String status;

    /**
     * 内容描述
     */
    private String comments;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 创建人
     */
    private String creatorId;

    public String getProductId() {
        return productId;
    }

    public Product setProductId(String productId) {
        this.productId = productId;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Product setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getProjectImg() {
        return projectImg;
    }

    public Product setProjectImg(String projectImg) {
        this.projectImg = projectImg;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Product setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public Product setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getComments() {
        return comments;
    }

    public Product setComments(String comments) {
        this.comments = comments;
        return this;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public Product setCreateDate(Date createDate) {
        this.createDate = createDate;
        return this;
    }

    public String getCreatorId() {
        return creatorId;
    }

    public Product setCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }
}
