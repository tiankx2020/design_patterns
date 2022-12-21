package com.itheima.java.p1_principles.demo4.after;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月03日 16:46
 */
public class DoorDemo {
    public static void main(String[] args) {
        HeiMaSafetyDoor door1 = new HeiMaSafetyDoor();
        System.out.println(door1.getClass().getName());
        door1.waterProof();
        door1.fireProof();
        door1.antiTheft();

        System.out.println("---------------------------");
        ITDoor door2 = new ITDoor();
        door2.fireProof();
        door2.waterProof();
    }
}
