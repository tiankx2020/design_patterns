package com.itheima.java.p3structure_patterns.proxy.dynamicproxy.jdk;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月04日 19:48
 */
public class ClientDemo {
    public static void main(String[] args) {
        ProxyFactory factory = new ProxyFactory();
        SellTickets sellTickets = factory.getSellTickets();
        sellTickets.sellTickets();
        System.out.println(sellTickets);
        while (true);
    }
}
