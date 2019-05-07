package com.order_food.web.entity.dto.shipAddress;

public class ShipAddressInfoDTO {

    private Long id;
    /**
     * 用户id
     */
    private Long userId;

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


    public Long getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public ShipAddressInfoDTO setUserId(Long userId) {
        this.userId = userId;
        return this;
    }

    public ShipAddressInfoDTO setName(String name) {
        this.name = name;
        return this;
    }

    public ShipAddressInfoDTO setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public ShipAddressInfoDTO setAddress(String address) {
        this.address = address;
        return this;
    }

    public ShipAddressInfoDTO setId(Long id) {
        this.id = id;
        return this;
    }

    public String getIsDefault() {
        return isDefault;
    }

    public ShipAddressInfoDTO setIsDefault(String isDefault) {
        this.isDefault = isDefault;
        return this;
    }
}
