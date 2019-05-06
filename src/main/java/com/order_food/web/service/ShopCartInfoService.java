package com.order_food.web.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.order_food.web.dao.ShopCartInfoDao;
import com.order_food.web.entity.model.ShopCartInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * 购物车service
 * <p>
 * Created by xingxiping on 2019/3/24.
 */
@Service
public class ShopCartInfoService {

    @Autowired
    private ShopCartInfoDao shopCartInfoDao;

    /**
     * 查询用户购物车信息
     *
     * @param userId 用户id
     * @return
     */
    public List<ShopCartInfo> queryShopCartInfoByUserId(Long userId) {
        return shopCartInfoDao.queryByUserId(userId);
    }

    /**
     * 根据用户id和产品id查询
     *
     * @param userId    用户id
     * @param productId 产品id
     * @return
     */
    public ShopCartInfo queryByProductIdAndUserId(Long userId, Long productId) {
        LambdaQueryWrapper<ShopCartInfo> wrapper = new LambdaQueryWrapper<ShopCartInfo>()
                .eq(ShopCartInfo::getProductId, productId)
                .eq(ShopCartInfo::getUserId, userId);

        return shopCartInfoDao.selectOne(wrapper);

    }

    /**
     * 跟新购物车数量
     *
     * @param id     购物车id
     * @param number 数量
     */
    public void updateShopCartNumInfoById(Long id, Integer number) {
        LambdaUpdateWrapper<ShopCartInfo> updateWrapper = new LambdaUpdateWrapper<>();
        updateWrapper.eq(ShopCartInfo::getId, id);

        ShopCartInfo info = new ShopCartInfo()
                .setNumber(number)
                .setUt(new Date());
        shopCartInfoDao.update(info, updateWrapper);
    }

    /**
     * 新增购物车信息
     *
     * @param userId    用户id
     * @param productId 产品id
     * @param number    数量
     */
    public void saveShopCartInfo(Long userId, Long productId, Integer number) {
        Date now = new Date();
        ShopCartInfo info = new ShopCartInfo()
                .setUserId(userId)
                .setProductId(productId)
                .setNumber(number)
                .setCt(now)
                .setUt(now);
        shopCartInfoDao.insert(info);
    }

    /**
     * 根据id，删除购物车
     *
     * @param userId 用户主键id
     * @param id     购物车主键
     */
    public void delShopCartInfoById(Long userId, Long id) {
        LambdaQueryWrapper<ShopCartInfo> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(ShopCartInfo::getId, id);
        queryWrapper.eq(ShopCartInfo::getUserId, userId);
        shopCartInfoDao.delete(queryWrapper);
    }
}
