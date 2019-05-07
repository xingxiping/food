package com.order_food.web.controller;

import com.order_food.web.content.GeneralResponseEnum;
import com.order_food.web.entity.dto.GeneralResponseVO;
import com.order_food.web.entity.dto.order.OrderInfoDTO;
import com.order_food.web.entity.dto.shipAddress.ShipAddressInfoDTO;
import com.order_food.web.entity.model.FoodOrder;
import com.order_food.web.entity.model.ShipAddress;
import com.order_food.web.entity.model.User;
import com.order_food.web.entity.param.order.CreateOrderParam;
import com.order_food.web.entity.param.order.QueryOrderParam;
import com.order_food.web.entity.param.shipaddress.QueryShipAddressParam;
import com.order_food.web.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * 订单信息操作
 * Created by xingxiping on 2019/5/2.
 */
@Controller
public class FoodOrderController {

    @Autowired
    private FoodOrderService foodOrderService;

    @Autowired
    private OrderProductService orderProductService;

    @Autowired
    private UserService userService;

    @Autowired
    private ShipAddressService shipAddressService;
    @Autowired
    private ShopCartInfoService shopCartInfoService;

    /**
     * 查询我的订单列表
     *
     * @return
     */
    @RequestMapping("/orderInformation")
    public String orderInformation(Model model, HttpServletRequest request, HttpServletResponse response) {

        return "orderInformation";
    }
    /**
     * 查询购物车信息
     *
     * @param param
     * @return
     */
    @RequestMapping("/orderList")
    @ResponseBody
    public GeneralResponseVO<List<OrderInfoDTO>> queryAllOrder(@RequestBody QueryOrderParam param) {


        List<FoodOrder> orderInfos = foodOrderService.queryUserOrders(param.getUserId());
        List<OrderInfoDTO> dtos = new ArrayList<>();
        orderInfos.forEach(sci -> {

            ShipAddress address = shipAddressService.queryById(sci.getAddressId());
            OrderInfoDTO dto = new OrderInfoDTO()
                    .setId(sci.getId())
                    .setUserId(sci.getUserId())
                    .setName(address.getName())
                    .setPhone(Long.parseLong(address.getPhone()))
                    .setAddress(address.getAddress())
                    .setCreateTime(sci.getCreateTime())
                    .setTotleAmount(sci.getTotalAmount());

            dtos.add(dto);
        });
        return GeneralResponseEnum.SUCCESS.getFfGeneralResponseVO(dtos);
    }

    /**
     * 创建/生成订单
     *
     * @param param
     * @return
     */
    @RequestMapping("/createOrder")
    @ResponseBody
    public GeneralResponseVO<Void> createOrder(@RequestBody CreateOrderParam param) {
        List<ShipAddress> addressList =  shipAddressService.queryUserShipAddresses(param.getUserId());
        if(addressList != null && addressList.size()>0){
            FoodOrder foodOrder = foodOrderService.createOrder(param.getUserId(), addressList.get(0).getId(), param.getTotalAmount()); //保存订单信息

            param.getProductSize().forEach(ps -> { //保存订单商品信息
                orderProductService.saveOrderProducts(foodOrder.getId(), ps.getProductId(), ps.getSize(), ps.getUnitPrice());
            });
            shopCartInfoService.delShopCartInfoByUserId(param.getUserId());
            return GeneralResponseEnum.SUCCESS.getFfGeneralResponseVO();
        }else{
            return GeneralResponseEnum.DATA_EMPTYADDRESS.getFfGeneralResponseVO();
        }

    }

}
