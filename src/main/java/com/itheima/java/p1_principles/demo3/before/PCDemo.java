package com.itheima.java.p1_principles.demo3.before;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月03日 16:17
 */
public class PCDemo {
    public static void main(String[] args) {
        IntelCPU cpu = new IntelCPU();
        KingstonMemory memory = new KingstonMemory();
        XiJieDisk disk = new XiJieDisk();
        PC pc = new PC();
        pc.setCpu(cpu);
        pc.setMemory(memory);
        pc.setDisk(disk);

        pc.run();
    }
}
