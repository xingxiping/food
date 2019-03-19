package com.order_food.web.entity.dto.product;

/**
 * 产品详情
 */
public class ProductInfoDTO {

    /**
     * 产品主键id
     */
    private Long productId;

    /**
     * 产品名称
     */
    private String productName;

    /**
     * 产品图片
     */
    private String productImg;

    /**
     * banner位置产品图片
     */
    private String bannerProductImg;

    /**
     * 产品简介
     */
    private String productIntro;

    /**
     * 产品评分
     */
    private String productGrade;

    /**
     * 折扣 单位：百分之
     */
    private Integer dis;

    /**
     * 产品实际价格
     */
    private Long price;

    /**
     * 折扣后价格
     */
    private Long disPrice;

    public Long getProductId() {
        return productId;
    }

    public ProductInfoDTO setProductId(Long productId) {
        this.productId = productId;
        return this;
    }

    public String getProductName() {
        return productName;
    }

    public ProductInfoDTO setProductName(String productName) {
        this.productName = productName;
        return this;
    }

    public String getProductImg() {
        return productImg;
    }

    public ProductInfoDTO setProductImg(String productImg) {
        this.productImg = productImg;
        return this;
    }

    public String getProductIntro() {
        return productIntro;
    }

    public ProductInfoDTO setProductIntro(String productIntro) {
        this.productIntro = productIntro;
        return this;
    }

    public String getProductGrade() {
        return productGrade;
    }

    public ProductInfoDTO setProductGrade(String productGrade) {
        this.productGrade = productGrade;
        return this;
    }

    public Integer getDis() {
        return dis;
    }

    public ProductInfoDTO setDis(Integer dis) {
        this.dis = dis;
        return this;
    }

    public Long getPrice() {
        return price;
    }

    public ProductInfoDTO setPrice(Long price) {
        this.price = price;
        return this;
    }

    public Long getDisPrice() {
        return disPrice;
    }

    public ProductInfoDTO setDisPrice(Long disPrice) {
        this.disPrice = disPrice;
        return this;
    }

    public String getBannerProductImg() {
        return bannerProductImg;
    }

    public ProductInfoDTO setBannerProductImg(String bannerProductImg) {
        this.bannerProductImg = bannerProductImg;
        return this;
    }
}
