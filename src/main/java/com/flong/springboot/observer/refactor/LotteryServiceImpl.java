package com.flong.springboot.observer.refactor;

import com.flong.springboot.observer.matter.MinibusTargetService;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2022/1/21 4:22 PM
 */
@Slf4j
public class LotteryServiceImpl extends LotteryService{

    private final MinibusTargetService minibusTargetService = new MinibusTargetService();

    @Override
    public LotteryResult doDraw(String uId) {
        String lottery = minibusTargetService.lottery(uId);
        // 结果
        return new LotteryResult(uId, lottery, new Date(),lottery);
    }
}
