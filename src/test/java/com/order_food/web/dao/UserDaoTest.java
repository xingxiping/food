package com.order_food.web.dao;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.order_food.web.BaseTest;
import com.order_food.web.entity.model.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserDaoTest extends BaseTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void queryUserByPage(){

        Page<User> queryPage = new Page<>();
        queryPage.setPageNum(1);
        queryPage.setPageSize(1);

        PageHelper.startPage(2, 1);

        Page<User> resultPage = userDao.queryUserByPage();

        System.out.println(resultPage.getPages());

        System.out.println(JSONObject.toJSONString(resultPage));

    }


}
