package com.order_food.web.controller;

import com.order_food.web.entity.dto.GeneralResponseVO;
import com.order_food.web.entity.param.order.CreateOrderParam;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 订单信息操作
 * Created by xingxiping on 2019/5/2.
 */
@Controller
public class FoodOrderController {

//    private


    /**
     * 创建/生成订单
     *
     * @param param
     * @return
     */
    @RequestMapping("/create/order")
    @ResponseBody
    public GeneralResponseVO<Void> createOrder(@RequestBody CreateOrderParam param) {
        if (param == null) {

        }
        return null;
    }
    /**
     * 查询我的订单列表
     *
     * @return
     */
    @RequestMapping("/orderInformation")
    public String orderInformation(Model model, HttpServletRequest request, HttpServletResponse response) {

        return "orderInformation";
    }

}
