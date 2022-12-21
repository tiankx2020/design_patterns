package com.itheima.java.p3structure_patterns.decorator;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月06日 15:30
 */
public class Egg extends Garnish{

    public Egg(FastFood fastFood) {
        super(fastFood, 1, "鸡蛋");
    }

    @Override
    public float cost() {
        return getFastFood().cost()+getPrice();
    }

    @Override
    public String getDesc() {
        return super.getDesc() +getFastFood().getDesc();
    }
}
