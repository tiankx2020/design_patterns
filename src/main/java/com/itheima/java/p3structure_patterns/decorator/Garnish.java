package com.itheima.java.p3structure_patterns.decorator;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月06日 15:27
 */
public abstract class Garnish extends FastFood {

    private FastFood fastFood;

    public Garnish(FastFood fastFood) {
        this.fastFood = fastFood;
    }

    public Garnish(FastFood fastFood, float price, String desc) {
        super(price, desc);
        this.fastFood = fastFood;
    }

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }



}
