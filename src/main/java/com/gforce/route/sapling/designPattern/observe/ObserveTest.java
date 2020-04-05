package com.gforce.route.sapling.designPattern.observe;

/**
 * @author tianyuan14
 * @create 2019/10/5 4:36 PM
 */
public class ObserveTest {
    public static void main(String[] args) {
        AccountSubject merchant  = new AccountSubject();
        UserObserver tom = new UserObserver("Tom");
        UserObserver jerry = new UserObserver("Jerry");
        merchant.RegisterObserver(tom);
        merchant.RegisterObserver(jerry);

        String article = "一些七七八八的事";
        System.out.println("发表推送" + article);
        merchant.NotifyObservers(article);
    }
}
