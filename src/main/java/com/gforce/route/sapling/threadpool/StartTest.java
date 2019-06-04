package com.gforce.route.sapling.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author tianyuan14
 * @create 2019/5/30 10:48 AM
 */
public class StartTest {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(0);

        ExecutorService es = new SimpleThreadPool(5,10, 1000,TimeUnit.SECONDS, new LinkedBlockingQueue<>());
        for (int i = 0; i < 1000; i++) {
            es.submit(() ->
                    System.out.println(Thread.currentThread().getName() + " task:" + atomicInteger.incrementAndGet()));
        }
    }
}
