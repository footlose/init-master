package com.flong.springboot.observer.refactor.event.listener;

import com.flong.springboot.observer.refactor.LotteryResult;
import lombok.extern.slf4j.Slf4j;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2022/1/21 4:28 PM
 */
@Slf4j
public class MQEventListener implements EventListener<LotteryResult>{
    @Override
    public void doEvent(LotteryResult result) {
        log.info("记录用户 {} 摇号结果(MQ)：{}", result.getUId(), result.getMsg());
    }
}
