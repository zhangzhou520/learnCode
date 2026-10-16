package com.on.java.basic.ch9;

import java.util.Random;

/**
 * @author zhangzhou
 * @date 2026/10/16 14:20
 **/
public class RandomShapes {

    private Random random = new Random(47);

    public Shape get() {
        switch (random.nextInt(3)) {
            default:
            case 0:
                return new Circle();
            case 1:
                return new Square();
            case 2:
                return new Triangle();
        }
    }

    public Shape[] array(int sz) {
        Shape[] shapes = new Shape[sz];
        //用各种形状填满数组
        for (int i = 0; i < shapes.length; i++) {
            shapes[i] = get();
        }
        return shapes;
    }
}
