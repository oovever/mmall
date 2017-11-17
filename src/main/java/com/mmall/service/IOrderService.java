package com.mmall.service;

import com.mmall.common.ServerResponse;

/**
 * Created by OovEver on 2017/11/17.
 */
public interface IOrderService {
    ServerResponse pay(Long orderNo, Integer userId, String path);
}
