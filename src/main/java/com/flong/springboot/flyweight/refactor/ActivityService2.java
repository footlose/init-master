package com.flong.springboot.flyweight.refactor;

import com.flong.springboot.flyweight.matter.Activity;
import com.flong.springboot.flyweight.matter.Stock;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2021/10/31 6:46 下午
 */
public class ActivityService2 {

    private final RedisUtils redisUtils = new RedisUtils();

    public Activity queryActivityInfo(Long id) {
        Activity activity = ActivityFactory.getActivity(id);
        // 模拟从Redis中获取库存变化信息
        Stock stock = new Stock(1000, redisUtils.getStockUsed());
        activity.setStock(stock);
        return activity;
    }

}
