package com.itheima.java.p3structure_patterns.decorator;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月06日 15:55
 */
public class Bacon extends Garnish{
    public Bacon(FastFood fastFood) {
        super(fastFood, 2, "培根");
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
