package com.itheima.java.spring.observer;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月07日 16:06
 */
public class ClientDemo {

    @Autowired
    DemoPublisher publisher;

    @Test
    public void test(){
        publisher.publish("hello");
    }

}
