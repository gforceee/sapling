package com.gforce.route.sapling.designPattern.observe;

/**
 * @author tianyuan14
 * @create 2019/10/5 4:30 PM
 */
public class UserObserver implements Observer {

    private String name;

    public UserObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String article) {
        System.out.println(name + "接收到" + article);
    }
}
