package com.on.java.basic.ch4;

/**
 * @className: Equivalence
 * @author: zhangzhou
 * @date: 2026/9/25 下午3:44
 * @description:
 */
public class DoubleEquivalence {

    static void show(String desc, Double n1, Double n2) {
        System.out.println(desc + ":");
        System.out.printf("%e==%e %b %b%n", n1, n2, n1 == n2, n1.equals(n2));
    }

    @SuppressWarnings("deprecation")
    public static void test(double x1, double x2) {
        System.out.printf("%e==%e %b%n", x1, x2, x1 == x2);
        Double d1 = x1;
        Double d2 = x2;
        show("Autommatic", d1, d2);
        Double r1 = new Double(x1);
        Double r2 = new Double(x2);
        show("new Double()", r1, r2);
        Double v1 = Double.valueOf(x1);
        Double v2 = Double.valueOf(x2);
        show("Double.valueOf()", v1, v2);
    }

    public static void main(String[] args) {
        test(0, Double.MIN_VALUE);
        System.out.println("-------------------");
        test(Double.MAX_VALUE, Double.MAX_VALUE - Double.MIN_VALUE * 1000000);
    }
}
