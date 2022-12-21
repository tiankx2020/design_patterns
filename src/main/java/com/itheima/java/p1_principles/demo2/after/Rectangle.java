package com.itheima.java.p1_principles.demo2.after;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月03日 15:51
 */
public class Rectangle implements Quadrilateral{
    private double length;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getLength() {
        return length;
    }

    @Override
    public double getWidth() {
        return width;
    }
}
