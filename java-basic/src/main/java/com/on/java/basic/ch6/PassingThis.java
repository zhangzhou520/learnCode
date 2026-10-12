package com.on.java.basic.ch6;

/**
 * @className: Passing
 * @author: zhangzhou
 * @date: 2026/9/30 下午2:10
 * @description:
 */
public class PassingThis {

    public static void main(String[] args) {
        new Person().eat(new Apple());
    }
}

class Person {

    public void eat(Apple apple) {
        Apple peeled = apple.getPeeled();
        System.out.println("Yummy");
    }
}

class Peerler {

    static Apple peel(Apple apple) {
        return apple;
    }
}

class Apple {

    Apple getPeeled() {
        return Peerler.peel(this);
    }
}
