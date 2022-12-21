package com.itheima.java.p2creatorpatterns.d2factory.abstract_factory;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月04日 15:54
 */
public class AmericanDessertFactory implements DessertFactory{
    @Override
    public Coffee createCoffer() {
        return new AmericanCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new Misu();
    }
}
