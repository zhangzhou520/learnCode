package com.on.java.basic.ch4;

/**
 * @className: Literals
 * @author: zhangzhou
 * @date: 2026/9/28 上午11:49
 * @description:
 */
public class Literals {

    public static void main(String[] args) {
        //十六进制(小写)
        int i1 = 0x2f;
        System.out.println("i1:" + Integer.toBinaryString(i1));
        //十六进制(大写)
        int i2 = 0X2F;
        System.out.println("i2:" + Integer.toBinaryString(i2));
        //八进制(前置0)
        int i3 = 0177;
        System.out.println("i3:" + Integer.toBinaryString(i3));
        //char类型的最大十六进制值
        char c = 0xffff;
        System.out.println("c:" + Integer.toBinaryString(c));
        //byte类型的最大十六进制值
        byte b = 0x7f;
        System.out.println("b:" + Integer.toBinaryString(b));
        //short类型的最大十六进制值
        short s = 0x7fff;
        System.out.println("s:" + Integer.toBinaryString(s));
        //long类型后缀
        long n1 = 200L;
        long n2 = 200l;
        long n3 = 200;
    }
}
