package com.gforce.route.sapling.designPattern.strategy;

/**
 * @author tianyuan14
 * @create 2019/10/4 4:02 PM
 */
public class AliPayStrategy implements PayStrategy {
    @Override
    public void pay(float money) {
        System.out.println("通过阿里支付" + money + "元");
    }
}
