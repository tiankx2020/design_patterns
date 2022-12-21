package com.itheima.java.p1_principles.demo4.after;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月03日 16:47
 */
public class ITDoor implements FireProof,WaterProof{
    @Override
    public void fireProof() {
        System.out.println("防火");
    }

    @Override
    public void waterProof() {
        System.out.println("防水");
    }
}
