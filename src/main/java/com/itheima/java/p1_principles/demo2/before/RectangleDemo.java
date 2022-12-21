package com.itheima.java.p1_principles.demo2.before;

/**
 * @Description: 测试类
 * @author: scott
 * @date: 2022年04月03日 15:37
 */
public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setWidth(10);
        r.setLength(20);
        resize(r);
        print(r);
        System.out.println("--------------------");
        Square s = new Square();
        s.setLength(5);
        resize(s);
        print(s);
    }

    //扩宽方法
    public static void resize(Rectangle r){
        while(r.getWidth()<=r.getLength()){
            r.setWidth(r.getWidth()+1);
        }
    }

    //打印操作
    public static void print(Rectangle r){
        System.out.println("length:"+r.getLength());
        System.out.println("width:"+r.getWidth());
    }

}
