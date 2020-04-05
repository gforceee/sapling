package com.gforce.route.sapling.thread;

import java.util.concurrent.CountDownLatch;

/**
 * @author tianyuan14
 * @create 2020/4/4 5:50 PM
 */
public class CountDownLatchDemo {
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(2000);
                System.out.println("子线程结束");
                countDownLatch.countDown();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });
        thread.start();
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("主线程结束");

    }
}
