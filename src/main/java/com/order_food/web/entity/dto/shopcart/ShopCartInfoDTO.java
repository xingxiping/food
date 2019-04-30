package com.order_food.web.entity.dto.shopcart;

/**
 * 购物车详情
 */
public class ShopCartInfoDTO {

    /**
     * 主键id
     */
    private Long id;

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
     * 产品实际价格
     */
    private Long price;

    /**
     * 购买商品数量
     */
    private Integer number;

    public Long getId() {
        return id;
    }

    public ShopCartInfoDTO setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getProductId() {
        return productId;
    }

    public ShopCartInfoDTO setProductId(Long productId) {
        this.productId = productId;
        return this;
    }

    public String getProductName() {
        return productName;
    }

    public ShopCartInfoDTO setProductName(String productName) {
        this.productName = productName;
        return this;
    }

    public String getProductImg() {
        return productImg;
    }

    public ShopCartInfoDTO setProductImg(String productImg) {
        this.productImg = productImg;
        return this;
    }

    public String getBannerProductImg() {
        return bannerProductImg;
    }

    public ShopCartInfoDTO setBannerProductImg(String bannerProductImg) {
        this.bannerProductImg = bannerProductImg;
        return this;
    }

    public String getProductIntro() {
        return productIntro;
    }

    public ShopCartInfoDTO setProductIntro(String productIntro) {
        this.productIntro = productIntro;
        return this;
    }

    public String getProductGrade() {
        return productGrade;
    }

    public ShopCartInfoDTO setProductGrade(String productGrade) {
        this.productGrade = productGrade;
        return this;
    }

    public Long getPrice() {
        return price;
    }

    public ShopCartInfoDTO setPrice(Long price) {
        this.price = price;
        return this;
    }

    public Integer getNumber() {
        return number;
    }

    public ShopCartInfoDTO setNumber(Integer number) {
        this.number = number;
        return this;
    }
}
