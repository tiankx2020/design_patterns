package com.itheima.java.spring.observer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月07日 16:05
 */
// 发布事件，可以通过ApplicationEventPublisher  的 publishEvent() 方法发布消息。
@RestController
public class DemoPublisher {

    @Autowired
    ApplicationContext applicationContext;

    public void publish(String message){
        //发布事件
        applicationContext.publishEvent(new DemoEvent(this, message));
    }
}
