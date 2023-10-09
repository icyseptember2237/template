package com.example.template.constant;

public enum UserType {
    MANAGER("manager"),
    EMPLOYEE("employee"),
    ADMIN("admin");

    private final String value;

    UserType(String value){
        this.value = value;
    }

    String getValue(UserType userType) {
        return userType.value;
    }

    public static UserType getType(String value){
        switch (value) {
            case "employee":
                return UserType.EMPLOYEE;
            case "manager":
                return UserType.MANAGER;
            case "admin":
                return UserType.ADMIN;
            default:
                return null;
        }
    }

}
