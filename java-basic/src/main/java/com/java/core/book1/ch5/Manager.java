package com.java.core.book1.ch5;

/**
 * @author zhangzhou
 * @date 2026/10/24 11:09
 **/
public class Manager extends Employee {

    private double bonus;

    public Manager(String n, double s, int year, int month, int day) {
        super(n, s, year, month, day);
        bonus = 0;
    }

    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary += bonus;
    }

    public void setBonus(double b) {
        bonus = b;
    }
}
