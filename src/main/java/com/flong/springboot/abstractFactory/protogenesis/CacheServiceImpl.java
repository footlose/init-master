package com.flong.springboot.abstractFactory.protogenesis;

import com.flong.springboot.abstractFactory.matter.EGM;
import com.flong.springboot.abstractFactory.matter.IIR;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2021/10/17 10:03 下午
 */
public class CacheServiceImpl implements CacheService {
    private RedisUtils redisUtils = new RedisUtils();

    private EGM egm = new EGM();

    private IIR iir = new IIR();

    @Override
    public String get(String key, int redisType) {

        if (1 == redisType) {
            return egm.gain(key);
        }

        if (2 == redisType) {
            return iir.get(key);
        }

        return redisUtils.get(key);
    }

    @Override
    public void set(String key, String value, int redisType) {

        if (1 == redisType) {
            egm.set(key, value);
            return;
        }

        if (2 == redisType) {
            iir.set(key, value);
            return;
        }

        redisUtils.set(key, value);
    }


}
