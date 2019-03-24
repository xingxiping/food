package com.order_food.web.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.order_food.web.entity.model.PictureInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 图片信息
 * <p>
 * Created by xingxiping on 2019/3/20.
 */
@Mapper
@Repository
public interface PictureInfoDao extends BaseMapper<PictureInfo> {

}
