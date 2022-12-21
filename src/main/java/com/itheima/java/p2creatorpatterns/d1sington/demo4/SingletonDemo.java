package com.itheima.java.p2creatorpatterns.d1sington.demo4;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月10日 15:55
 */
public class SingletonDemo {
    private volatile static SingletonDemo singletonDemo;

    private SingletonDemo(){}

    public static SingletonDemo getSingletonDemo(){
        if(singletonDemo==null){
            synchronized (SingletonDemo.class){
                if(singletonDemo==null) {
                    singletonDemo = new SingletonDemo();
                }
            }
        }
        return singletonDemo;
    }
}
