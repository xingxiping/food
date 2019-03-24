package com.order_food.web.controller;

import com.order_food.web.entity.model.PictureInfo;
import com.order_food.web.service.PictureInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;

/**
 * 图片管理
 * Created by xingxiping on 2019/3/20.
 */
@Controller
public class PictureController {

    @Autowired
    private PictureInfoService pictureInfoService;

    @RequestMapping(value = "/picture/{id}", method = RequestMethod.GET)
    public void getById(@PathVariable("id") Long id, HttpServletResponse response) {
        PictureInfo pictureInfo = pictureInfoService.queryPictureInfoById(id);
        try {
            OutputStream ot = response.getOutputStream();
            ot.write(pictureInfo.getImg());
            ot.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
