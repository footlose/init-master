package com.flong.springboot.thread;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author wangshuai
 * @version 1.0
 * @description 读写锁
 * @date 2022/1/29 9:26 AM
 */
public class ReentrantReadWriteLockTest {


    //读写锁
    private static final ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    //读锁
    private static final Lock readLock = readWriteLock.readLock();
    //写锁
    private static final Lock writeLock = readWriteLock.writeLock();
    //
    private static Deque<String> deque = new ArrayDeque<>();


    public static String get() {
        readLock.lock();
        try {
            return deque.poll();
        } finally {
            readLock.unlock();
        }
    }

    public static void put(String value) {
        writeLock.lock();
        try {
            deque.add(value);
        } finally {
            writeLock.unlock();
        }
    }

    public static void main(String[] args) {
        new Thread(() -> {
            while (true) {
                put("小擒拿");
                put("抓乃龙抓手");
                put("下脚绊");
                put("大别子");
                put("锁喉");
                put("扣眼珠子");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException ignore) {
                }
            }
        }).start();

        new Thread(() -> {
            while (true) {
                System.out.println("韦小宝与皇上比武出招：" + get());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ignore) {
                }
            }
        }).start();
    }


}
