package com.order_food.web.content;

import com.order_food.web.entity.dto.GeneralResponseVO;

/**
 * 响应枚举
 * <p>
 * Created by xingxiping on 2019/4/1.
 */
public enum GeneralResponseEnum {

    SUCCESS("0000", "响应成功", "响应成功"),
    FAILED("0001", "响应失败", "响应失败"),
    AES_DECODE_FAILED("0002", "参数解密失败", "参数解密失败"),
    RSA_SIGN_FAILED("0004", "签名验证失败", "签名验证失败"),
    PARAM_EXCEPTION("0005", "参数异常", "参数异常"),
    PASSWD_FAILED("0006", "用户名密码错误", "用户名密码错误"),
    DATA_EMPTY("0007", "没有获取到数据", "没有获取到数据"),
    NOT_LOGGED_IN("0008", "用户未登录", "用户未登录"),
    IP_NOT_WHITELIST("00016", "IP不在白名单", "IP不在白名单"),
    SYSTEM_EXCEPTION("9999", "请稍后重试", "系统异常");

    public <T> GeneralResponseVO<T> getFfGeneralResponseVO() {
        return this.getFfGeneralResponseVO(null);
    }

    public <T> GeneralResponseVO<T> getFfGeneralResponseVO(T t) {
        return (new GeneralResponseVO(this.code, this.message, this.errorMessage)).setResultDate(t);
    }

    public <T> GeneralResponseVO<T> getFfGeneralResponseVO(T t, String errorMessage) {
        return (new GeneralResponseVO(this.code, this.message, errorMessage)).setResultDate(t).setErrorMessage(errorMessage);
    }

    GeneralResponseEnum(String code, String message, String errorMessage) {
        this.code = code;
        this.message = message;
        this.errorMessage = errorMessage;
    }

    private String code;

    private String message;

    private String errorMessage;

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
