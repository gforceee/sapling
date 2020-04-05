package com.gforce.route.sapling.designPattern.demeter;

/**
 * @author tianyuan14
 * @create 2019/11/14 1:26 PM
 */
public class Wallet {
    private double value;
    public double getTotalMoney() {
        return value;
    }
    public void setTotalMoney(double newValue) {
        value = newValue;
    }
    public void addMoney(double deposit) {
        value += deposit;
    }
    public void subtractMoney(double debit) {
        value -= debit;
    }
}
