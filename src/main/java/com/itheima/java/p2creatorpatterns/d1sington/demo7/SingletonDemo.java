package com.itheima.java.p2creatorpatterns.d1sington.demo7;

import java.io.*;

/**
 * @Description: 通过序列化破坏单例模式
 * @author: scott
 * @date: 2022年04月04日 10:59
 */
public class SingletonDemo {
    public static void main(String[] args) throws Exception {
            writeObject2File();
        Singleton singleton = readObjectFromFile();
        Singleton singleton2 = readObjectFromFile();
        System.out.println(singleton2 == singleton);
    }
    public static Singleton  readObjectFromFile() throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:\\java学习笔记\\设计模式学习\\design_patterns\\src\\main\\java\\com\\itheima\\java\\p2creatorpatterns\\d1sington\\demo7\\a.txt"));
        Singleton singleton = (Singleton)ois.readObject();
        ois.close();
        return singleton;
    }
    public static void writeObject2File() throws Exception {
        Singleton instance = Singleton.getInstance();

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E:\\java学习笔记\\设计模式学习\\design_patterns\\src\\main\\java\\com\\itheima\\java\\p2creatorpatterns\\d1sington\\demo7\\a.txt"));

        oos.writeObject(instance);

        oos.close();
    }

}
