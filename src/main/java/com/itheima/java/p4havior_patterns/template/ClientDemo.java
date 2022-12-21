package com.itheima.java.p4havior_patterns.template;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月07日 15:54
 */
public class ClientDemo {
    public static void main(String[] args) {
        AbstractClass template1 = new Template1();
        AbstractClass template2 = new Template1();
        template1.process();
        System.out.println("--------------------");
        template2.process();
    }
}
