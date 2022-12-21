package com.itheima.java.p1_principles.demo3.after;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月03日 16:24
 */
public class AMDCPU implements CPU{
    @Override
    public void run() {
        System.out.println("使用AMD CPU运行");
    }
}
