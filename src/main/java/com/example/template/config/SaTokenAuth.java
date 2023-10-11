package com.example.template.config;

import cn.dev33.satoken.stp.StpInterface;
import com.example.template.constant.UserType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Slf4j
public class SaTokenAuth implements StpInterface {
    @Override
    @Bean
    public List<String> getRoleList(Object loginId, String loginType) {
//        List<String> list = Stream.of(UserType.values()).map(type -> UserType.getValue(type)).collect(Collectors.toList());
        List<String> list = new ArrayList<String>();
        //todo 建库后完善登录时填入角色信息
        return list;
    }

    @Override
    public List<String> getPermissionList(Object loginId, String loginType) {
        List<String> list = new ArrayList<String>();
        return list;
    }
}
