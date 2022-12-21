package com.itheima.java.p2creatorpatterns.d2factory.factort_method;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月04日 15:14
 */
public class LatteCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
