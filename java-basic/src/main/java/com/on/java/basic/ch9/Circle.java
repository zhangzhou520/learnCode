package com.on.java.basic.ch9;

/**
 * @author zhangzhou
 * @date 2026/10/16 14:19
 **/
public class Circle extends Shape {

    @Override
    public void draw() {
        System.out.println("Circle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Circle.erase()");
    }
}
