package com.gforce.route.sapling.threadpool;

import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author tianyuan14
 * @create 2019/5/23 7:52 PM
 */
public class SimpleThreadPool extends AbstractExecutorService {

    private int corePoolSize;

    private int maximumPoolSize;

    private long keepAliveTime;

    private TimeUnit unit;

    private BlockingQueue<Runnable> workQueue;

    private AtomicInteger taskCount;

    public SimpleThreadPool(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, BlockingQueue<Runnable> workQueue) {
        this.corePoolSize = corePoolSize;
        this.maximumPoolSize = maximumPoolSize;
        this.keepAliveTime = keepAliveTime;
        this.unit = unit;
        this.workQueue = workQueue;
    }

    @Override
    public void shutdown() {

    }

    @Override
    public List<Runnable> shutdownNow() {
        return null;
    }

    @Override
    public boolean isShutdown() {
        return false;
    }

    @Override
    public boolean isTerminated() {
        return false;
    }

    @Override
    public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
        return false;
    }

    @Override
    public void execute(Runnable command) {
        if (taskCount.get() < corePoolSize){
            Thread thread = new Thread(command);
            thread.start();
        }else {
            workQueue.add(command);
        }

    }
}
