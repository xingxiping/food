package com.order_food.web.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.order_food.web.entity.model.ProductInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by xingxiping on 2019/3/20.
 */
@Mapper
@Repository
public interface ProductInfoDao extends BaseMapper<ProductInfo> {

    /**
     * 查询推荐商品
     *
     * @return
     */
    @Select("select * from product_info where recommend = '1' and status = '1'")
    List<ProductInfo> queryRecommendProducts();

    /**
     * 根据类型，查询产品
     *
     * @param productType 产品类型
     * @return
     */
    @Select("select * from product_info where product_type = #{productType} and status = '1' order by update_time desc")
    List<ProductInfo> queryProductsByType(@Param("productType") String productType);

    /**
     * 查询所有商品
     *
     * @return
     */
    @Select("select * from product_info where status = '1' order by update_time desc")
    List<ProductInfo> queryAllProducts();
}
