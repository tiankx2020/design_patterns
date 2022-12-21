package com.itheima.java.p2creatorpatterns.d2factory.simple_factory;

public abstract class Coffee {
    public abstract String getName();

    public void addMilk(){
        System.out.println("加奶");
    }

    public void addSugar(){
        System.out.println("加糖");
    }
}
