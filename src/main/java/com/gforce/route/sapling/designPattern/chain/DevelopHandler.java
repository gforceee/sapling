package com.gforce.route.sapling.designPattern.chain;

/**
 * @author tianyuan14
 * @create 2019/7/9 8:38 PM
 */
public class DevelopHandler extends Handler {
    public DevelopHandler() {
        super(1);
    }

    @Override
    void handle(Work work) {
        System.out.println("develop");
    }
}
