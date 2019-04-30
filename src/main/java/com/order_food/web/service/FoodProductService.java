package com.order_food.web.service;

import com.alibaba.fastjson.JSONObject;
import com.order_food.web.content.ProductTypeEnum;
import com.order_food.web.dao.ProductInfoDao;
import com.order_food.web.entity.model.ProductInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 食品相关service
 * <p>
 * Created by xingxiping on 2019/3/20.
 */
@Service
public class FoodProductService {

    private static final Logger logger = LoggerFactory.getLogger(FoodProductService.class);

    @Autowired
    private ProductInfoDao productInfoDao;


    /**
     * 查询推荐的商品信息
     *
     * @return
     */
    public List<ProductInfo> queryRecommendFood() {
        if (logger.isInfoEnabled()) {
            logger.info("开始查询推荐商品信息");
        }
        List<ProductInfo> productInfos = productInfoDao.queryRecommendProducts();

        if (logger.isInfoEnabled()) {
            logger.info("查询到的推荐商品信息为：{}", JSONObject.toJSONString(productInfos));
        }
        return productInfos;
    }


    /**
     * 根据类型，查询产品
     *
     * @param productType 产品类型
     * @return
     */
    public List<ProductInfo> queryProductsByType(ProductTypeEnum productType) {
        if (ProductTypeEnum.ALL.getCode().equals(productType.getCode())) { //查询所有商品
            return productInfoDao.queryAllProducts();
        } else {
            return productInfoDao.queryProductsByType(productType.getCode());
        }
    }

    /**
     * 根据id，查询产品信息
     *
     * @param id
     * @return
     */
    public ProductInfo queryProductInfoById(Long id) {
        return productInfoDao.selectById(id);
    }
}
