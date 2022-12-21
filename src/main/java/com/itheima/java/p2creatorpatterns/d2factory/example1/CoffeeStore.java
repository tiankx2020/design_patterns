package com.itheima.java.p2creatorpatterns.d2factory.example1;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月04日 14:14
 */
public class CoffeeStore {

    public static void orderCoffee(String name){
        Coffee coffee = null;
        if("AmericanCoffee".equals(name)){
            coffee = new AmericanCoffee();
        }else if("LatteCoffee".equals(name)){
            coffee = new LatteCoffee();
        }else{
            throw  new RuntimeException("没有您想要的咖啡");
        }
        coffee.addMilk();
        coffee.addSugar();
        System.out.println(coffee.getName());
    }
}
