package com.order_food.web.entity.dto;

import com.order_food.web.content.GeneralResponseEnum;

import java.io.Serializable;

/**
 * Created by xingxiping on 2019/4/1.
 */
public class GeneralResponseVO<T> implements Serializable {
    private static final long serialVersionUID = 5114986358236020959L;

    /**
     * 状态骂
     */
    private String code;

    /**
     * 返回信息
     */
    private String message;

    /**
     * 异常信息
     */
    private String errorMessage;

    /**
     * 返回数据
     */
    private T result;

    public GeneralResponseVO() {
    }

    public GeneralResponseVO(String code, String message, String errorMessage) {
        this.code = code;
        this.message = message;
        this.errorMessage = errorMessage;
    }

    public GeneralResponseVO<T> setResultDate(T t) {
        this.result = t;
        return this;
    }

    public GeneralResponseVO<T> setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    public boolean success() {
        return GeneralResponseEnum.SUCCESS.getCode().equals(this.code);
    }

    public String getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public T getResult() {
        return this.result;
    }

    public GeneralResponseVO<T> setMessage(String message) {
        this.message = message;
        return this;
    }

    public String toString() {
        return "FfGeneralResponseVO{code='" + this.code + '\'' + ", message='" + this.message + '\'' + ", errorMessage='" + this.errorMessage + '\'' + ", result=" + this.result + '}';
    }
}
