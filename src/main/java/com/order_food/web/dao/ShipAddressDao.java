package com.order_food.web.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.order_food.web.entity.model.ShipAddress;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 配送地址
 * <p>
 * Created by xingxiping on 2019/3/20.
 */
@Mapper
@Repository
public interface ShipAddressDao extends BaseMapper<ShipAddress> {

    @Select("select * from ship_address where user_id = #{userId} order by is_default asc, update_time desc")
    List<ShipAddress> queryByUserId(@Param("userId") Long userId);

}
