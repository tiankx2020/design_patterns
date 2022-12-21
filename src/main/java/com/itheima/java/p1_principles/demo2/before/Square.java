package com.itheima.java.p1_principles.demo2.before;

/**
 * @Description: 正方形类
 * @author: scott
 * @date: 2022年04月03日 15:36
 */
public class Square extends Rectangle {
    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }
}
