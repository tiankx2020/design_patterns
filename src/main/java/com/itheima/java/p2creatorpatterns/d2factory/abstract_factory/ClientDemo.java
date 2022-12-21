package com.itheima.java.p2creatorpatterns.d2factory.abstract_factory;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月04日 15:56
 */
public class ClientDemo {
    public static void main(String[] args) {
        // AmericanDessertFactory factory = new AmericanDessertFactory();
        ItalyDessertFactory factory = new ItalyDessertFactory();
        Coffee coffer = factory.createCoffer();
        System.out.println(coffer.getName());
        Dessert dessert = factory.createDessert();
        dessert.show();
    }
}
