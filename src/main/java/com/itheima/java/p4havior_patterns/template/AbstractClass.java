package com.itheima.java.p4havior_patterns.template;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月07日 15:51
 */
public  abstract class AbstractClass {
    public final void process(){
        step1();
        step2();
        step3();
        step4();
    }
    public void step1(){
        System.out.println("取票");
    }
    public  void step2(){
        System.out.println("排队");
    }
    public abstract void step3();

    public void step4(){
        System.out.println("对工作人员进行评分");
    }
}
