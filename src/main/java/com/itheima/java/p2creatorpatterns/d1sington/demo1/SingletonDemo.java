package com.itheima.java.p2creatorpatterns.d1sington.demo1;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月03日 17:28
 */
public class SingletonDemo {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getSingleton();
        Singleton s2 = Singleton.getSingleton();
        System.out.println(s1 == s2);
    }
}
