package com.mmall.service;

import com.mmall.common.ServerResponse;

/**
 * Created by OovEver on 2017/11/14.
 */
public interface ICategoryService {
    public ServerResponse addCategory(String categoryName, Integer parentId);

    public ServerResponse updateCategoryName(Integer categoryId, String categoryName);
}
