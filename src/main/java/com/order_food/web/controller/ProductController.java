package com.order_food.web.controller;

import com.order_food.web.content.ProductTypeEnum;
import com.order_food.web.entity.dto.product.ProductInfoDTO;
import com.order_food.web.entity.dto.product.ProductTypeDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 产品相关接口
 */
@Controller()
public class ProductController {

    private static final Logger logger = LoggerFactory.getLogger(ProductController.class);

    private static final String INDEX_URL = "index";

    /**
     * 查询首页banner展示产品信息
     *
     * @return
     */
    @RequestMapping("/index")
    public String queryHomePageProducts(Model model) {

        //banner返回数据
        ProductInfoDTO banner = new ProductInfoDTO().setProductId(1L).setProductImg("/img/banner1.jpg");
        model.addAttribute("banner", banner);

        //今日推荐
        List<List<ProductInfoDTO>> pageInners = new ArrayList<>();
        List<ProductInfoDTO> inners = new ArrayList<>();
        ProductInfoDTO i1 = new ProductInfoDTO().setProductId(1L).setProductImg("/img/s_img2.jpg").setProductName("宝宝五彩袜棉质舒服").setPrice(9900L).setDisPrice(4900L);
        ProductInfoDTO i2 = new ProductInfoDTO().setProductId(1L).setProductImg("/img/s_img3.jpg").setProductName("宝宝五彩袜棉质舒服").setPrice(9900L).setDisPrice(4900L);
        ProductInfoDTO i3 = new ProductInfoDTO().setProductId(1L).setProductImg("/img/s_img4.jpg").setProductName("宝宝五彩袜棉质舒服").setPrice(9900L).setDisPrice(4900L);
        ProductInfoDTO i4 = new ProductInfoDTO().setProductId(1L).setProductImg("/img/s_img5.jpg").setProductName("宝宝五彩袜棉质舒服").setPrice(9900L).setDisPrice(4900L);
        inners.add(i1);
        inners.add(i2);
        inners.add(i3);
        inners.add(i4);
        Collections.shuffle(inners);
        pageInners.add(inners);
        List<ProductInfoDTO> inners1 = new ArrayList<>();
        inners1.addAll(inners);
        Collections.shuffle(inners1);
        pageInners.add(inners1);

        //菜品类型
        List<ProductTypeDTO> productTypeDTOS = ProductTypeEnum.getProductTypeDTOs();


        List<ProductInfoDTO> allProducts = new ArrayList<>();
        ProductInfoDTO a1 = new ProductInfoDTO().setProductId(1L).setProductImg("/img/more1.jpg").setProductName("时尚宝宝小黄鸭T恤纯棉耐脏多色可选0-2岁宝宝").setPrice(10000L).setDisPrice(10000L);
        ProductInfoDTO a2 = new ProductInfoDTO().setProductId(1L).setProductImg("/img/more1.jpg").setProductName("时尚宝宝小黄鸭T恤纯棉耐脏多色可选0-2岁宝宝").setPrice(10000L).setDisPrice(10000L);
        ProductInfoDTO a3 = new ProductInfoDTO().setProductId(1L).setProductImg("/img/more1.jpg").setProductName("时尚宝宝小黄鸭T恤纯棉耐脏多色可选0-2岁宝宝").setPrice(10000L).setDisPrice(10000L);
        ProductInfoDTO a4 = new ProductInfoDTO().setProductId(1L).setProductImg("/img/more1.jpg").setProductName("时尚宝宝小黄鸭T恤纯棉耐脏多色可选0-2岁宝宝").setPrice(10000L).setDisPrice(10000L);
        ProductInfoDTO a5 = new ProductInfoDTO().setProductId(1L).setProductImg("/img/more1.jpg").setProductName("时尚宝宝小黄鸭T恤纯棉耐脏多色可选0-2岁宝宝").setPrice(10000L).setDisPrice(10000L);
        ProductInfoDTO a6 = new ProductInfoDTO().setProductId(1L).setProductImg("/img/more1.jpg").setProductName("时尚宝宝小黄鸭T恤纯棉耐脏多色可选0-2岁宝宝").setPrice(10000L).setDisPrice(10000L);
        ProductInfoDTO a7 = new ProductInfoDTO().setProductId(1L).setProductImg("/img/more1.jpg").setProductName("时尚宝宝小黄鸭T恤纯棉耐脏多色可选0-2岁宝宝").setPrice(10000L).setDisPrice(10000L);
        allProducts.add(a1);
        allProducts.add(a2);
        allProducts.add(a3);
        allProducts.add(a4);
        allProducts.add(a5);
        allProducts.add(a6);
        allProducts.add(a7);

        model.addAttribute("pageInners", pageInners);
        model.addAttribute("productTypes", productTypeDTOS);

        model.addAttribute("products", allProducts);


        return INDEX_URL;
    }

    @RequestMapping(value = "/query/product/info", produces = "application/json", method = RequestMethod.POST)
    @ResponseBody
    public ProductInfoDTO queryProductInfo(Long productId) {
        return new ProductInfoDTO().setProductId(1L).setProductImg("/img/more1.jpg").setProductName("时尚宝宝小黄鸭T恤纯棉耐脏多色可选0-2岁宝宝").setPrice(10000L).setDisPrice(10000L);
    }


}
