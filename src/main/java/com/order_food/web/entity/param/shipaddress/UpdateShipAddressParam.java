package com.order_food.web.entity.param.shipaddress;

/**
 * 创建配送地址入参
 * <p>
 * Created by xingxiping on 2019/5/2.
 */
public class UpdateShipAddressParam {

    /**
     * id
     */
    private Long id;

    /**
     * 收货人地址
     */
    private String name;

    /**
     * 收货人手机号
     */
    private String phone;


    /**
     * 详细地址
     */
    private String address;

    private String isDefault;

    private Long userId;

    public Long getId() {
        return id;
    }

    public UpdateShipAddressParam setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public UpdateShipAddressParam setName(String name) {
        this.name = name;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public UpdateShipAddressParam setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public UpdateShipAddressParam setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getIsDefault() {
        return isDefault;
    }

    public UpdateShipAddressParam setIsDefault(String isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    public Long getUserId() {
        return userId;
    }

    public UpdateShipAddressParam setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
}
