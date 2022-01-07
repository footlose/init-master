package com.flong.springboot.singleton.matter;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2021/10/19 4:14 下午
 */
public class Singleton_00 {

    /**
     * 静态类的方式可以在第一次运行的时候直接初始化Map类，同时这里我们也不需要到延迟加载在使用。
     * 在不需要维持任何状态下，仅仅用于全局访问，这个使用使用静态类的方式更加方便。
     * 但如果需要被继承以及需要维持一些特定状态的情况下，就适合使用单例模式。
     */
    public static Map<String, String> cache = new ConcurrentHashMap<>();







}
