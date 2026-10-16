package com.on.java.basic.ch9;

/**
 * @author zhangzhou
 * @date 2026/10/16 14:25
 **/
public class Shapes {

    public static void main(String[] args) {
        RandomShapes gen = new RandomShapes();
        //执行多态方法调用
        for (Shape shape : gen.array(9)) {
            shape.draw();
        }
    }
}
