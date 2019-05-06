package com.order_food.web.controller;

import com.alibaba.fastjson.JSONObject;
import com.order_food.web.content.CommonStatus;
import com.order_food.web.content.GeneralResponseEnum;
import com.order_food.web.entity.dto.GeneralResponseVO;
import com.order_food.web.entity.dto.shopcart.ShopCartInfoDTO;
import com.order_food.web.entity.model.ProductInfo;
import com.order_food.web.entity.model.ShopCartInfo;
import com.order_food.web.entity.param.shopcart.AddShopCartProductInfoParam;
import com.order_food.web.entity.param.shopcart.DelShopCartProductInfoParam;
import com.order_food.web.entity.param.shopcart.QueryShopCartInfoParam;
import com.order_food.web.service.FoodProductService;
import com.order_food.web.service.ShopCartInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * 购物车接口
 */
@Controller()
public class ShopCartController {

    private static final Logger logger = LoggerFactory.getLogger(ShopCartController.class);

    @Autowired
    private ShopCartInfoService shopCartInfoService;

    @Autowired
    private FoodProductService foodProductService;

    /**
     * 查询购物车信息
     *
     * @param param
     * @return
     */
    @RequestMapping("/query/shopcart/infos")
    @ResponseBody
    public GeneralResponseVO<List<ShopCartInfoDTO>> queryShopCartProductInfo(@RequestBody QueryShopCartInfoParam param) {

        if (param == null) {
            logger.warn("请求参数为空，请求错误。param:{}", JSONObject.toJSONString(param));
            return GeneralResponseEnum.PARAM_EXCEPTION.getFfGeneralResponseVO();
        }

        if (param.getUserId() == null || param.getUserId().compareTo(0L) <= 0) {
            logger.warn("没有用户id，请求错误。param:{}", JSONObject.toJSONString(param));
            return GeneralResponseEnum.PARAM_EXCEPTION.getFfGeneralResponseVO();
        }

        List<ShopCartInfo> shopCartInfos = shopCartInfoService.queryShopCartInfoByUserId(param.getUserId());

        if (shopCartInfos == null || shopCartInfos.isEmpty()) { //购物车为空
            return GeneralResponseEnum.SUCCESS.getFfGeneralResponseVO();
        }

        List<ShopCartInfoDTO> dtos = new ArrayList<>();
        shopCartInfos.forEach(sci -> {
            ProductInfo fp = foodProductService.queryProductInfoById(sci.getProductId());
            if (fp != null) {
                ShopCartInfoDTO dto = new ShopCartInfoDTO()
                        .setId(sci.getId())
                        .setProductImg("/picture/" + fp.getImg())
                        .setProductName(fp.getProductName())

                        .setNumber(sci.getNumber())
                        .setProductId(fp.getId());

                if (CommonStatus.YES.equals(fp.getRecommend())) { //有折扣
                    dto.setPrice(fp.getPrice() / fp.getSale());
                } else {
                    dto.setPrice(fp.getPrice());
                }


                dtos.add(dto);
            }
        });
        return GeneralResponseEnum.SUCCESS.getFfGeneralResponseVO(dtos);
    }

    /**
     * 添加/修改购物车信息
     *
     * @param param
     * @return
     */
    @RequestMapping("/add/shopcart")
    @ResponseBody
    public GeneralResponseVO<Void> addShopCartProductInfo(@RequestBody AddShopCartProductInfoParam param) {
        if (param == null) {
            logger.warn("添加购物车，参数为空。param:{}", JSONObject.toJSONString(param));
            return GeneralResponseEnum.PARAM_EXCEPTION.getFfGeneralResponseVO();
        }

        if (param.getNumber() == null || param.getNumber().compareTo(0) <= 0) {
            logger.warn("购物车数量错误。param:{}", JSONObject.toJSONString(param));
            return GeneralResponseEnum.PARAM_EXCEPTION.getFfGeneralResponseVO();
        }

        if (param.getId() != null) {  //进行更新
            shopCartInfoService.updateShopCartNumInfoById(param.getId(), param.getNumber());
            return GeneralResponseEnum.SUCCESS.getFfGeneralResponseVO();
        }

        if (param.getUserId() == null || param.getUserId().compareTo(0L) <= 0) {
            logger.warn("添加购物车，用户id错误。param:{}", JSONObject.toJSONString(param));
            return GeneralResponseEnum.PARAM_EXCEPTION.getFfGeneralResponseVO();
        }

        if (param.getProductId() == null || param.getProductId().compareTo(0L) <= 0) {
            logger.warn("添加购物车，产品ID错误。param:{}", JSONObject.toJSONString(param));
            return GeneralResponseEnum.PARAM_EXCEPTION.getFfGeneralResponseVO();
        }

        shopCartInfoService.saveShopCartInfo(param.getUserId(), param.getProductId(), param.getNumber());
        return GeneralResponseEnum.SUCCESS.getFfGeneralResponseVO();
    }

