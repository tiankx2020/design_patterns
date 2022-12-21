package com.itheima.java.p1_principles.demo3.after;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月03日 16:22
 */
public class PC {
    private Disk disk;
    private Memory memory;
    private CPU cpu;

    public Disk getDisk() {
        return disk;
    }

    public void setDisk(Disk disk) {
        this.disk = disk;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }


    public void run() {
        System.out.println("pc运行");
        System.out.println(disk.get());
        memory.read();
        cpu.run();
    }

}
