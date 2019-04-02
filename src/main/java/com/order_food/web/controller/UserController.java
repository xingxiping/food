package com.order_food.web.controller;

import com.alibaba.fastjson.JSONObject;
import com.order_food.web.content.GeneralResponseEnum;
import com.order_food.web.entity.dto.GeneralResponseVO;
import com.order_food.web.entity.dto.user.LoginDTO;
import com.order_food.web.entity.model.User;
import com.order_food.web.entity.param.user.LoginParam;
import com.order_food.web.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.util.StringUtils;

/**
 * 用户相关接口
 * <p>
 * Created by xingxiping on 2019/4/1.
 */
@Controller
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    /**
     * 伪造的验证码
     */
    private final String FORGED_VALID_CODE = "0000";

    /**
     * 用户登陆/注册
     *
     * @param loginParam
     * @return
     */
    @RequestMapping("/user/login")
    @ResponseBody
    public GeneralResponseVO<LoginDTO> loginOrRegister(@RequestBody LoginParam loginParam) {
        if (loginParam == null) {
            logger.warn("登陆注册参数错误。loginParam:{}", JSONObject.toJSONString(loginParam));
            return GeneralResponseEnum.PARAM_EXCEPTION.getFfGeneralResponseVO();
        }

        if (StringUtils.isEmpty(loginParam.getPhone())) {
            logger.warn("登陆注册参数错误。loginParam:{}", JSONObject.toJSONString(loginParam));
            return GeneralResponseEnum.PARAM_EXCEPTION.getFfGeneralResponseVO();
        }

        if (StringUtils.isEmpty(loginParam.getValidCode())) {
            logger.warn("登陆注册参数错误。loginParam:{}", JSONObject.toJSONString(loginParam));
            return GeneralResponseEnum.PARAM_EXCEPTION.getFfGeneralResponseVO();
        }

        if (!FORGED_VALID_CODE.equals(loginParam.getValidCode())) { //验证码校验失败
            logger.warn("验证码校验失败。loginParam:{}", JSONObject.toJSONString(loginParam));
            return GeneralResponseEnum.FAILED.getFfGeneralResponseVO();
        }

        User user = userService.queryUserByPhone(loginParam.getPhone());
        if (user == null) { //用户不存在，进行注册
            user = userService.saveUser(loginParam.getPhone());
        }

        LoginDTO dto = new LoginDTO().setUserId(user.getUserId());
        return GeneralResponseEnum.SUCCESS.getFfGeneralResponseVO(dto);
    }

}
