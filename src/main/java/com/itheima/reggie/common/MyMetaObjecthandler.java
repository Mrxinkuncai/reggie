package com.itheima.reggie.common;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * 自定义元数据对象处理器
 */
@Component
@Slf4j
public class MyMetaObjecthandler implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {
        log.info("公共字段自动填充[insert].....");
        log.info(metaObject.toString());
        metaObject.setValue("createTime", LocalDateTime.now());
        metaObject.setValue("updateTime", LocalDateTime.now());
        metaObject.setValue("createUser", BaceContext.getCurrentId());
        metaObject.setValue("updateUser", BaceContext.getCurrentId());

    }

    @Override
    public void updateFill(MetaObject metaObject) {
        log.info("公共字段自动填充[update].....");
        log.info(metaObject.toString());
        long id=Thread.currentThread().getId();
        log.info("线程id为：{}",id);
        metaObject.setValue("updateTime", LocalDateTime.now());
        metaObject.setValue("updateUser", BaceContext.getCurrentId());


    }
}
