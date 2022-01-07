package com.flong.springboot.abstractFactory.refactor.factory.impl;

import com.flong.springboot.abstractFactory.matter.IIR;
import com.flong.springboot.abstractFactory.refactor.factory.ICacheAdapter;

import java.util.concurrent.TimeUnit;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2021/10/17 10:22 下午
 */
public class IIRCacheAdapter implements ICacheAdapter {

    private IIR iir = new IIR();

    @Override
    public String get(String key) {
        return iir.get(key);
    }

    @Override
    public void set(String key, String value) {
        iir.set(key, value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        iir.setExpire(key, value, timeout, timeUnit);
    }

    @Override
    public void del(String key) {
        iir.del(key);
    }

}
