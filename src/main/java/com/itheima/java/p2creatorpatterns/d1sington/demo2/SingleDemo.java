package com.itheima.java.p2creatorpatterns.d1sington.demo2;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月04日 10:16
 */
public class SingleDemo {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getSingleton();
        Singleton s2 = Singleton.getSingleton();
        System.out.println(s1 == s2);
    }
}
