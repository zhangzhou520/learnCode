package com.on.java.basic.ch11.innerclasses;

/**
 * @author zhangzhou
 * @date 2026/10/21 16:18
 **/
public class Parcel5 {

    public Destination destination(String s) {

        final class PDestination implements Destination {

            private String label;

            private PDestination(String whereTo) {
                label = whereTo;
            }

            @Override
            public String readLabel() {
                return label;
            }
        }
        return new PDestination(s);
    }

    public static void main(String[] args) {
        Parcel5 p = new Parcel5();
        Destination d = p.destination("Tasmania");
    }
}
