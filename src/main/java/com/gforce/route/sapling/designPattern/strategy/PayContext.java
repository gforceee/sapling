package com.gforce.route.sapling.designPattern.strategy;

/**
 * @author tianyuan14
 * @create 2019/10/4 4:03 PM
 */
public class PayContext {

    private PayStrategy payStrategy;

    public PayContext(PayStrategy payStrategy){
        this.payStrategy = payStrategy;
    }

    public void payMoney(float money){
        payStrategy.pay(money);
    }
}
