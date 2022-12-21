package com.itheima.java.p2creatorpatterns.d2factory.simple_factory;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月04日 14:40
 */
public class ClientDemo {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        Coffee coffee = coffeeStore.getCoffee("AmericanCoffee");
        System.out.println( coffee.getName());
        System.out.println("-------------------------");
        coffee = coffeeStore.getCoffee("LatteCoffee");
        System.out.println(coffee.getName());
        System.out.println("--------------------------");
        coffee = coffeeStore.getCoffee("otherCoffee");

    }
}
