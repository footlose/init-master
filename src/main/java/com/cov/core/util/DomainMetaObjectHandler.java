package com.cov.core.util;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

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
        this.strictInsertFill(metaObject, "createdTime", Date.class, new Date());
        this.strictInsertFill(metaObject, "updatedTime", Date.class, new Date());
//        Long id = SnowflakeIdWorker.getId();
//        this.strictInsertFill(metaObject, "id", Long.class, id);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        this.strictUpdateFill(metaObject, "updatedTime", Date.class, new Date());
    }
}
