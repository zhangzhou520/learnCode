package com.on.java.basic.ch5;

/**
 * @className: CommaOperator
 * @author: zhangzhou
 * @date: 2026/9/29 下午2:18
 * @description:
 */
public class CommaOperator {

    public static void main(String[] args) {
        for (int i = 0, j = i + 10; i < 5; i++, j = i * 2) {
            System.out.println("i = " + i + " j = " + j);
        }
    }
}
