package com.itheima.java.p4havior_patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月07日 9:56
 */
public class ConcreteSubject implements Subject{
    List<Observer> list = new ArrayList<>();
    @Override
    public void attach(Observer observer) {
        list.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void ntyAll(String msg) {
        for (Observer observer : list) {
            observer.getMessage(msg);
        }
    }
}
