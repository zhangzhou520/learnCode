package com.on.java.basic.ch8;

/**
 * @className: Detergent
 * @author: zhangzhou
 * @date: 2026/10/12 下午3:10
 * @description:
 */
public class Detergent extends Cleanser {

    //重写方法
    @Override
    public void scrub() {
        append("Detergent.scrub()");
        super.scrub();
    }

    public void foam() {
        System.out.println("foam()");
    }

    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.println("Testing base class:");
        Cleanser.main(args);
    }
}

class Cleanser {

    private String s = "Cleanser";

    public void append(String a) {
        s += a;
    }

    public void dilute() {
        System.out.println("dilute()");
    }

    public void apply() {
        System.out.println("apply()");
    }

    public void scrub() {
        System.out.println("scrub()");
    }

    @Override
    public String toString() {
        return s;
    }

    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute();
        x.apply();
        x.scrub();
        System.out.println(x);
    }
}
