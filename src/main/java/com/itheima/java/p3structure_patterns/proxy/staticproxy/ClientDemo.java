package com.itheima.java.p3structure_patterns.proxy.staticproxy;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月04日 19:22
 */
public class ClientDemo {
    public static void main(String[] args) {
        ProxyPoint proxyPoint = new ProxyPoint();
        proxyPoint.sellTickets();
    }
}
