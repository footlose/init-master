package com.flong.springboot.thread;

import org.springframework.util.StopWatch;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2022/1/28 3:53 PM
 */
public class CountDownLatchTest {

    ReentrantLock reentrantLock = new ReentrantLock(true);

    private static Long getTime(Long time) throws InterruptedException {

        Thread.sleep(time);
        return time;
    }

    public static void main(String[] args) throws InterruptedException {

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        List<String> list = Arrays.asList("总舵主，陈近南", "莲花堂香主，蔡德忠", "洪顺堂香主，方大洪", "家后堂香主，马超兴", "参太堂香主，胡德帝",
                "宏化堂香主，李式开", "青木堂香主，韦小宝", "赤火堂香主，古至中", "玄水堂香主，林永超", "黄土堂香主，姚必达");
        CountDownLatch latch = new CountDownLatch(3);
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (String name : list) {
            Thread thread = new Thread(() -> {
                try {
                    long l1 = (int) (Math.random() * 9000 + 1000);
                    Long time = getTime(l1);
                    System.out.println(name + "到达:" + time);
                } catch (RuntimeException | InterruptedException e) {
//                    e.printStackTrace();
                } finally {
                    latch.countDown();
                }
            });
            executorService.execute(thread);

        }
        latch.await();
        System.out.println("天地会，核心成员到齐。开会讨论谁入宫，偷取四十二章经！「内定韦香主」");
        executorService.shutdownNow();
        stopWatch.stop();
        System.out.println(stopWatch.prettyPrint());
    }

}
