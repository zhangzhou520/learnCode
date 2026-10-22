package com.on.java.basic.ch11;

/**
 * @author zhangzhou
 * @date 2026/10/22 09:53
 **/
public class Parcel8 {

    public Wrapping wrapping(int x) {
        return new Wrapping(x) {
            @Override
            public int value() {
                return super.value() * 47;
            }
        };
    }

    public static void main(String[] args) {
        Parcel8 p = new Parcel8();
        Wrapping wrapping = p.wrapping(1);
    }
}