    /**
     * 添加/修改购物车信息
     *
     * @param param
     * @return
     */
    @RequestMapping("/add/one/shopcart")
    @ResponseBody
    public GeneralResponseVO<Void> addOneShopCartProductInfo(@RequestBody AddShopCartProductInfoParam param) {
        if (param == null) {
            logger.warn("添加购物车，参数为空。param:{}", JSONObject.toJSONString(param));
            return GeneralResponseEnum.PARAM_EXCEPTION.getFfGeneralResponseVO();
        }

        if (param.getNumber() == null || param.getNumber().compareTo(0) <= 0) {
            logger.warn("购物车数量错误。param:{}", JSONObject.toJSONString(param));
            return GeneralResponseEnum.PARAM_EXCEPTION.getFfGeneralResponseVO();
        }

        if (param.getUserId() == null || param.getUserId().compareTo(0L) <= 0) {
            logger.warn("添加购物车，用户id错误。param:{}", JSONObject.toJSONString(param));
            return GeneralResponseEnum.PARAM_EXCEPTION.getFfGeneralResponseVO();
        }

        if (param.getProductId() == null || param.getProductId().compareTo(0L) <= 0) {
            logger.warn("添加购物车，产品ID错误。param:{}", JSONObject.toJSONString(param));
            return GeneralResponseEnum.PARAM_EXCEPTION.getFfGeneralResponseVO();
        }

        ShopCartInfo shopCartInfo = shopCartInfoService.queryByProductIdAndUserId(param.getUserId(), param.getProductId());

        if (shopCartInfo == null) {
            shopCartInfoService.saveShopCartInfo(param.getUserId(), param.getProductId(), param.getNumber());
        } else {
            shopCartInfoService.updateShopCartNumInfoById(shopCartInfo.getId(), shopCartInfo.getNumber() + param.getNumber());
        }
        return GeneralResponseEnum.SUCCESS.getFfGeneralResponseVO();
    }

    /**
     * 根据购物车主键，删除购物车信息
     *
     * @param param
     * @return
     */
    @RequestMapping("/del/shopcart")
    @ResponseBody
    public GeneralResponseVO<Void> delShopCartProductInfo(@RequestBody DelShopCartProductInfoParam param) {
        if (param == null) {
            logger.warn("删除购物车，参数为空。param:{}", JSONObject.toJSONString(param));
            return GeneralResponseEnum.PARAM_EXCEPTION.getFfGeneralResponseVO();
        }

        if (param.getUserId() == null || param.getUserId().compareTo(0L) <= 0) {
            logger.warn("删除购物车，用户id错误。param:{}", JSONObject.toJSONString(param));
            return GeneralResponseEnum.PARAM_EXCEPTION.getFfGeneralResponseVO();
        }

        if (param.getId() == null || param.getId().compareTo(0L) <= 0) {
            logger.warn("删除购物车，购物车id错误。param:{}", JSONObject.toJSONString(param));
            return GeneralResponseEnum.PARAM_EXCEPTION.getFfGeneralResponseVO();
        }

        shopCartInfoService.delShopCartInfoById(param.getUserId(), param.getId());
        return GeneralResponseEnum.SUCCESS.getFfGeneralResponseVO();
    }

}
