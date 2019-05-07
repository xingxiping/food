package com.order_food.web.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.order_food.web.dao.OrderCommentsDao;
import com.order_food.web.entity.model.OrderComments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by xingxiping on 2019/5/8.
 */
@Service
public class OrderCommentsService {

    @Autowired
    private OrderCommentsDao orderCommentsDao;

    public List<OrderComments> queryCommentsByUserId(Long userId) {
        LambdaQueryWrapper<OrderComments> wrapper = new LambdaQueryWrapper();
        wrapper.eq(OrderComments::getUserId, userId).orderByDesc(OrderComments::getCreateTime);
        return orderCommentsDao.selectList(wrapper);
    }


    public void addComments(Long userId, Long orderId, String comments) {
        OrderComments orderComments = new OrderComments()
                .setUserId(userId)
                .setOrderId(orderId)
                .setComments(comments)
                .setCreateTime(new Date());

        orderCommentsDao.insert(orderComments);
    }
}
