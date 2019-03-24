package com.order_food.web.entity.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 图片信息
 * <p>
 * Created by xingxiping on 2019/3/20.
 */
public class PictureInfo implements Serializable {

    private static final long serialVersionUID = 5058432820302813701L;
    /**
     * 主见id
     */
    private Long id;

    /**
     * 图片
     */
    private byte[] img;

    /**
     * 创建时间
     */
    private Date createTime;

    public Long getId() {
        return id;
    }

    public PictureInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public byte[] getImg() {
        return img;
    }

    public PictureInfo setImg(byte[] img) {
        this.img = img;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public PictureInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }
}
