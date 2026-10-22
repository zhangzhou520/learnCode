package com.on.java.basic.ch11.innerclasses;

/**
 * @author zhangzhou
 * @date 2026/10/22 09:53
 **/
public class Parcel7 {

    public Contents contents() {
        return new Contents() {
            private int i = 11;

            @Override
            public int value() {
                return i;
            }
        };
    }

    public static void main(String[] args) {
        Parcel7 p = new Parcel7();
        Contents c = p.contents();
    }
}
