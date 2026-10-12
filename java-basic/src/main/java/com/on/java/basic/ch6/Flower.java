package com.on.java.basic.ch6;

/**
 * @className: Flower
 * @author: zhangzhou
 * @date: 2026/9/30 下午2:22
 * @description: 使用this调用构造器
 */
public class Flower {

    int petalCount = 0;
    String s = "initial value";

    Flower(int petals) {
        petalCount = petals;
        System.out.println("Constructor w/ int arg only, petalCount = " + petalCount);
    }

    Flower(String ss) {
        System.out.println("Constructor w/ String arg only, s = " + ss);
    }

    Flower(String s, int petals) {
        this(petals);
        //this的另一种用法
        this.s = s;
        System.out.println("String & int args");
    }

    Flower() {
        this("hi", 47);
        System.out.println("Zero-argument constructor");
    }

    void printPetalCount() {
        //不可用在非构造器中
        //this(11);
        System.out.println("petalCount = " + petalCount + " s = " + s);
    }

    public static void main(String[] args) {
        Flower x = new Flower();
        x.printPetalCount();
    }
}
