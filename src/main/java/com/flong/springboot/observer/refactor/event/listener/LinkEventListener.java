package com.flong.springboot.observer.refactor.event.listener;

import com.flong.springboot.link.domain.Link;
import com.flong.springboot.observer.refactor.LotteryResult;
import lombok.extern.slf4j.Slf4j;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2022/1/21 4:55 PM
 */
@Slf4j
public class LinkEventListener implements EventListener<Link> {

    @Override
    public void doEvent(Link result) {
        log.info("给用户 {} 发送EMAIL通知(EMAIL)：{}", result.getLinkCode(), result.getLinkCode());
    }
}
