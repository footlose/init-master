package com.flong.springboot.abstractFactory.protogenesis.cuisine.impl;

import com.flong.springboot.abstractFactory.protogenesis.RedisUtils;

import java.util.concurrent.TimeUnit;

public class CacheService2Impl implements CacheService2 {

    private RedisUtils redisUtils = new RedisUtils();

    @Override
    public String get(String key) {
        return redisUtils.get(key);
    }

    @Override
    public void set(String key, String value) {
        redisUtils.set(key, value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        redisUtils.set(key, value, timeout, timeUnit);
    }

    @Override
    public void del(String key) {
        redisUtils.del(key);
    }

}
