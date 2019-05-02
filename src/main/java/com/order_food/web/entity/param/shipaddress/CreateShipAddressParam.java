package com.order_food.web.entity.param.shipaddress;

/**
 * 创建配送地址入参
 * <p>
 * Created by xingxiping on 2019/5/2.
 */
public class CreateShipAddressParam {

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
     * 省
     */
    private String province;

    /**
     * 市
     */
    private String city;

    /**
     * 县
     */
    private String county;

    /**
     * 详细地址
     */
    private String address;

    public Long getUserId() {
        return userId;
    }

    public CreateShipAddressParam setUserId(Long userId) {
        this.userId = userId;
        return this;
    }

    public String getName() {
        return name;
    }

    public CreateShipAddressParam setName(String name) {
        this.name = name;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public CreateShipAddressParam setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getProvince() {
        return province;
    }

    public CreateShipAddressParam setProvince(String province) {
        this.province = province;
        return this;
    }

    public String getCity() {
        return city;
    }

    public CreateShipAddressParam setCity(String city) {
        this.city = city;
        return this;
    }

    public String getCounty() {
        return county;
    }

    public CreateShipAddressParam setCounty(String county) {
        this.county = county;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public CreateShipAddressParam setAddress(String address) {
        this.address = address;
        return this;
    }
}
