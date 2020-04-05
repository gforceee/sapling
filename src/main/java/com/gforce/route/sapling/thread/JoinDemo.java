package com.gforce.route.sapling.thread;

/**
 * @author tianyuan14
 * @create 2020/3/16 7:33 PM
 */
public class JoinDemo extends Thread{
    private Thread previousThreaad;
    private int num;

    public Thread getPreviousThreaad() {
        return previousThreaad;
    }

    public void setPreviousThreaad(Thread previousThreaad) {
        this.previousThreaad = previousThreaad;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        try {
            if (previousThreaad != null){
                previousThreaad.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        super.run();
        System.out.println(num);
    }

    public static void main(String[] args) {
        int beginNum = 0;
        JoinDemo head = new JoinDemo();
        head.setNum(beginNum++);
        head.start();
        JoinDemo flag = head;

        for (int i = 0 ; i < 20; i++){
            JoinDemo now = new JoinDemo();
            now.setNum(beginNum++);
            now.setPreviousThreaad(flag);
            now.start();
            flag = now;
        }
    }
}
