package com.flong.springboot.thread;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2022/1/28 9:34 AM
 */
@Slf4j
public class SynchronizedTest {


    private static ExecutorService jiyuan = Executors.newFixedThreadPool(10);

    private static volatile Boolean laobao = false;

    public static synchronized void qingguan(String name) throws InterruptedException {
        while (true) {
            log.info("与" + name + "进行交易");
            if (Boolean.TRUE.equals(laobao)) {
                laobao = false;
                log.info("与" + name + "交易结束");
                break;
            }
            Thread.sleep(1000);
        }
    }

    public static class Keguan implements Runnable {
        private final String name;

        public Keguan(String name) {
            this.name = name;
        }

        @SneakyThrows
        @Override
        public void run() {
            qingguan(name);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        List<String> piaoke = new ArrayList<>();
        piaoke.add("weixiaobao");
        piaoke.add("xufengnian");
        piaoke.add("xuanyuandapan");

        for (String name : piaoke) {
            Keguan keguan = new Keguan(name);
            jiyuan.execute(keguan);
            Thread.sleep(3000);
            laobao = true;
        }

    }

}
