package com.gforce.route.sapling.threadpool;

import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author tianyuan14
 * @create 2019/5/23 7:52 PM
 */
@Slf4j
public class SimpleThreadPool extends AbstractExecutorService {

    private AtomicInteger workCount =  new AtomicInteger(0);

    private int corePoolSize;

    private int maximumPoolSize;

    private long keepAliveTime;

    private TimeUnit unit;

    private BlockingQueue<Runnable> workQueue;

    public SimpleThreadPool(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, BlockingQueue<Runnable> workQueue) {
        this.corePoolSize = corePoolSize;
        this.maximumPoolSize = maximumPoolSize;
        this.keepAliveTime = keepAliveTime;
        this.unit = unit;
        this.workQueue = workQueue;
    }

    class Worker implements Runnable{

        private Runnable task;

        private Thread thread;

        public Worker(Runnable runnable) {
            this.task = runnable;
            this.thread = Executors.defaultThreadFactory().newThread(this);
        }

        @Override
        public void run() {
            runWorker(task);
        }
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
    public void execute(Runnable runnable) {
        if (workCount.get() < corePoolSize){
            executeWorker(runnable);
        }
        if (!workQueue.offer(runnable)){
            throw new RejectedExecutionException();
        }
    }

    private void executeWorker(Runnable runnable){
        int wc = workCount.get();
        while (workCount.compareAndSet(wc, wc + 1 )) {
            Worker worker = new Worker(runnable);
            Thread thread = worker.thread;
            thread.start();
        }
    }

    private void runWorker(Runnable runnable) {
        while (workCount.get() <= corePoolSize) {
            try {
                while (runnable != null || (runnable = workQueue.take()) != null) {
                    runnable.run();
                    runnable = null;
                }
            }catch (InterruptedException e){
                log.error("thread time out", e);
            }
        }
    }
}
