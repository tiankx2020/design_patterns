package com.itheima.java.p3structure_patterns.adapter.class_adapter;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月06日 9:27
 */
public class SDAdapterTF extends TFCardImpl implements SDCard{
    public String readSD() {
        System.out.println("SDAdapterTF read:");
        return readTF();
    }

    public void writeSD(String msg) {
        System.out.println("SDAdapterTF write:");
        writeTF(msg);
    }
}
