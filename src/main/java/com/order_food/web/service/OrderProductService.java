package com.order_food.web.service;

import com.order_food.web.dao.OrderProductDao;
import com.order_food.web.entity.model.OrderProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 订单商品相关
 * <p>
 * Created by xingxiping on 2019/5/6.
 */
@Service
public class OrderProductService {

    @Autowired
    private OrderProductDao orderProductDao;

    /**
     * 保存订单商品信息
     *
     * @param orderId   订单id
     * @param productId 产品id
     * @param size      数量
     * @param unitPrice 单价
     */
    public void saveOrderProducts(Long orderId, Long productId, Integer size, BigDecimal unitPrice) {

        Date now = new Date();
        OrderProduct orderProduct = new OrderProduct()
                .setOrderId(orderId)
                .setProductId(productId)
                .setSize(size)
                .setUnitPrice(unitPrice)
                .setUpdateTime(now)
                .setCreateTime(now);

        orderProductDao.insert(orderProduct);

    }
}
