package com.on.java.basic.ch11;

/**
 * @author zhangzhou
 * @date 2026/10/22 09:53
 **/
public class Parcel9 {

    //要在匿名内部类中使用，参数必须是最终变量
    public Destination destination(final String dest) {
        return new Destination() {
            private String label = dest;

            @Override
            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel9 p = new Parcel9();
        Destination d = p.destination("Tasmania");
    }
}
