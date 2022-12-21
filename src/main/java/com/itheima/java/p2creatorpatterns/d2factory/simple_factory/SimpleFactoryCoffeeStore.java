package com.itheima.java.p2creatorpatterns.d2factory.simple_factory;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月04日 14:38
 */
public class SimpleFactoryCoffeeStore {
    public Coffee  createCoffee(String name){
        Coffee coffee = null;
        if("AmericanCoffee".equals(name)){
            coffee = new AmericanCoffee();
        }else if("LatteCoffee".equals(name)){
            coffee = new LatteCoffee();
        }else{
            throw  new RuntimeException("没有您想要的咖啡");
        }
        return coffee;
    }
}
