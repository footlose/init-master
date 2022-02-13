package com.flong.springboot.observer.refactor;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class LotteryServiceTest {

    @Test
    public void draw() {
        LotteryService lotteryService = new LotteryServiceImpl();
         lotteryService.draw("2765789109876");
//        log.info("测试结果：{}", JSON.toJSONString(result));
    }

}