package com.gforce.route.sapling.designPattern.strategy;

/**
 * @author tianyuan14
 * @create 2019/10/4 4:02 PM
 */
public class WeChatPayStrategy implements PayStrategy {
    @Override
    public void pay(float money) {
        System.out.println("通过微信支付" + money + "元");
    }
}
