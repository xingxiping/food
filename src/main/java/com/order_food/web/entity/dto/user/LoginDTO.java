package com.order_food.web.entity.dto.user;

/**
 * 登陆返回参数
 * <p>
 * Created by xingxiping on 2019/4/1.
 */
public class LoginDTO {

    private Long userId;

    public Long getUserId() {
        return userId;
    }

    public LoginDTO setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
}
