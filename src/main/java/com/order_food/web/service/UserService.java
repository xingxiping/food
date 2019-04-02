package com.order_food.web.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.order_food.web.dao.UserDao;
import com.order_food.web.entity.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    /**
     * 根据手机号，查询用户信息
     *
     * @param phone 手机号
     * @return
     */
    public User queryUserByPhone(String phone) {
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(User::getPhone, phone);
        return userDao.selectOne(queryWrapper);
    }


    /**
     * 保存/创建用户
     *
     * @param phone 手机号
     */
    public User saveUser(String phone) {
        Date now = new Date();
        User user = new User()
                .setPhone(phone)
                .setCreateTime(now)
                .setUpdateTime(now);
        userDao.insert(user);
        return user;
    }
}
