package com.itheima.java.spring.observer;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月07日 16:05
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {

    //使用onApplicationEvent接收消息
    @Override
    public void onApplicationEvent(DemoEvent event) {
        String msg = event.getMessage();
        System.out.println("接收到的信息是："+msg);
    }

}
