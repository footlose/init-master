package com.flong.springboot.task;

import lombok.extern.slf4j.Slf4j;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2022/1/10 4:52 PM
 */
@Slf4j
public class CustomTaskService extends TaskService {
    @Override
    public void doTask() {
        log.info("触发定时任务-1");
    }
}
