package com.example.template.constant.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

public interface ExceptionsEnums extends Exceptions{

    @Getter
    @AllArgsConstructor
    enum Common implements ExceptionsEnums {
        // Feign 服务异常
        FEIGN_INVOKE_ERROR(500, "Feign 服务调用异常"),
        DATA_IS_NULL(500, "数据为空"),
        NOT_PERMISSION(401, "无权访问!"),
        NOT_DATA_PERMISSION(500, "数据无权访问!"),
        REQUSET_TYPE_ERROR(500, "访问类型错误!"),
        DATA_IS_ERROR(500, "数据错误!"),
        PARAMTER_IS_ERROR(500, "参数不正确！"),
        NO_RESOURCE(500, "请求资源不存在！"),
        DATETIME_BEFORE(500, "开始日期不能小于当前日期！");
        private int code;
        private String msg;
    }

    @Getter
    @AllArgsConstructor
    enum UserEX implements ExceptionsEnums {
        USER_HAVE(500, "该账号或手机号已存在"),
        NOT_PREMISS(401, "无访问权限"),
        ACCOUNT_NOT_FIND(500, "未查询到该用户信息"),
        NO_LOGIN(500, "请求异常，无登录信息"),
        ROLE_NAME_REPEAT(500, "角色名称/编码重复,请重新输入");
        private int code;
        private String msg;
    }

    @Getter
    @AllArgsConstructor
    enum Login implements ExceptionsEnums{
        CAPTCHA_EXPIRE(500, "验证码已失效"),
        CAPTCHA_ERROR(500, "验证码错误或已失效"),
        USER_ERROR(500, "账号或密码错误"),
        USER_STATUS_ERROR(500, "用户被禁用"),
        GET_USER_ERROR(500, "获取登录用户信息异常"),
        NO_ROLE_DSIABLE(500, "当前用户已被禁用"),
        ACCOUNT_NOT_EXT(500, "登录账号不存在,请重新登录"),
        USER_CLOSE(500, "当前账号已被禁用,请联系管理员");
        private int code;
        private String msg;
    }

    @Getter
    @AllArgsConstructor
    enum Excel implements ExceptionsEnums{
        TEMPLATE_ERROR(500,"模板表头错误"),
        ERROR_READING_FILE_HEADER(500, "读取文件表头报错！");
        private int code;
        private String msg;
    }
}
