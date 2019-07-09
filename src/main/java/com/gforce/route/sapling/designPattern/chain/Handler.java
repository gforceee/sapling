package com.gforce.route.sapling.designPattern.chain;

import sun.plugin2.message.Message;

/**
 * @author tianyuan14
 * @create 2019/7/8 7:45 PM
 */
public abstract class Handler {
    private Handler nextHandler;
    private int level;

    public Handler(int level) {
        this.level = level;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public final void handleMassage(Work work){
        if (work.getLevel() == this.level){
            this.handle(work);
        }else {
            if (nextHandler != null) {
                nextHandler.handleMassage(work);
            }else {
                System.out.println("没有下一级了");
            }
        }
    }

    abstract void handle(Work work);
}
