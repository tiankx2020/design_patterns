package com.itheima.java.p1_principles.demo4.after;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月03日 16:46
 */
public class HeiMaSafetyDoor implements AntiTheft,FireProof,WaterProof{
    @Override
    public void antiTheft() {
        System.out.println("防盗");
    }

    @Override
    public void fireProof() {
        System.out.println("防火");
    }

    @Override
    public void waterProof() {
        System.out.println("防水");
    }
}
