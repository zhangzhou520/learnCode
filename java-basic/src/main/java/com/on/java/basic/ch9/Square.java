package com.on.java.basic.ch9;

/**
 * @author zhangzhou
 * @date 2026/10/16 14:19
 **/
public class Square extends Shape {

    @Override
    public void draw() {
        System.out.println("Square.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Square.erase()");
    }
}
