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
public class MessageEventListener implements EventListener<LotteryResult> {
    @Override
    public void doEvent(LotteryResult result) {
        log.info("给用户 {} 发送短信通知(短信)：{}", result.getUId(), result.getMsg());
    }
}
