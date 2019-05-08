package com.order_food.web.entity.param.noticeinfo;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

/**
 * 功能描述:entity(表USER 用户表)
 *
 * @author yln
 * @version 1.0.0
 */
@TableName("notice_info")
public class QueryNoticeInfoParam {

    @TableId(type = IdType.AUTO)

    private Long  id;

    private String comments;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public String getComments() {
        return comments;
    }

    public QueryNoticeInfoParam setId(Long id) {
        this.id = id;
        return this;
    }

    public QueryNoticeInfoParam setComments(String comments) {
        this.comments = comments;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public QueryNoticeInfoParam setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public QueryNoticeInfoParam setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
        return this;
    }
}