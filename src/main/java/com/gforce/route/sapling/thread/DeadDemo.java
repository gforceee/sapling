package com.gforce.route.sapling.thread;


/**
 * @author tianyuan14
 * @create 2020/4/5 9:20 PM
 */
public class DeadDemo {
    public static void main(String[] args) {
        Exceute exceute = new Exceute();
        Thread t1 = new Thread(exceute, "t1");
        Thread t2 = new Thread(exceute, "t2");
        t1.start();
        t2.start();

    }
}

class Exceute implements Runnable {

    int lock1 = 1;
    Integer lock2 = new Integer(1);

    @Override
    public void run() {
        if (lock1 == 1) {
            synchronized (this) {
                System.out.println("获取到锁lock1，name:" + Thread.currentThread().getName());
                System.out.println("lock1:" + lock1);
                lock1--;
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock2) {
                    System.out.println("获取到锁lock2，name:" + Thread.currentThread().getName());
                }
            }
        } else {
            synchronized (lock2) {
                System.out.println("获取到锁lock2，name:" + Thread.currentThread().getName());
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (this) {
                    System.out.println("获取到锁lock1，name:" + Thread.currentThread().getName());
                }
            }
        }

    }
}
