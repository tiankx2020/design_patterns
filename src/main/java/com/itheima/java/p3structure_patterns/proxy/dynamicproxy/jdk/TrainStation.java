package com.itheima.java.p3structure_patterns.proxy.dynamicproxy.jdk;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月04日 19:21
 */
public class TrainStation implements SellTickets {
    @Override
    public void sellTickets() {
        System.out.println("火车站卖票");
    }
}
