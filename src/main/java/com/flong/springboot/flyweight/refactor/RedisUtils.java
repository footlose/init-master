package com.flong.springboot.flyweight.refactor;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2021/10/31 6:35 下午
 */
public class RedisUtils {

    private ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);

    private final AtomicInteger stock = new AtomicInteger(0);

    public int getStockUsed() {
        return stock.get();
    }

    public RedisUtils() {
        scheduledExecutorService.scheduleAtFixedRate(() -> {// 模拟库存消耗
            stock.addAndGet(1);
        }, 0, 100000, TimeUnit.MICROSECONDS);
    }
}
