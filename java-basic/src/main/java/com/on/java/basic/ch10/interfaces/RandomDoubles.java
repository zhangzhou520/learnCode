package com.on.java.basic.ch10.interfaces;

import java.util.Random;

/**
 * @author zhangzhou
 * @date 2026/10/20 17:36
 **/
public interface RandomDoubles {

    Random RAND = new Random(47);

    default double next() {
        return RAND.nextDouble();
    }

    static void main(String[] args) {
        RandomDoubles rd = new RandomDoubles() {};
        for (int i = 0; i < 7; i++) {
            System.out.print(rd.next() + " ");
        }
    }
}
