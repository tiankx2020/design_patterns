package com.itheima.java.p4havior_patterns.observer;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月07日 9:59
 */
public class ClientDemo {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        subject.attach(new ConcreteObserver("张三"));
        subject.attach(new ConcreteObserver("李4"));
        subject.attach(new ConcreteObserver("王五"));
        subject.ntyAll("快来");

    }
}
