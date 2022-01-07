package com.flong.springboot.abstractFactory.refactor.factory;

import java.util.concurrent.TimeUnit;

/**
 * @author wangshuai
 * @version 1.0
 * @description 适配接口，分别包装两个集群中差异化的接口名
 * @date 2021/10/17 10:17 下午
 */
public interface ICacheAdapter {

    String get(String key);

    void set(String key, String value);

    void set(String key, String value, long timeout, TimeUnit timeUnit);

    void del(String key);

}
