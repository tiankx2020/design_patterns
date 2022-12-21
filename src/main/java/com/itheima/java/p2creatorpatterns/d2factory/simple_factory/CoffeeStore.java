package com.itheima.java.p2creatorpatterns.d2factory.simple_factory;



/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月04日 14:14
 */
public class CoffeeStore {
    public Coffee getCoffee(String name){
        SimpleFactoryCoffeeStore store = new SimpleFactoryCoffeeStore();
        Coffee coffee = store.createCoffee(name);
        coffee.addSugar();
        coffee.addMilk();
        return coffee;
    }
}
