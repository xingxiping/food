package com.order_food.web.controller;

import com.alibaba.fastjson.JSONObject;
import com.order_food.web.content.CommonStatus;
import com.order_food.web.content.GeneralResponseEnum;
import com.order_food.web.content.ProductTypeEnum;
import com.order_food.web.entity.dto.GeneralResponseVO;
import com.order_food.web.entity.dto.product.ProductInfoDTO;
import com.order_food.web.entity.dto.product.ProductTypeDTO;
import com.order_food.web.entity.dto.shipAddress.ShipAddressInfoDTO;
import com.order_food.web.entity.dto.shopcart.ShopCartInfoDTO;
import com.order_food.web.entity.model.ProductInfo;
import com.order_food.web.entity.model.ShipAddress;
import com.order_food.web.entity.model.ShopCartInfo;
import com.order_food.web.entity.param.shipaddress.CreateShipAddressParam;
import com.order_food.web.entity.param.shipaddress.QueryShipAddressParam;
import com.order_food.web.entity.param.shipaddress.UpdateShipAddressParam;
import com.order_food.web.entity.param.shopcart.QueryShopCartInfoParam;
import com.order_food.web.service.ShipAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * 用户配送地址
 * <p>
 * Created by xingxiping on 2019/5/2.
 */
@Controller
@RequestMapping("/shipAddress")
public class ShipAddressController {

    @Autowired
    private ShipAddressService shipAddressService;

    /**
     * 查询购物车信息
     *
     * @param param
     * @return
     */
    @RequestMapping("/queryAllAddress")
    @ResponseBody
    public GeneralResponseVO<List<ShipAddressInfoDTO>> queryAllAddress(@RequestBody QueryShipAddressParam param) {


        List<ShipAddress> shipAddressInfos = shipAddressService.queryUserShipAddresses(param.getUserId());
        List<ShipAddressInfoDTO> dtos = new ArrayList<>();
        shipAddressInfos.forEach(sci -> {

            ShipAddressInfoDTO dto = new ShipAddressInfoDTO()
                    .setId(sci.getId())
                    .setUserId(sci.getUser_id())
                    .setName(sci.getName())
                    .setPhone(sci.getPhone())
                    .setIsDefault(sci.getIsDefault())
                    .setAddress(sci.getAddress());

            dtos.add(dto);
        });
        return GeneralResponseEnum.SUCCESS.getFfGeneralResponseVO(dtos);
    }

    /**
     * 创建/生成配送地址
     *
     * @param param
     * @return
     */
    @RequestMapping("/create")
    @ResponseBody
    public GeneralResponseVO<Void> createShipAddress(@RequestBody CreateShipAddressParam param) {
        if(param.getIsDefault().equals("0") ){
            List<ShipAddress> shipAddressInfos = shipAddressService.queryShipAddressesByisdefault(param.getUserId(),"0");
            shipAddressInfos.forEach(sci -> {
                sci.setIsDefault("1");
                shipAddressService.updateShipAddress(sci.getId(),sci.getName(),sci.getPhone(),sci.getAddress(),sci.getIsDefault());
            });
        }
        shipAddressService.saveShipAddress(param.getUserId(), param.getName(), param.getPhone(), param.getAddress(),param.getIsDefault());
        return GeneralResponseEnum.SUCCESS.getFfGeneralResponseVO();
    }

    /**
     * 创建/生成配送地址
     *
     * @param param
     * @return
     */
    @RequestMapping("/delete")
    @ResponseBody
    public GeneralResponseVO<Void> deleteShipAddress(@RequestBody String param) {
        shipAddressService.deleteShipAddress(Long.getLong(param));
        return GeneralResponseEnum.SUCCESS.getFfGeneralResponseVO();
    }


    /**
     * 创建/生成配送地址
     *
     * @param param
     * @return
     */
    @RequestMapping("/update")
    @ResponseBody
    public GeneralResponseVO<Void> updateShipAddress(@RequestBody UpdateShipAddressParam param) {
        if(param.getIsDefault().equals("0") ){
            List<ShipAddress> shipAddressInfos = shipAddressService.queryShipAddressesByisdefault(param.getUserId(),"0");
            shipAddressInfos.forEach(sci -> {
                sci.setIsDefault("1");
                shipAddressService.updateShipAddress(sci.getId(),sci.getName(),sci.getPhone(),sci.getAddress(),sci.getIsDefault());
            });
        }
        shipAddressService.updateShipAddress(param.getId(), param.getName(), param.getPhone(), param.getAddress(),param.getIsDefault());
        return GeneralResponseEnum.SUCCESS.getFfGeneralResponseVO();
    }

}
