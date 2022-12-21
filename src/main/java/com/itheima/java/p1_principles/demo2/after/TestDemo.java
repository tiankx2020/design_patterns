package com.itheima.java.p1_principles.demo2.after;

/**
 * 之前长方形和正方形是继承关系，后来重写使得长方形和正方形实现同一个接口。实现解耦
 */
public class TestDemo {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10,5);
        resize(rectangle);
        print(rectangle);
        Square square = new Square(5);
        // resize(square); 直接报错

    }

    public static void resize(Rectangle r){
        while(r.getWidth()<=r.getLength()){
            r.setWidth(r.getWidth()+1);
        }
    }

    public static void print(Quadrilateral q){
        System.out.println("length:"+q.getLength());
        System.out.println("width:"+q.getWidth());
    }
}
