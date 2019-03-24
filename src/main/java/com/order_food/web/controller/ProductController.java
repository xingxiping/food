package com.order_food.web.controller;

import com.order_food.web.content.ProductTypeEnum;
import com.order_food.web.entity.dto.product.ProductInfoDTO;
import com.order_food.web.entity.dto.product.ProductTypeDTO;
import com.order_food.web.entity.model.ProductInfo;
import com.order_food.web.service.FoodProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * 产品相关接口
 */
@Controller()
public class ProductController {

    private static final Logger logger = LoggerFactory.getLogger(ProductController.class);

    private static final String INDEX_URL = "index";

    @Autowired
    private FoodProductService foodProductService;

    /**
     * 查询首页banner展示产品信息
     *
     * @return
     */
    @RequestMapping("/index")
    public String queryHomePageProducts(Model model) {

        //banner返回数据
        ProductInfoDTO banner = new ProductInfoDTO().setId(1L).setProductImg("/img/banner1.jpg");
        model.addAttribute("banner", banner);


        //今日推荐
        List<ProductInfo> recommends = foodProductService.queryRecommendFood();
        List<List<ProductInfoDTO>> pageInners = new ArrayList<>();
        List<ProductInfoDTO> inners = new ArrayList<>();
        if (recommends != null) { //存在推荐的产品信息
            for (ProductInfo rs : recommends) {
                ProductInfoDTO inner = new ProductInfoDTO()
                        .setId(rs.getId())
                        .setProductImg("/picture/" + rs.getImg())
                        .setProductName(rs.getProductName())
                        .setPrice(rs.getPrice())
                        .setDisPrice(rs.getPrice() / rs.getSale());
                inners.add(inner);

                if (inners.size() == 4) {
                    pageInners.add(inners);
                    inners = new ArrayList<>();
                }
            }
            if (inners != null && !inners.isEmpty()) {
                pageInners.add(inners);
            }
        }

        //菜品类型
        List<ProductTypeDTO> productTypeDTOS = ProductTypeEnum.getProductTypeDTOs();


        //商品列表
        List<ProductInfoDTO> allProducts = new ArrayList<>();
        List<ProductInfo> all = foodProductService.queryProductsByType(ProductTypeEnum.ALL);
        if (all != null) {
            all.forEach(fp -> {
                ProductInfoDTO inner = new ProductInfoDTO()
                        .setId(fp.getId())
                        .setProductImg("/picture/" + fp.getImg())
                        .setProductName(fp.getProductName())
                        .setPrice(fp.getPrice())
                        .setRecommend(fp.getRecommend())
                        .setDisPrice(fp.getPrice() / fp.getSale());
                allProducts.add(inner);
            });
        }

        model.addAttribute("pageInners", pageInners);
        model.addAttribute("productTypes", productTypeDTOS);

        model.addAttribute("products", allProducts);
        return INDEX_URL;
    }

    @RequestMapping(value = "/query/product/info", produces = "application/json", method = RequestMethod.POST)
    @ResponseBody
    public ProductInfoDTO queryProductInfo(Long productId) {
        return new ProductInfoDTO().setId(1L).setProductImg("/img/more1.jpg").setProductName("时尚宝宝小黄鸭T恤纯棉耐脏多色可选0-2岁宝宝").setPrice(10000L).setDisPrice(10000L);
    }

    /**
     * 根据产品类型，查询产品列表
     *
     * @param productType 产品类型，ProductTypeEnum
     * @return
     */
    @RequestMapping(value = "/query/{productType}/product", produces = "application/json", method = RequestMethod.POST)
    @ResponseBody
    public List<ProductInfoDTO> queryProductInfo(@PathVariable("productType") String productType) {
        ProductTypeEnum typeEnum = ProductTypeEnum.getProductTypeByCode(productType);
        if (typeEnum == null) {
            logger.warn("错误的产品类型，返回null, {}", productType);
            return null;
        }

        List<ProductInfoDTO> products = new ArrayList<>();
        List<ProductInfo> all = foodProductService.queryProductsByType(typeEnum);
        if (all != null) {
            all.forEach(fp -> {
                ProductInfoDTO inner = new ProductInfoDTO()
                        .setId(fp.getId())
                        .setProductImg("/picture/" + fp.getImg())
                        .setProductName(fp.getProductName())
                        .setPrice(fp.getPrice())
                        .setRecommend(fp.getRecommend())
                        .setDisPrice(fp.getPrice() / fp.getSale());
                products.add(inner);
            });
        }

        return products;
    }


}
