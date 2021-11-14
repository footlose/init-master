package com.flong.springboot.core.util;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.ZonedDateTime;

/**
 * @author wangshuai
 * @version 1.0
 * @description 自动填充功能
 * @date 2021/11/14 11:34 上午
 */
@Slf4j
@Component
public class DomainMetaObjectHandler implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {
        this.strictInsertFill(metaObject, "createdTime", ZonedDateTime.class, ZonedDateTime.now());
        this.strictInsertFill(metaObject, "id", Long.class, SnowflakeIdWorker.getId());
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        this.strictUpdateFill(metaObject, "updatedTime", ZonedDateTime.class, ZonedDateTime.now());
    }
}
