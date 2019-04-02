package com.order_food.web.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.order_food.web.entity.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * 功能描述:dao层  ，数据库持久层类，(表USER)
 *
 * @author yln
 * @version 1.0.0
 */
@Mapper
@Component
public interface UserDao extends BaseMapper<User> {

}
