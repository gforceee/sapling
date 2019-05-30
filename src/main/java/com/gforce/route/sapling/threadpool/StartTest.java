package com.gforce.route.sapling.threadpool;

/**
 * @author tianyuan14
 * @create 2019/5/30 10:48 AM
 */
public class StartTest {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> new Thread(() -> System.out.println(Thread.currentThread().getName())).start());

        thread1.run();
    }
}
