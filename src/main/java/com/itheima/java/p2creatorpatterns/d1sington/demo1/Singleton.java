package com.itheima.java.p2creatorpatterns.d1sington.demo1;

/**
 * @Description: 单例模式----- 饿汉式1
 * @author: scott
 * @date: 2022年04月03日 17:26
 */
public class Singleton {


    private Singleton() {
    }

    private static Singleton singleton = new Singleton();

    public static Singleton getSingleton() {
        return singleton;
    }
}
