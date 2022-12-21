package com.itheima.java.p3structure_patterns.proxy.dynamicproxy.cglib;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月04日 21:32
 */
public class ClientDemo {
    public static void main(String[] args) {
        ProxyFactory factory = new ProxyFactory();
        TrainStation proxyObject = factory.getProxyObject();
        proxyObject.sellTickets();
    }
}
