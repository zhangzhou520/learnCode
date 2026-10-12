package com.on.java.basic.ch6;

/**
 * @className: SimpleEnumUse
 * @author: zhangzhou
 * @date: 2026/10/8 下午5:33
 * @description:
 */
public class SimpleEnumUse {

    public static void main(String[] args) {
        Spiciness howHot = Spiciness.MEDIUM;
        System.out.println(howHot);

        for (Spiciness s : Spiciness.values()) {
            System.out.println(s + ", ordinal " + s.ordinal());
        }
    }
}
