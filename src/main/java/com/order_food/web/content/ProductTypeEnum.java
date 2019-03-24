package com.order_food.web.content;

import com.order_food.web.entity.dto.product.ProductTypeDTO;
import org.thymeleaf.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 菜品类型枚举类
 */
public enum ProductTypeEnum {
    ALL("1", "所有"),
    SIGN("2", "招牌菜"),

    STEW("3", "炖菜"),
    STIR_FRY("4", "爆炒"),
    COLD_DISH("5", "凉菜"),
    STAPLE("6", "主食"),

    DRINKS("7", "酒水");

    private String code;

    private String desc;


    /**
     * 根据code，查询枚举
     *
     * @param code
     * @return
     */
    public static ProductTypeEnum getProductTypeByCode(String code) {
        if (StringUtils.isEmpty(code)) {
            return null;
        }

        for (ProductTypeEnum typeEnum : ProductTypeEnum.values()) {
            if (typeEnum.getCode().equals(code)) {
                return typeEnum;
            }
        }
        return null;
    }

    /**
     * 根据枚举，获取类型实体列表
     *
     * @return
     */
    public static List<ProductTypeDTO> getProductTypeDTOs() {
        ProductTypeEnum[] productTypeEnums = ProductTypeEnum.values();
        List<ProductTypeDTO> productTypeDTOS = new ArrayList<>();

        for (ProductTypeEnum anEnum : productTypeEnums) {
            ProductTypeDTO productTypeDTO = new ProductTypeDTO()
                    .setCode(anEnum.getCode())
                    .setDesc(anEnum.getDesc());
            productTypeDTOS.add(productTypeDTO);
        }
        return productTypeDTOS;
    }

    ProductTypeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public ProductTypeEnum setCode(String code) {
        this.code = code;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public ProductTypeEnum setDesc(String desc) {
        this.desc = desc;
        return this;
    }
}
