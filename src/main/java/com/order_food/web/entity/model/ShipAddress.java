package com.order_food.web.entity.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.util.Date;

/**
 * 配送地址
 * <p>
 * Created by xingxiping on 2019/5/2.
 */
public class ShipAddress {

    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 用户id
     */
    private Long user_id;

    /**
     * 收获人姓名
     */
    private String name;

    /**
     * 收获人手机号
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

    /**
     * 是否默认
     */
    private String isDefault;

    /**
     * 修改时间
     */
    private Date update_time;

    /**
     * 创建时间
     */
    private Date create_time;

    public Long getId() {
        return id;
    }

    public ShipAddress setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getUser_id() {
        return user_id;
    }

    public ShipAddress setUser_id(Long user_id) {
        this.user_id = user_id;
        return this;
    }

    public String getName() {
        return name;
    }

    public ShipAddress setName(String name) {
        this.name = name;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public ShipAddress setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getProvince() {
        return province;
    }

    public ShipAddress setProvince(String province) {
        this.province = province;
        return this;
    }

    public String getCity() {
        return city;
    }

    public ShipAddress setCity(String city) {
        this.city = city;
        return this;
    }

    public String getCounty() {
        return county;
    }

    public ShipAddress setCounty(String county) {
        this.county = county;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public ShipAddress setAddress(String address) {
        this.address = address;
        return this;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public ShipAddress setUpdate_time(Date update_time) {
        this.update_time = update_time;
        return this;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public ShipAddress setCreate_time(Date create_time) {
        this.create_time = create_time;
        return this;
    }

    public String getIsDefault() {
        return isDefault;
    }

    public ShipAddress setIsDefault(String isDefault) {
        this.isDefault = isDefault;
        return this;
    }
}
