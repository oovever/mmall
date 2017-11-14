package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.User;

/**
 * Created by OovEver on 2017/11/14.
 */
public interface IUserService {
    ServerResponse<User> login(String username, String password);

}
