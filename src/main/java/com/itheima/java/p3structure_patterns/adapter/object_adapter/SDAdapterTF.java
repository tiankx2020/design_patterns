package com.itheima.java.p3structure_patterns.adapter.object_adapter;

import sun.nio.cs.StreamDecoder;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月06日 9:27
 */
public class SDAdapterTF  implements SDCard {

    private TFCard card;

    public SDAdapterTF(TFCard card) {
        this.card = card;
    }

    public String readSD() {
        System.out.println("SDAdapterTF read:");
        return card.readTF();
    }

    public void writeSD(String msg) {
        System.out.println("SDAdapterTF write:");
        card.writeTF(msg);
    }


}
