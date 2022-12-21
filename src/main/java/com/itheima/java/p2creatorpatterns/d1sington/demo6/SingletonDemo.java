package com.itheima.java.p2creatorpatterns.d1sington.demo6;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月04日 10:49
 */
public class SingletonDemo {
    public static void main(String[] args) {
        Singleton s1 = Singleton.INSTANCE;
        Singleton s2 = Singleton.INSTANCE;
        System.out.println(s1 == s2);
    }
}
