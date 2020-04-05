package com.gforce.route.sapling.designPattern.strategy;

/**
 * @author tianyuan14
 * @create 2019/7/30 9:06 PM
 */
public class RedbookStrategy implements Strategy {
    @Override
    public int increaseFans() {
        System.out.println("把吃的、喝的、玩的拍成美美的照片");
        return 3000;
    }
}
