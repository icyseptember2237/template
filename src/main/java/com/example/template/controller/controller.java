package com.example.template.controller;

import cn.dev33.satoken.annotation.SaCheckRole;
import cn.dev33.satoken.stp.StpUtil;
import com.example.template.constant.exception.ExceptionsEnums;
import com.example.template.util.AssertUtils;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @GetMapping("/test")
    public void test(){
//        String string = new String();
//        string = null;
//        string.isEmpty();
//        StpUtil.checkLogin();
        AssertUtils.isNull(null, ExceptionsEnums.Common.DATA_IS_NULL);
    }
}
