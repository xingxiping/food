package com.order_food.web.entity.model;


import java.math.BigDecimal;
import java.util.Date;

/**
 * 功能描述:entity(表USER 用户表)
 *
 * @author yln
 * @version 1.0.0
 */
public class User {
    /**
     * 用户Id
     */
    private String userId;

    /**
     * 姓名
     */
    private String name;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 密码
     */
    private String password;

    /**
     * 删除标识：0:未删除1:已删除
     */
    private BigDecimal deleted;

    /**
     * 创建时间
     */
    private Date createDate;

    private String createDateStr;

    /**
     * 性别：1:男2:女
     */
    private BigDecimal sex;

    /**
     * 邮编
     */
    private String number;

    /**
     * 联系电话
     */
    private BigDecimal phone;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 人员性质2:用户;1:管理员
     */
    private BigDecimal type;

    /**
     * 是否有效:0:有效1:无效
     */
    private BigDecimal status;

    /**
     * 修改时间
     */
    private Date updateDate;

    private String updateDateStr;

    public String getUserId() {
        return userId;
    }

    public User setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public User setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public BigDecimal getDeleted() {
        return deleted;
    }

    public User setDeleted(BigDecimal deleted) {
        this.deleted = deleted;
        return this;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public User setCreateDate(Date createDate) {
        this.createDate = createDate;
        return this;
    }

    public String getCreateDateStr() {
        return createDateStr;
    }

    public User setCreateDateStr(String createDateStr) {
        this.createDateStr = createDateStr;
        return this;
    }

    public BigDecimal getSex() {
        return sex;
    }

    public User setSex(BigDecimal sex) {
        this.sex = sex;
        return this;
    }

    public String getNumber() {
        return number;
    }

    public User setNumber(String number) {
        this.number = number;
        return this;
    }

    public BigDecimal getPhone() {
        return phone;
    }

    public User setPhone(BigDecimal phone) {
        this.phone = phone;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public BigDecimal getType() {
        return type;
    }

    public User setType(BigDecimal type) {
        this.type = type;
        return this;
    }

    public BigDecimal getStatus() {
        return status;
    }

    public User setStatus(BigDecimal status) {
        this.status = status;
        return this;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public User setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
        return this;
    }

    public String getUpdateDateStr() {
        return updateDateStr;
    }

    public User setUpdateDateStr(String updateDateStr) {
        this.updateDateStr = updateDateStr;
        return this;
    }
}