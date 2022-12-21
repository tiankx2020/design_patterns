package com.itheima.java.p2creatorpatterns.d2factory.factort_method;




/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月04日 14:14
 */
public class CoffeeStore {
    private CoffeeFactory factory;

    public void setFactory(CoffeeFactory factory) {
        this.factory = factory;
    }

    public Coffee orderCoffee(){
        Coffee coffee = factory.createCoffee();
        //加配料
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
