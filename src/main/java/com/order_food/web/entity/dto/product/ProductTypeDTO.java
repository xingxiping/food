package com.order_food.web.entity.dto.product;

/**
 * 菜品类型
 */
public class ProductTypeDTO {

    /**
     * 类型编码
     */
    private String code;

    /**
     * 名称
     */
    private String desc;

    public String getCode() {
        return code;
    }

    public ProductTypeDTO setCode(String code) {
        this.code = code;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public ProductTypeDTO setDesc(String desc) {
        this.desc = desc;
        return this;
    }
}
