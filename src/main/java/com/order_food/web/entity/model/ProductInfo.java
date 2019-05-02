package com.order_food.web.entity.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.util.Date;

public class ProductInfo {

    /**
     * 产品主键id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 视频名称o
     */
    private String productName;

    /**
     * 商品类型
     */
    private String productType;

    /**
     * 图片id
     */
    private Long img;

    /**
     * 小图id
     */
    private Long minImg;

    /**
     * 中图id
     */
    private Long middleImg;

    /**
     * 大图id
     */
    private Long maxImg;

    /**
     * 价格
     */
    private Long price;

    /**
     * 折扣
     */
    private Integer sale;

    /**
     * 评价
     */
    private Integer star;

    /**
     * 是否推荐
     */
    private String recommend;

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
    private Date createTime;

    /**
     * 创建人
     */
    private String operator;

    public Long getId() {
        return id;
    }

    public ProductInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getProductName() {
        return productName;
    }

    public ProductInfo setProductName(String productName) {
        this.productName = productName;
        return this;
    }

    public String getProductType() {
        return productType;
    }

    public ProductInfo setProductType(String productType) {
        this.productType = productType;
        return this;
    }

    public Long getImg() {
        return img;
    }

    public ProductInfo setImg(Long img) {
        this.img = img;
        return this;
    }

    public Long getMinImg() {
        return minImg;
    }

    public ProductInfo setMinImg(Long minImg) {
        this.minImg = minImg;
        return this;
    }

    public Long getMiddleImg() {
        return middleImg;
    }

    public ProductInfo setMiddleImg(Long middleImg) {
        this.middleImg = middleImg;
        return this;
    }

    public Long getMaxImg() {
        return maxImg;
    }

    public ProductInfo setMaxImg(Long maxImg) {
        this.maxImg = maxImg;
        return this;
    }

    public Long getPrice() {
        return price;
    }

    public ProductInfo setPrice(Long price) {
        this.price = price;
        return this;
    }

    public Integer getSale() {
        return sale;
    }

    public ProductInfo setSale(Integer sale) {
        this.sale = sale;
        return this;
    }

    public Integer getStar() {
        return star;
    }

    public ProductInfo setStar(Integer star) {
        this.star = star;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public ProductInfo setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getComments() {
        return comments;
    }

    public ProductInfo setComments(String comments) {
        this.comments = comments;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public ProductInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getOperator() {
        return operator;
    }

    public ProductInfo setOperator(String operator) {
        this.operator = operator;
        return this;
    }

    public String getRecommend() {
        return recommend;
    }

    public ProductInfo setRecommend(String recommend) {
        this.recommend = recommend;
        return this;
    }
}
