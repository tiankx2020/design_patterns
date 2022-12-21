package com.itheima.java.spring.observer;

import org.springframework.context.ApplicationEvent;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月07日 16:04
 */
// 定义一个事件,继承自ApplicationEvent并且写相应的构造函数
public class DemoEvent extends ApplicationEvent {
    private static final long serialVersionUID = 1L;

    private String message;

    public DemoEvent(Object source, String message) {
        super(source);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
