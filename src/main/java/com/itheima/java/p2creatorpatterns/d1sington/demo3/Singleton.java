package com.itheima.java.p2creatorpatterns.d1sington.demo3;

/**
 * @Description: 单例模式 懒汉式 方式1
 * @author: scott
 * @date: 2022年04月04日 10:23
 */
public class Singleton {

    private Singleton(){}

    private static Singleton singleton;

    public  synchronized static Singleton getSingleton(){
        if(singleton==null){
            singleton = new Singleton();
        }
        return singleton;
    }
    /**
     * 优点：可以实现单例模式
     * 缺点：效率太低,单例模式下大部分是执行读操作，我们需要修改加锁的时机
     */
}
