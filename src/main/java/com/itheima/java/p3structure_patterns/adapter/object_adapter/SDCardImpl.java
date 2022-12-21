package com.itheima.java.p3structure_patterns.adapter.object_adapter;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月06日 9:21
 */
public class SDCardImpl implements SDCard {
    @Override
    public String readSD() {
       String s  = "SDCard read hello world";
       return s;
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("SDCard write:"+msg);
    }
}
