package com.gforce.route.sapling.designPattern.observe;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tianyuan14
 * @create 2019/10/5 4:27 PM
 */
public class AccountSubject implements Subject {

    List<Observer> observers = new ArrayList<>(0);

    @Override
    public void RegisterObserver(Observer observer) {
        observers.add(observer);

    }

    @Override
    public void RemoveObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void NotifyObservers(String article) {
        observers.stream().forEach(item -> item.update(article));
    }
}
