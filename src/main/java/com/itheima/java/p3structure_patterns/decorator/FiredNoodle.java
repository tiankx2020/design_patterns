package com.itheima.java.p3structure_patterns.decorator;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月06日 15:26
 */
public class FiredNoodle extends FastFood{

    public FiredNoodle() {
        super(12,"炒面");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
