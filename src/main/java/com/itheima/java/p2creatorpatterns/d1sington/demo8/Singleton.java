package com.itheima.java.p2creatorpatterns.d1sington.demo8;

import com.itheima.java.p1_principles.demo5.Star;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月04日 11:05
 */
public class Singleton {
    //反射破坏单例模式的解决方案
    public static boolean f = false;
    private Singleton() {
        if(f==true){
            throw new RuntimeException("单例对象不能被创建多个");
        }
        f = true;
    }

    // private Singleton(){}

    private static volatile  Singleton singleton;


    public static Singleton getSingleton(){
        if(singleton==null){
            synchronized (Singleton.class){
                if(singleton==null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

}
