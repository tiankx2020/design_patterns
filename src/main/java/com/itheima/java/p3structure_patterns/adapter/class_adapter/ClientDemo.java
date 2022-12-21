package com.itheima.java.p3structure_patterns.adapter.class_adapter;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月06日 9:26
 */
public class ClientDemo {
    public static void main(String[] args) {
        Computer computer = new Computer(new SDCardImpl());
        System.out.println(computer.readSD());
        computer.writeSD("GIGIGIGIGI");

        System.out.println("------------------------------");
        computer = new Computer(new SDAdapterTF());
        System.out.println(computer.readSD());
        computer.writeSD("hello world");
    }
}
