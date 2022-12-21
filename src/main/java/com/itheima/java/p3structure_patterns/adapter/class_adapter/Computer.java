package com.itheima.java.p3structure_patterns.adapter.class_adapter;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月06日 9:24
 */
public class Computer {
    private SDCard card;

    public SDCard getCard() {
        return card;
    }

    public String readSD(){
        return card.readSD();
    }

    public void writeSD(String msg){
        card.writeSD(msg);
    }

    public Computer(SDCard sdCard){
        card = sdCard;
    }
}
