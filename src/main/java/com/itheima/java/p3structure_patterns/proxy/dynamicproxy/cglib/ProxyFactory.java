package com.itheima.java.p3structure_patterns.proxy.dynamicproxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Description: 代理对象工厂，用来获取代理对象
 * @author: scott
 * @date: 2022年04月04日 21:26
 */
public class ProxyFactory  {
    private TrainStation trainStation = new TrainStation();
    public TrainStation getProxyObject(){
        TrainStation proxy =(TrainStation) Enhancer.create(TrainStation.class, trainStation.getClass().getInterfaces(), new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("cglib 收取一定的服务费用");
                method.invoke(trainStation, objects);
                //调用咪表对象的
                return null;
            }
        });
        return proxy;
    }
}
