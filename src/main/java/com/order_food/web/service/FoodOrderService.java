package com.order_food.web.service;

import com.order_food.web.content.FoodOrderStatusEnum;
import com.order_food.web.dao.FoodOrderDao;
import com.order_food.web.entity.model.FoodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 订单相关
 * <p>
 * Created by xingxiping on 2019/5/6.
 */
@Service
public class FoodOrderService {

    @Autowired
    private FoodOrderDao foodOrderDao;

    /**
     * 查询用户订单信息
     *
     * @param userId
     * @return
     */
    public List<FoodOrder> queryUserOrders(Long userId) {
        return foodOrderDao.queryByUserId(userId);
    }

    /**
     * 创建订单
     *
     * @param userId      用户id
     * @param addressId   地址id
     * @param totalAmount 订单总金额
     */
    public FoodOrder createOrder(Long userId, Long addressId, BigDecimal totalAmount) {
        Date now = new Date();

        FoodOrder foodOrder = new FoodOrder()
                .setUserId(userId)
                .setAddressId(addressId)
                .setTotalAmount(totalAmount)
                .setShippingTime(new Date(now.getTime() + 30 * 60 * 1000L))
                .setStatus(FoodOrderStatusEnum.ORDER_STATUS_000.getStatus())
                .setUpdateTime(now)
                .setCreateTime(now);

        foodOrderDao.insert(foodOrder);
        return foodOrder;
    }
}
