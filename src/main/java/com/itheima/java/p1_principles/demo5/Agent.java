package com.itheima.java.p1_principles.demo5;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月03日 17:03
 */
public class Agent {
    private Star star;
    private Fans fans;
    private Company company;

    public void meetFans(){
        System.out.println(star.getName()+"见粉丝"+fans.getName());
    }

    public void sign(){
        System.out.println(star.getName()+"与公司"+company.getName()+"签合约");
    }

    public Star getStar() {
        return star;
    }

    public void setStar(Star star) {
        this.star = star;
    }

    public Fans getFans() {
        return fans;
    }

    public void setFans(Fans fans) {
        this.fans = fans;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
