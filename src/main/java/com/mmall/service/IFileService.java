package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by OovEver on 2017/11/15.
 */
public interface IFileService {
    String upload(MultipartFile file, String path);
}
