package com.itheima.java.p2creatorpatterns.d1sington.demo4;

/**
 * @Description: 单例模式 饿汉式2 双重锁方式
 * @author: scott
 * @date: 2022年04月04日 10:26
 * 优点：解决了单例、性能、线程安全问题
 */
public class Singleton {

    private  Singleton(){}

    private volatile  static  Singleton singleton;

    public static Singleton getSingleton(){
        if(singleton==null){
            synchronized (Singleton.class){
                if(singleton==null){
                    singleton = new Singleton();
                }
            }
        }
        return  singleton;
    }
}
