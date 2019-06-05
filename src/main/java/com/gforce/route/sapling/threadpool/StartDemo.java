package com.gforce.route.sapling.threadpool;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author tianyuan14
 * @create 2019/5/23 12:01 PM
 */
public class StartDemo {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        ExecutorService es = new ThreadPoolExecutor(5, 10, 1000, TimeUnit.SECONDS, new LinkedBlockingQueue<>(1));
        for (int i = 0; i < 1000; i++) {
            es.submit(() ->
                    System.out.println(Thread.currentThread().getName() + " task:" + atomicInteger.incrementAndGet()));
        }

    }
}

