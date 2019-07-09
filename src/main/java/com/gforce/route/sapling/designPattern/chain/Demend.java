package com.gforce.route.sapling.designPattern.chain;

/**
 * @author tianyuan14
 * @create 2019/7/9 8:42 PM
 */
public class Demend {
    public static void main(String[] args) {
        Work test = new Work(2);
        Work develop = new Work(1);

        TestHandler testHandler = new TestHandler();
        DevelopHandler developHandler = new DevelopHandler();
        developHandler.setNextHandler(testHandler);

        developHandler.handleMassage(test);
        developHandler.handleMassage(develop);
    }
}
