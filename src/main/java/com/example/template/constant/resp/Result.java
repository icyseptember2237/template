package com.example.template.constant.resp;

import com.sun.istack.internal.NotNull;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.lang.Nullable;

@Data
public final class Result <T> {/**
     * 返回请求的状态
     * 只有 200 代表成功，其余状态需要显示 msg 中的信息
     */
    @ApiModelProperty(notes = "响应代码",example = "200")
    private int code;

    /**
     * 成功或者错误信息
     */
    @ApiModelProperty(notes = "返回信息",example = "操作成功")
    private String msg;

    /**
     * 响应的数据
     */
    @ApiModelProperty(notes = "返回数据",example = "null")
    private T data;

    private Result(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static Result resp(@NotNull RespState respState){
        return of(respState,null,null);
    }

    public static <T> Result<T> success(@Nullable String msg, @Nullable T data, int total){
        return of(RespState.SUCCESS,msg,data);
    }

    public static <T> Result<T> success() {
        return of(RespState.SUCCESS,null,null);
    }
    public static <T> Result<T> success(T data){
        return of(RespState.SUCCESS,"操作成功",data);
    }

    public static Result<String> failure(String msg){
        return of(RespState.FAILURE,msg,null);
    }

    public static <String> Result<String> successT(@Nullable java.lang.String msg, @Nullable String data, int total){
        return of(RespState.SUCCESS,msg,data);
    }

    public static <Double> Result<Double> successT() {
        return of(RespState.SUCCESS,null,null);
    }

    public static <T> Result<T> of(@NotNull RespState state, @Nullable String msg, @Nullable T data) {
        return new Result<T>(state.code, (msg == null) ? state.msg : msg, data);
    }

    public static <T> Result<T> of(@NotNull RespState state) {
        return new Result<T>(state.code,state.msg,null);
    }

    public static <T> Result<T> duplicateError(@Nullable String msg, @Nullable T data){

        return of(RespState.DUPLICATE_ERROR,msg,data);
    }
    public static <T> Result<T> duplicateError(){
        return duplicateError(null,null);
    }



}

