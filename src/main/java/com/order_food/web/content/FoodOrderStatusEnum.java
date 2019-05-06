package com.order_food.web.content;

/**
 * 工单状态枚举
 * Created by xingxiping on 2019/5/6.
 */
public enum FoodOrderStatusEnum {

    ORDER_STATUS_000("000", "初始化"),
    ORDER_STATUS_010("010", "待支付"),
    ORDER_STATUS_012("021", "支付失败"),
    ORDER_STATUS_020("020", "待配送"),
    ORDER_STATUS_021("021", "配送成功"),
    ORDER_STATUS_023("023", "配送中"),
    ORDER_STATUS_022("022", "送餐失败"),
    ORDER_STATUS_100("100", "完成");

    private String status;

    private String desc;

    FoodOrderStatusEnum(String status, String desc) {
        this.status = status;
        this.desc = desc;
    }

    public String getStatus() {
        return status;
    }

    public String getDesc() {
        return desc;
    }
}
