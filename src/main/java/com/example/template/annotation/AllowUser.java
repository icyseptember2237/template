package com.example.template.annotation;

import com.example.template.constant.UserType;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Inherited
public @interface AllowUser {
    UserType[] value();
}
