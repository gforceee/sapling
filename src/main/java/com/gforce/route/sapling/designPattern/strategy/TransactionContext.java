package com.gforce.route.sapling.designPattern.strategy;

/**
 * @author tianyuan14
 * @create 2019/7/30 9:12 PM
 */
public class TransactionContext {
    private Strategy strategy;

    public void selectStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    public int action(){
        return strategy.increaseFans();
    }


}
