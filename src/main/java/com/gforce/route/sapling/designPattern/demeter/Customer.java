package com.gforce.route.sapling.designPattern.demeter;

/**
 * @author tianyuan14
 * @create 2019/11/14 1:26 PM
 */
public class Customer {
    private String firstName;
    private String lastName;
    private Wallet myWallet;
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public Wallet getWallet(){
        return myWallet;
    }

    public boolean pay(double payment){
        if (myWallet.getTotalMoney() > payment) {
            myWallet.subtractMoney(payment);
            return true;
        } else {
            System.out.println("not enough money");
            return false;
        }
    }
}
