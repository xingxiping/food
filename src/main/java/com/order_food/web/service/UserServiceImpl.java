package com.order_food.web.service;

import com.order_food.web.dao.UserDao;
import com.order_food.web.entity.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl {

    @Autowired
    private UserDao userDao;

    public List<User> queryUserInfos(){

        return null;
    }
}
