package com.itheima.java.p4havior_patterns.observer;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月07日 9:58
 */
public class ConcreteObserver implements Observer{
    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void getMessage(String msg) {
        System.out.println(name+": "+msg);
    }
}
