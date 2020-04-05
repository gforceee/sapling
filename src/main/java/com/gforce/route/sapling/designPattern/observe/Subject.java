package com.gforce.route.sapling.designPattern.observe;

/**
 * @author tianyuan14
 * @create 2019/10/4 5:27 PM
 */
public interface Subject {

    void RegisterObserver(Observer observer);

    void RemoveObserver(Observer observer);

    void NotifyObservers(String article);
}
