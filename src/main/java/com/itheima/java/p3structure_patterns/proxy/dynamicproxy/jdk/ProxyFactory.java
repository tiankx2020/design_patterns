package com.itheima.java.p3structure_patterns.proxy.dynamicproxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月04日 19:24
 */
public class ProxyFactory {
    private TrainStation station = new TrainStation();
    public SellTickets getSellTickets(){
        SellTickets sellTickets = (SellTickets) Proxy.newProxyInstance(
                station.getClass().getClassLoader(),
                station.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("通过jdk动态代理进行卖票，并收取一定的服务费");
                        Object invoke = method.invoke(station, args);
                        return invoke;
                    }
                });
        return sellTickets;
    }

    public SellTickets sellTickets(){
        return getSellTickets();
    }
}
