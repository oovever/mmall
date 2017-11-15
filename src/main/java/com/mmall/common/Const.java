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
    public enum ProductStatusEnum{
        ON_SALE(1,"在线");
        private String value;
        private int code;
        ProductStatusEnum(int code,String value){
            this.code = code;
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public int getCode() {
            return code;
        }
    }
}
