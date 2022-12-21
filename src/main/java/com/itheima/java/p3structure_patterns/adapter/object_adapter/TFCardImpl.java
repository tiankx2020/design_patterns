package com.itheima.java.p3structure_patterns.adapter.object_adapter;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月06日 9:23
 */
public class TFCardImpl implements TFCard {
    @Override
    public String readTF() {
        String s = "TFCard read hello world";
        return s;
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("TFCard write:"+msg);
    }
}
