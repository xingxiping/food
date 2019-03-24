package com.order_food.web.service;

import com.order_food.web.dao.ShopCartInfoDao;
import com.order_food.web.entity.model.ShopCartInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
