package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.Shipping;

/**
 * Created by OovEver on 2017/11/16.
 */
public interface IShippingService {
    ServerResponse add(Integer userId, Shipping shipping);
}
