package com.itheima.reggie.controller;

import com.itheima.reggie.common.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * 文件的上传和下载
 */
@RestController
@RequestMapping("/common")
@Slf4j
public class CommonController {
    /**
     * 文件上传
     * @param file
     * @return
     */
    @PostMapping("/upload")
    public R<String> upload(MultipartFile file){
        //file是一个临时文件，需要转存到指定位置，否则本次请求完临时文件会被删除
        log.info(file.toString());
        return null;

    }
}
