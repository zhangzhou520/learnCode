package com.on.java.basic.ch6;

/**
 * @className: ExplicitStatic
 * @author: zhangzhou
 * @date: 2026/9/30 下午5:55
 * @description:
 */
public class ExplicitStatic {

    static Cups cups1 = new Cups();
    static Cups cups2 = new Cups();

    public static void main(String[] args) {
        System.out.println("Inside main()");
        Cups.cup1.f(99);
    }
}

class Cup {

    Cup(int maker) {
        System.out.println("Cup(" + maker + ")");
    }

    void f(int maker) {
        System.out.println("f(" + maker + ")");
    }
}

class Cups {

    static Cup cup1;
    static Cup cup2;

    static {
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }

    Cups() {
        System.out.println("Cups()");
    }
}
