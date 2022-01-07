package com.flong.springboot.singleton.matter;

/**
 * @author wangshuai
 * @version 1.0
 * @description 双重锁校验
 * @date 2021/10/19 5:40 下午
 */
public class Singleton_05 {

    private static volatile Singleton_05 instance;

    private Singleton_05() {}

    /**
     * 双重锁的方式是方法级锁的优化，减少了部分获取实例的耗时
     * 同时这种方式也满足了懒加载。
     */
    public static Singleton_05 getInstance() {
        if (null != instance) {
            return instance;
        }
        synchronized (Singleton_05.class) {
            if (null == instance) {
                instance = new Singleton_05();
            }
        }
        return instance;
    }

}
