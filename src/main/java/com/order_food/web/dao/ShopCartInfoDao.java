package com.order_food.web.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.order_food.web.entity.model.ShopCartInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 购物车dao
 * Created by xingxiping on 2019/3/24.
 */
@Mapper
@Repository
public interface ShopCartInfoDao extends BaseMapper<ShopCartInfo> {

    @Select("select * from shop_cart_info where user_id = #{userId}")
    List<ShopCartInfo> queryByUserId(@Param("userId") Long userId);
}
