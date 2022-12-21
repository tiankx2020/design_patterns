package com.itheima.java.p3structure_patterns.adapter.object_adapter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月06日 9:26
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Computer computer = new Computer(new SDCardImpl());
        System.out.println(computer.readSD());
        computer.writeSD("GIGIGIGIGI");

        System.out.println("------------------------------");
        computer = new Computer(new SDAdapterTF(new TFCardImpl()));
        System.out.println(computer.readSD());
        computer.writeSD("hello world");
        method();
    }
    public static void method() throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("E:\\java学习笔记\\设计模式学习\\design_patterns\\src\\main\\java\\com\\itheima\\java\\p3structure_patterns\\adapter\\object_adapter\\1.txt"));
        char[] buffer= new char[10];
        while( isr.read(buffer,0,buffer.length)!=-1){
            System.out.println(Arrays.toString(buffer));
        }
    }
}
