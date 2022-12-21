package com.itheima.java.p1_principles.demo1;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月03日 15:28
 */
public class SougouSkin {
    private AbstractSkin skin;
    public void display(){
        skin.display();
    }

    public SougouSkin(AbstractSkin skin) {
        this.skin = skin;
    }

    public void setSkin(AbstractSkin skin) {
        this.skin = skin;
    }
}
