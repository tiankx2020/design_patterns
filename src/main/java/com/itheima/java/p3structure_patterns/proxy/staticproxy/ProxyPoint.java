package com.itheima.java.p3structure_patterns.proxy.staticproxy;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月04日 19:22
 */
public class ProxyPoint implements SellTickets{
    private TrainStation station = new TrainStation();
    @Override
    public void sellTickets() {
        System.out.println("代售点收取一定的费用");
        station.sellTickets();
    }
}
