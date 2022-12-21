package com.itheima.java.p2creatorpatterns.d2factory.example1;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月04日 14:16
 */
public class ClientDemo {
    public static void main(String[] args) {
        CoffeeStore.orderCoffee("AmericanCoffee");
        System.out.println("--------------------------");
        CoffeeStore.orderCoffee("LatteCoffee");
        System.out.println("--------------------------");
        CoffeeStore.orderCoffee("otherCoffee");
    }
}
