package com.order_food.web.service;

import com.order_food.web.dao.PictureInfoDao;
import com.order_food.web.entity.model.PictureInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * 图片信息
 * <p>
 * Created by xingxiping on 2019/3/20.
 */
@Service
public class PictureInfoService {

    @Autowired
    private PictureInfoDao pictureInfoDao;

    /**
     * 根据主见id，查询照片信息
     *
     * @param id
     * @return
     */
    public PictureInfo queryPictureInfoById(Long id) {
        return pictureInfoDao.selectById(id);
    }

    /**
     * 保存图片信息
     *
     * @param img
     */
    public void savePictureInfo(byte[] img) {
        PictureInfo info = new PictureInfo()
                .setImg(img)
                .setCreateTime(new Date());
        pictureInfoDao.insert(info);
    }

}
