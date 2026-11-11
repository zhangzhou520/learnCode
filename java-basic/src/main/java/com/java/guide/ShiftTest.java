package com.java.guide;

/**
 * @author zhangzhou
 * @date 2026/11/11 17:52
 **/
public class ShiftTest {

    public static void main(String[] args) {
        int i = -1;
        System.out.println("初始数据：" + i);
        System.out.println("初始数据对应的二进制字符串：" + Integer.toBinaryString(i));
        i <<= 10;
        System.out.println("左移 10 位后的数据 " + i);
        System.out.println("左移 10 位后的数据对应的二进制字符 " + Integer.toBinaryString(i));

        int j = -1;
        System.out.println("初始数据：" + j);
        System.out.println("初始数据对应的二进制字符串：" + Integer.toBinaryString(j));
        j <<= 42;
        System.out.println("左移 10 位后的数据 " + j);
        System.out.println("左移 10 位后的数据对应的二进制字符 " + Integer.toBinaryString(j));
    }
}
