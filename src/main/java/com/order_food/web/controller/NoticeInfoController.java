package com.order_food.web.controller;

import com.order_food.web.content.GeneralResponseEnum;
import com.order_food.web.entity.dto.GeneralResponseVO;
import com.order_food.web.entity.dto.noticeInfo.NoticeInfoDTO;
import com.order_food.web.entity.model.NoticeInfo;
import com.order_food.web.entity.param.noticeinfo.QueryNoticeInfoParam;
import com.order_food.web.service.NoticeInfoService;
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
public class NoticeInfoController {

    @Autowired
    private NoticeInfoService noticeInfoService;


    /**
     * 查询用户评论信息
     *
     * @param param
     * @return
     */
    @RequestMapping("/noticeInfoQuery")
    @ResponseBody
    public GeneralResponseVO<List<NoticeInfoDTO>> queryAllOrderComments(@RequestBody QueryNoticeInfoParam param) {
        List<NoticeInfo> noticeInfos = noticeInfoService.queryAllNotice();

        List<NoticeInfoDTO> dtos = new ArrayList<>();
        noticeInfos.forEach(ni -> {
            NoticeInfoDTO dto = new NoticeInfoDTO()
                    .setId(ni.getId())
                    .setComments(ni.getComments());
            dtos.add(dto);
        });
        return GeneralResponseEnum.SUCCESS.getFfGeneralResponseVO(dtos);
    }


}