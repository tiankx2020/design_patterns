package com.itheima.java.p4havior_patterns.observer;

public interface Subject {
    public void attach(Observer observer);
    public void detach(Observer observer);
    public void ntyAll(String msg);
}
