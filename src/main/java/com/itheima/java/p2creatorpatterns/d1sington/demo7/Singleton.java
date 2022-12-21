package com.itheima.java.p2creatorpatterns.d1sington.demo7;

import java.io.ObjectInputStream;
import java.io.Serializable;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月04日 10:56
 */
public class Singleton implements Serializable {

    private Singleton() {
    }

    private static class  SingletonHolder{
        private static final Singleton  SINGLETON = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonHolder.SINGLETON;
    }

    //序列化破坏单例模式的解决方式
    public Object readResolve(){
        return SingletonHolder.SINGLETON;
    }

}
