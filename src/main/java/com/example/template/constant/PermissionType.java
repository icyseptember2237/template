package com.example.template.constant;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;


public interface PermissionType {
     @Getter
     @AllArgsConstructor
     class DataBase implements PermissionType{
        public static final String SELECT = "SELECT";
        public static final String UPDATE = "UPDATE";
        public static final String DELETE = "DELETE";
        public static final String INSERT = "INSERT";
    }
}
