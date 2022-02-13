package com.flong.springboot.observer.refactor;

import com.flong.springboot.observer.refactor.event.EventManager;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2022/1/21 4:22 PM
 */
public abstract class LotteryService {

    private final EventManager eventManager;

    public LotteryService() {
        //订阅三种通知方式
        eventManager = new EventManager(EventManager.EventTypeEnum.MQ,
                EventManager.EventTypeEnum.Message,
                EventManager.EventTypeEnum.EMAIL);
    }

    public LotteryResult draw(String uId) {
        LotteryResult lotteryResult = doDraw(uId);
        eventManager.notify(lotteryResult);
        return lotteryResult;
    }

    protected abstract LotteryResult doDraw(String uId);

}
