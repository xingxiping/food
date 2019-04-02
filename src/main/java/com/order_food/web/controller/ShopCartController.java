package com.order_food.web.controller;

import com.order_food.web.service.ShopCartInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * 购物车接口
 */
@Controller()
public class ShopCartController {

    private static final Logger logger = LoggerFactory.getLogger(ShopCartController.class);

    @Autowired
    private ShopCartInfoService shopCartInfoService;

    private String SHOP_CART_URL = "shopcart";

    @RequestMapping("/shopcart")
    public String shopcart(Model model, HttpServletRequest request) {
//        model.
        return SHOP_CART_URL;
    }

}
