package com.order_food.web.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.order_food.web.dao.NoticeInfoDao;
import com.order_food.web.entity.model.NoticeInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticeInfoService {

    @Autowired
    private NoticeInfoDao noticeInfoDao;

    /**
     * 查询公告信息
     *
     * @return
     */
    public List<NoticeInfo> queryAllNotice() {
        LambdaQueryWrapper<NoticeInfo> queryWrapper = new LambdaQueryWrapper<NoticeInfo>();
        return noticeInfoDao.selectList(queryWrapper);
    }


}
