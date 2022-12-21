package com.itheima.java.p2creatorpatterns.d1sington.demo2;

/**
 * @Description: 饿汉式 单例模式 2
 * @author: scott
 * @date: 2022年04月04日 10:14
 */
public class Singleton {

    private static Singleton singleton;
    private Singleton() {
    }

    static{
        singleton = new Singleton();
    }

    public static Singleton getSingleton(){
        return singleton;
    }
}
