package com.order_food.web.controller;

import com.order_food.web.content.GeneralResponseEnum;
import com.order_food.web.entity.dto.GeneralResponseVO;
import com.order_food.web.entity.model.FoodOrder;
import com.order_food.web.entity.param.order.CreateOrderParam;
import com.order_food.web.service.FoodOrderService;
import com.order_food.web.service.OrderProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 订单信息操作
 * Created by xingxiping on 2019/5/2.
 */
@Controller
@RequestMapping("/order")
public class FoodOrderController {

    @Autowired
    private FoodOrderService foodOrderService;

    @Autowired
    private OrderProductService orderProductService;


    /**
     * 创建/生成订单
     *
     * @param param
     * @return
     */
    @RequestMapping("/create")
    @ResponseBody
    public GeneralResponseVO<Void> createOrder(@RequestBody CreateOrderParam param) {
        FoodOrder foodOrder = foodOrderService.createOrder(param.getUserId(), param.getAddressId(), param.getTotalAmount()); //保存订单信息

        param.getProductSize().forEach(ps -> { //保存订单商品信息
            orderProductService.saveOrderProducts(foodOrder.getId(), ps.getProductId(), ps.getSize(), ps.getUnitPrice());
        });
        return GeneralResponseEnum.SUCCESS.getFfGeneralResponseVO();
    }
}
