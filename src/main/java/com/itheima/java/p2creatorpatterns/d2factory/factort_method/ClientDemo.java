package com.itheima.java.p2creatorpatterns.d2factory.factort_method;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月04日 15:17
 */
public class ClientDemo {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        AmericanCoffeeFactory americanCoffeeFactory = new AmericanCoffeeFactory();
        coffeeStore.setFactory(americanCoffeeFactory);
        Coffee coffee = coffeeStore.orderCoffee();
        System.out.println(coffee.getName());
    }
}
