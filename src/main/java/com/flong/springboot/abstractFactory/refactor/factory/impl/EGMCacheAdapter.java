package com.flong.springboot.abstractFactory.refactor.factory.impl;

import com.flong.springboot.abstractFactory.matter.EGM;
import com.flong.springboot.abstractFactory.refactor.factory.ICacheAdapter;

import java.util.concurrent.TimeUnit;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2021/10/17 10:20 下午
 */
public class EGMCacheAdapter implements ICacheAdapter {

    private EGM egm = new EGM();

    @Override
    public String get(String key) {
        return egm.gain(key);
    }

    @Override
    public void set(String key, String value) {
         egm.set(key,value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        egm.setEx(key,value,timeout,timeUnit);
    }

    @Override
    public void del(String key) {
        egm.delete(key);
    }
}
