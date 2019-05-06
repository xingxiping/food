package com.order_food.web.controller;

import com.order_food.web.content.ProductTypeEnum;
import com.order_food.web.entity.dto.product.ProductInfoDTO;
import com.order_food.web.entity.dto.product.ProductTypeDTO;
import com.order_food.web.entity.model.ProductInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * 地址相关接口
 */
@Controller()
public class AddressController {

    private static final Logger logger = LoggerFactory.getLogger(AddressController.class);

    private static final String ADDRESS_URL = "address";

    /**
     * 查询首页展示地址信息
     *
     * @return
     */
    @RequestMapping("/address")
    public String queryHomePageAddress(Model model, HttpServletRequest request, HttpServletResponse response) {
        //banner返回数据
        ProductInfoDTO banner = new ProductInfoDTO().setId(1L).setProductImg("/img/banner1.jpg");
        model.addAttribute("banner", banner);


        return ADDRESS_URL;
    }
    /**
     * 新增地址信息
     *
     * @return
     */
    @RequestMapping("/addressSave")
    public String addressSave(Model model, HttpServletRequest request, HttpServletResponse response) {
        //banner返回数据
        ProductInfoDTO banner = new ProductInfoDTO().setId(1L).setProductImg("/img/banner1.jpg");
        model.addAttribute("banner", banner);


        return ADDRESS_URL;
    }
    /**
     * 查询首页展示地址信息
     *
     * @return
     */
    @RequestMapping("/about")
    public String about(Model model, HttpServletRequest request, HttpServletResponse response) {


        return "about";
    }
}
