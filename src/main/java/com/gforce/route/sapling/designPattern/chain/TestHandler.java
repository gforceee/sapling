package com.gforce.route.sapling.designPattern.chain;

/**
 * @author tianyuan14
 * @create 2019/7/9 8:38 PM
 */
public class TestHandler extends Handler{
    public TestHandler() {
        super(2);
    }

    @Override
    void handle(Work work) {
        System.out.println("test");
    }
}
