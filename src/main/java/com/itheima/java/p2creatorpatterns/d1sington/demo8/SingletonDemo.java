package com.itheima.java.p2creatorpatterns.d1sington.demo8;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Description: 反射破坏单例模式
 * @author: scott
 * @date: 2022年04月04日 11:06
 */
public class SingletonDemo {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class clazz = Singleton.class;
        Constructor cons = clazz.getDeclaredConstructor();
        cons.setAccessible(true);
        Singleton s1 =(Singleton)cons.newInstance();
        Singleton s2 =(Singleton)cons.newInstance();
        System.out.println(s1 == s2);
    }
}
