package com.gforce.route.sapling.designPattern.strategy;

/**
 * @author tianyuan14
 * @create 2019/7/30 9:17 PM
 */
public class IncreaseFansTest {
    public static void main(String[] args) {
        int fansNum = 0;
        TransactionContext transactionContext = new TransactionContext();
        transactionContext.selectStrategy(new RedbookStrategy());
        fansNum += transactionContext.action();

        transactionContext.selectStrategy(new ByteDanceStrategy());
        fansNum += transactionContext.action();

        transactionContext.selectStrategy(new WeiboStrategy());
        fansNum += transactionContext.action();
        System.out.println(fansNum);
    }
}
