package com.on.java.basic.ch11;

/**
 * @author zhangzhou
 * @date 2026/10/22 09:53
 **/
public class Parcel7b {

    class MyContents implements Contents {

        private int i = 11;

        @Override
        public int value() {
            return i;
        }
    }

    public Contents contents() {
        return new MyContents();
    }

    public static void main(String[] args) {
        Parcel7b p = new Parcel7b();
        Contents c = p.contents();
    }
}
