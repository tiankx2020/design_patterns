package com.itheima.java.p2creatorpatterns.d1sington.demo5;

/**
 * @Description: 单例模式 枚举方式
 * @author: scott
 * @date: 2022年04月04日 10:36
 */
public class SingletonDemo {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance1 == instance);
    }
}
