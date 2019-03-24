package com.order_food.web.service;

import com.order_food.web.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.FileInputStream;

/**
 * Created by xingxiping on 2019/3/24.
 */
public class PictureInfoServiceTest extends BaseTest {

    @Autowired
    private PictureInfoService pictureInfoService;

    @Test
    public void savePictureInfo() {
        try {
            FileInputStream fi = new FileInputStream("/Users/finup/finup-code/IdeaProjects-xxp/order_food/src/main/resources/static/img/hot1.png");

            byte[] b = new byte[fi.available()];

            fi.read(b);
            fi.close();
            pictureInfoService.savePictureInfo(b);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
