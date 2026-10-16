package com.on.java.basic.ch8;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * @author: zhangzhou
 * @date: 2026/10/15 下午2:41
 */
public class CADSystem extends Shape {

    private Circle c;
    private Triangle t;
    private Line[] lines = new Line[3];

    public CADSystem(int i) {
        super(i + 1);
        for (int j = 0; j < lines.length; j++) {
            lines[j] = new Line(j, j * i);
        }
        c = new Circle(1);
        t = new Triangle(1);
        System.out.println("Combnined Constructor");
    }

    @Override
    void dispose() {
        System.out.println("CADSystem dispose()");
        //清理顺序与初始化顺序相反
        t.dispose();
        c.dispose();
        for (int i = lines.length - 1; i >= 0; i--) {
            lines[i].dispose();
        }
        super.dispose();
    }

    public static void main(String[] args) {
        CADSystem x = new CADSystem(47);
        try {

        } finally {
            x.dispose();
        }
    }
}

class Shape {

    Shape(int i) {
        System.out.println("Shape constructor");
    }

    void dispose() {
        System.out.println("shape dispose");
    }
}

class Circle extends Shape {

    Circle(int i) {
        super(i);
        System.out.println("Drawing Circle");
    }

    @Override
    void dispose() {
        System.out.println("Erasing Circle");
        super.dispose();
    }
}

class Triangle extends Shape {

    Triangle(int i) {
        super(i);
        System.out.println("Drawing Triangle");
    }

    @Override
    void dispose() {
        System.out.println("Erasing Triangle");
        super.dispose();
    }
}

class Line extends Shape {

    private int start, end;

    Line(int start, int end) {
        super(start);
        this.start = start;
        this.end = end;
        System.out.println("Drawing Line:" + start + ", " + end);
    }

    @Override
    void dispose() {
        System.out.println("Erasing Line:" + start + ", " + end);
        super.dispose();
    }
}