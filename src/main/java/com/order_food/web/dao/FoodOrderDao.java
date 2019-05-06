package com.order_food.web.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.order_food.web.entity.model.FoodOrder;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 订单
 * Created by xingxiping on 2019/5/6.
 */
@Component
@Mapper
public interface FoodOrderDao extends BaseMapper<FoodOrder> {

    /**
     * 根据用户id，查询订单列表
     *
     * @param userId
     * @return
     */
    @Select("select * from food_order where user_id = #{userId}")
    List<FoodOrder> queryByUserId(@Param("userId") Long userId);
}
