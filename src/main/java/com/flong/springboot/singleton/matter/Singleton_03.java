package com.flong.springboot.singleton.matter;

/**
 * @author wangshuai
 * @version 1.0
 * @description 饿汉模式
 * @date 2021/10/19 4:17 下午
 */
public class Singleton_03 {

    private static Singleton_03 instance = new Singleton_03();

    private Singleton_03() {

    }

    /**
     * 在程序启动的时候直接运行加载，后续有外部需要使用的时候获取即可
     * 但此种方式并不是懒加载，也就是说无论你程序中是否用到这样的类都会在程序启动之初进行创建
     */
    public static Singleton_03 getInstance() {
        return instance;
    }
}
