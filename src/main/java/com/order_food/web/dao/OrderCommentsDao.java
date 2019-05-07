package com.order_food.web.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.order_food.web.entity.model.OrderComments;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * Created by xingxiping on 2019/5/8.
 */
@Component
@Mapper
public interface OrderCommentsDao extends BaseMapper<OrderComments> {
}
