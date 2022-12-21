package com.itheima.java.p2creatorpatterns.d1sington.demo5;

/**
 * @Description: 单例模式 饿汉式 使用静态内部类
 * @author: scott
 * @date: 2022年04月04日 10:33
 */
public class Singleton {

    private Singleton(){}


    //定义一个静态内部类
    private static class SingleHolder{
        private  final static Singleton SINGLETON = new Singleton();
    }

    public static Singleton getInstance(){
        return SingleHolder.SINGLETON;
    }
}
