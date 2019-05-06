package com.order_food.web.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.order_food.web.entity.model.OrderProduct;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 订单关联商品信息
 * <p>
 * Created by xingxiping on 2019/5/6.
 */
@Component
@Mapper
public interface OrderProductDao extends BaseMapper<OrderProduct> {

    /**
     * 根据订单号，查询商品信息
     *
     * @param orderId 订单号
     * @return
     */
    @Select("select * from order_product where order_id = #{orderId}")
    List<OrderProduct> queryByOrderId(@Param("orderId") Long orderId);
}
