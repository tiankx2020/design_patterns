package com.itheima.java.p1_principles.demo5;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月03日 17:05
 */
public class DimitDemo {
    /**
     * 迪米特法则：如果两个实体无需直接通信，那么就可以不用相互调用，可以通过第三方进行调用，
     * 减少两者的耦合。
     */
    public static void main(String[] args) {
        Star star = new Star("王冰冰");
        Fans fans = new Fans("田开心");
        Company company = new Company("央视");
        Agent agent = new Agent();
        agent.setCompany(company);
        agent.setFans(fans);
        agent.setStar(star);

        agent.meetFans();
        agent.sign();
    }
}
