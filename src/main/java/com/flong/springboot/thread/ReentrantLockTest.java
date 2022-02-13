package com.flong.springboot.thread;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2022/1/28 5:44 PM
 */
public class ReentrantLockTest {

    private static ReentrantLock reentrantLock = new ReentrantLock(true);

//    public static void main(String[] args) throws InterruptedException {
//        ExecutorService executorService = Executors.newCachedThreadPool();
//
//        final Semaphore semaphore = new Semaphore(10);
//        for (int i = 0; i < 10; i++) {
//            int finalI = i;
////            Thread.sleep(1000);
//            executorService.execute(() -> quen(finalI));
//        }
//    }

//    public static void fairLock(){
//        reentrantLock.lock();
//        try {
//            System.out.println(Thread.currentThread().getName()  + "正在持有锁");
//            System.out.println(Thread.currentThread().getName()  + "正在执行动作");
//        }finally {
//            System.out.println(Thread.currentThread().getName()  + "释放了锁");
//            reentrantLock.unlock();
//        }
//    }
//
//    public static void main(String[] args) {
//        Runnable runnable = () -> {
//            System.out.println(Thread.currentThread().getName() + "启动");
//            fairLock();
//        };
//        Thread[] thread = new Thread[10];
//        for(int i = 0;i < 10;i++){
//            thread[i] = new Thread(runnable);
//        }
//        for(int i = 0;i < 10;i++){
//            thread[i].start();
//        }
//    }
//
//
//    public static void quen(int i) {
//        reentrantLock.lock();
//        try {
//            System.out.println(i);
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            reentrantLock.unlock();
//        }
//    }
//
//    public static void quen2(int i) {
//        System.out.println(i);
//    }

//    // 创建锁对象(公平锁)
//    private static final ReentrantLock lock = new ReentrantLock(true);
//
//    public static void main(String[] args) {
//        // 定义线程任务
//        Runnable runnable = () -> {
//            // 加锁
//            lock.lock();
//            try {
//                // 打印执行线程的名字
//                System.out.println("线程:" + Thread.currentThread().getName());
//            } finally {
//                // 释放锁
//                lock.unlock();
//            }
//        };
//        // 创建多个线程
//        for (int i = 0; i < 10; i++) {
//            new Thread(runnable).start();
//        }
//    }

    //创建公平锁
    private static ReentrantLock lock = new ReentrantLock(true);

    public void run() {
        while (true) {
            lock.lock();
            try {
                System.out.println(Thread.currentThread().getName() + "获得锁");
            } finally {
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) {
        Runnable runnable = () -> {
            while (true) {
                // 加锁
                lock.lock();
                try {
                    // 打印执行线程的名字
                    System.out.println("线程:" + Thread.currentThread().getName());
                } finally {
                    // 释放锁
                    lock.unlock();
                }
            }

        };

        Thread th1 = new Thread(runnable);
        Thread th2 = new Thread(runnable);
        th1.start();
        th2.start();
    }
}
