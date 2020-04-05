package com.gforce.route.sapling.designPattern.demeter;

/**
 * @author tianyuan14
 * @create 2019/11/14 1:26 PM
 */
public class Cashier {
    public void receipt(Customer myCustomer, double payment) {
        myCustomer.pay(payment);
    }
}
