package com.itheima.java.p1_principles.demo1;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月03日 15:29
 */
public class Client {
    public static void main(String[] args) {
        SougouSkin skin = new SougouSkin(new DefaultSkin());
        skin.display();
        skin = new SougouSkin(new HeimaSkin());
        skin.display();
    }
}
