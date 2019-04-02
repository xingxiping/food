package com.order_food.web.entity.param.user;

/**
 * 登陆参数
 * <p>
 * Created by xingxiping on 2019/4/1.
 */
public class LoginParam {

    /**
     * 手机号
     */
    private String phone;

    /**
     * 验证码
     */
    private String validCode;

    public String getPhone() {
        return phone;
    }

    public LoginParam setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getValidCode() {
        return validCode;
    }

    public LoginParam setValidCode(String validCode) {
        this.validCode = validCode;
        return this;
    }
}
