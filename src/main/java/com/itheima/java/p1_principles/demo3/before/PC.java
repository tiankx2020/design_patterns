package com.itheima.java.p1_principles.demo3.before;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月03日 16:16
 */
public class PC {
    private IntelCPU cpu;
    private KingstonMemory memory;
    private XiJieDisk disk;

    public IntelCPU getCpu() {
        return cpu;
    }

    public void setCpu(IntelCPU cpu) {
        this.cpu = cpu;
    }

    public KingstonMemory getMemory() {
        return memory;
    }

    public void setMemory(KingstonMemory memory) {
        this.memory = memory;
    }

    public XiJieDisk getDisk() {
        return disk;
    }

    public void setDisk(XiJieDisk disk) {
        this.disk = disk;
    }

    public void run(){
        System.out.println("pc运行");
        System.out.println(disk.get());
        memory.read();
        cpu.run();
    }
}
