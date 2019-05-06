package com.order_food.web.controller;

import com.order_food.web.content.GeneralResponseEnum;
import com.order_food.web.entity.dto.GeneralResponseVO;
import com.order_food.web.entity.param.shipaddress.CreateShipAddressParam;
import com.order_food.web.entity.param.shipaddress.UpdateShipAddressParam;
import com.order_food.web.service.ShipAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
     * 创建/生成配送地址
     *
     * @param param
     * @return
     */
    @RequestMapping("/create")
    @ResponseBody
    public GeneralResponseVO<Void> createShipAddress(@RequestBody CreateShipAddressParam param) {
        shipAddressService.saveShipAddress(param.getUserId(), param.getName(), param.getPhone(), param.getAddress());
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
    public GeneralResponseVO<Void> createShipAddress(@RequestBody List<Long> param) {
        shipAddressService.deleteShipAddress(param);
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
    public GeneralResponseVO<Void> createShipAddress(@RequestBody UpdateShipAddressParam param) {
        shipAddressService.saveShipAddress(param.getId(), param.getName(), param.getPhone(), param.getAddress());
        return GeneralResponseEnum.SUCCESS.getFfGeneralResponseVO();
    }

}
