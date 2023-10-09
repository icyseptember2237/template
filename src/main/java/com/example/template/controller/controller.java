package com.example.template.controller;

import com.example.template.constant.exception.ExceptionsEnums;
import com.example.template.util.AssertUtils;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @GetMapping("/test")
    public void test(){
        AssertUtils.isNull(null, ExceptionsEnums.Common.DATA_IS_NULL);
    }
}
