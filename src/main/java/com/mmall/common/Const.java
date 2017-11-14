package com.mmall.common;

/**
 * Created by OovEver on 2017/11/14.
 */
public class Const {
//类型
    public static final String EMAIL = "email";
    public static final String USERNAME = "username";
//    当前用户
    public static final String CURRENT_USER = "currentUser";
//    角色
    public interface Role{
        int ROLE_CUSTOMER = 0; //普通用户
        int ROLE_ADMIN = 1;//管理员
    }
}
