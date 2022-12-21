package com.itheima.java.p3structure_patterns.decorator;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月06日 15:25
 */
public class FiredRice extends FastFood{
    public FiredRice() {
        super(10, "炒饭");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
