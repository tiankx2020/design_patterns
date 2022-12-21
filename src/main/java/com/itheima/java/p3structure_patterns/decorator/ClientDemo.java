package com.itheima.java.p3structure_patterns.decorator;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月06日 15:33
 */
public class ClientDemo {
    public static void main(String[] args) {
        FastFood food = new FiredRice();
        System.out.println("老板来一份炒面");
        System.out.println(food.cost()+"元");
        food  = new Egg(food);
        food  = new Bacon(food);
        System.out.println(food.cost());
    }

}