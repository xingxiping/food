package com.order_food.web.controller;

import com.order_food.web.content.GeneralResponseEnum;
import com.order_food.web.entity.dto.GeneralResponseVO;
import com.order_food.web.entity.dto.order.OrderCommentsDTO;
import com.order_food.web.entity.model.OrderComments;
import com.order_food.web.entity.param.order.QueryOrderCommentsParam;
import com.order_food.web.entity.param.order.SaveOrderCommentsParam;
import com.order_food.web.service.OrderCommentsService;
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
 * Created by xingxiping on 2019/5/8.
 */
@Controller
public class OrderCommentsController {

    @Autowired
    private OrderCommentsService orderCommentsService;


    /**
     * 查询用户评论信息
     *
     * @param param
     * @return
     */
    @RequestMapping("/orderCommentsQuery")
    @ResponseBody
    public GeneralResponseVO<List<OrderCommentsDTO>> queryAllOrderComments(@RequestBody QueryOrderCommentsParam param) {
        List<OrderComments> orderComments = orderCommentsService.queryCommentsByUserId(param.getUserId());

        if (orderComments == null || orderComments.isEmpty()) {
            return GeneralResponseEnum.SUCCESS.getFfGeneralResponseVO();
        }

        List<OrderCommentsDTO> dtos = new ArrayList<>();
        orderComments.forEach(oc -> {
            OrderCommentsDTO dto = new OrderCommentsDTO()
                    .setId(oc.getId())
                    .setOrderId(oc.getOrderId())
                    .setComments(oc.getComments())
                    .setCreateTime(oc.getCreateTime());
            dtos.add(dto);
        });
        return GeneralResponseEnum.SUCCESS.getFfGeneralResponseVO(dtos);
    }


    /**
     * 查询用户评论信息
     *
     * @param param
     * @return
     */
    @RequestMapping("/orderCommentsSave")
    @ResponseBody
    public GeneralResponseVO<Void> saveOrderComments(@RequestBody SaveOrderCommentsParam param) {
        orderCommentsService.addComments(param.getUserId(), param.getOrderId(), param.getComments());
        return GeneralResponseEnum.SUCCESS.getFfGeneralResponseVO();
    }

    /**
     * 查询我的订单列表
     *
     * @return
     */
    @RequestMapping("/orderComments")
    public String orderComments(Model model, HttpServletRequest request, HttpServletResponse response) {

        return "orderComments";
    }

}