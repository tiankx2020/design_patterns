package com.itheima.java.p2creatorpatterns.d2factory.config_factory;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月04日 16:50
 */
public class Client {
    public static void main(String[] args) {
        Coffee coffee = CoffeeFactory.createCoffee("latte");
        Coffee coffee1 = CoffeeFactory.createCoffee("latte");
        System.out.println(coffee==coffee1);
    }
}
