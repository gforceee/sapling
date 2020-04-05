package com.gforce.route.sapling.designPattern.strategy;

/**
 * @author tianyuan14
 * @create 2019/7/30 9:07 PM
 */
public class WeiboStrategy implements Strategy {
    @Override
    public int increaseFans() {
        System.out.println("刷超话热度");
        return 5000;
    }
}
