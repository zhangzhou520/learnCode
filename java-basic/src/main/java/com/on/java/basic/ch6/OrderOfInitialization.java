package com.on.java.basic.ch6;

/**
 * @className: OrderOfInitialization
 * @author: zhangzhou
 * @date: 2026/9/30 下午4:43
 * @description: 初始化顺序
 */
public class OrderOfInitialization {

    public static void main(String[] args) {
        House h = new House();
        h.f();
        //output
//        Window(1)
//        Window(2)
//        Window(3)
//        House()
//        Window(33)
//        f()
    }
}

class Window {

    Window(int maker) {
        System.out.println("Window(" + maker +")");
    }
}

class House {

    Window w1 = new Window(1);
    House() {
        System.out.println("House()");
        w3 = new Window(33);
    }
    Window w2 = new Window(2);
    void f() {
        System.out.println("f()");
    }
    Window w3 = new Window(3);
}
