package com.gforce.route.sapling.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author tianyuan14
 * @create 2019/5/23 12:01 PM
 */
public class StartDemo {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        ExecutorService es = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 1000; i++) {
            es.submit(() ->
                    System.out.println(Thread.currentThread().getName() + " task:" + atomicInteger.incrementAndGet()));
        }

    }
}

