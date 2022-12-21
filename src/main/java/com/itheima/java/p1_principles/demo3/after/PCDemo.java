package com.itheima.java.p1_principles.demo3.after;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月03日 16:23
 */
public class PCDemo {
    public static void main(String[] args) {
        CPU cpu = new AMDCPU();
        Memory memory= new KingstonMemory();
        Disk disk = new XiJieDisk();
        PC pc = new PC();
        pc.setCpu(cpu);
        pc.setDisk(disk);
        pc.setMemory(memory);
        pc.run();
    }
}
