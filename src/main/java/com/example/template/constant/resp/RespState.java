package com.example.template.constant.resp;

public enum RespState {
    SUCCESS(200,"操作成功"),
    NEED_LOGIN(1,"需要登录"),
    INSUFFICIENT_PERMISSION(11,"权限不足"),
    DUPLICATE_ERROR(12,"该数据已经存在"),
    COUNT_LIMIT(71,"访问过于频繁请稍后再试"),
    FAILURE(-1,"失败"),
    REQUEST_ERROR(400,"请求错误");
    public int code;
    public String msg;

    RespState(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
