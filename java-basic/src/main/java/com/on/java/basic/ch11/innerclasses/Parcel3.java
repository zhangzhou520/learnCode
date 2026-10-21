package com.on.java.basic.ch11.innerclasses;

/**
 * @author zhangzhou
 * @date 2026/10/21 16:18
 **/
public class Parcel3 {

    class Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }

    class Destination {
        private String label;

        Destination(String whereTo) {
            label = whereTo;
        }

        String readLable() {
            return label;
        }
    }

    public static void main(String[] args) {
        Parcel3 p = new Parcel3();
        //必须是外部类的实例来创建内部类的实例
        Parcel3.Contents c = p.new Contents();
        Parcel3.Destination d = p.new Destination("Tasmania");
    }
}
