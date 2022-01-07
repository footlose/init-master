package com.flong.springboot.abstractFactory.refactor.impl;

import com.flong.springboot.abstractFactory.protogenesis.RedisUtils;

import java.util.concurrent.TimeUnit;

public class CacheService3Impl implements CacheService3 {

    private RedisUtils redisUtils = new RedisUtils();

    @Override
    public String get(String key) {
        return "";
    }

    @Override
    public void set(String key, String value) {

    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {

    }

    @Override
    public void del(String key) {
    }

}
