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

        private Boolean core;

        public Worker(Runnable runnable, Boolean core) {
            this.task = runnable;
            this.core = core;
            this.thread = Executors.defaultThreadFactory().newThread(this);
        }

        @Override
        public void run() {
            runWorker(task, core);
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
        boolean result = true;
        if (workCount.get() < corePoolSize){
            result = executeWorker(runnable, true);
        }
        if (!workQueue.offer(runnable)){
            result = executeWorker(runnable, false);
        }
        if (!result){
            throw new RejectedExecutionException();
        }

    }

    private boolean executeWorker(Runnable runnable, boolean core){
        int wc = workCount.get();
        if (wc == maximumPoolSize){
            return false;
        }
        while (workCount.compareAndSet(wc, wc + 1 )) {
            Worker worker = new Worker(runnable, core);
            Thread thread = worker.thread;
            thread.start();
        }
        return true;
    }

    private void runWorker(Runnable runnable, boolean core) {
//        while (true) {
            try {
                while (runnable != null || (runnable = core ? workQueue.take() : workQueue.poll(keepAliveTime, unit)) != null) {
                    runnable.run();
                    runnable = null;
                }
            }catch (InterruptedException e){
                log.error("thread time out", e);
            }
//            if (!core){
//                workCount.decrementAndGet();
//                break;
//            }
//        }
    }
}
