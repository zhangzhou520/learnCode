package com.on.java.basic.ch8;

/**
 * @className: Bath
 * @author: zhangzhou
 * @date: 2026/10/12 下午2:56
 * @description:
 */
public class Bath {

    //定义时初始化
    private String s1 = "Happy", s2 = "Happy", s3, s4;
    private Soap castile;
    private int i;
    private float toy;

    //构造器初始化
    public Bath() {
        System.out.println("Inside Bath()");
        s3 = "Joy";
        toy = 3.14f;
        castile = new Soap();
    }

    //实例初始化
    {
        i = 47;
    }

    @Override
    public String toString() {
        //延迟初始化
        if (s4 == null) {
            s4 = "Joy";
        }
        return "Bath{" +
                "s1='" + s1 + '\'' +
                ", s2='" + s2 + '\'' +
                ", s3='" + s3 + '\'' +
                ", s4='" + s4 + '\'' +
                ", castile=" + castile +
                ", i=" + i +
                ", toy=" + toy +
                '}';
    }

    public static void main(String[] args) {
        Bath b = new Bath();
        System.out.println(b);
    }
}

class Soap {

    private String s;

    Soap() {
        System.out.println("Soap()");
    }

    @Override
    public String toString() {
        return s;
    }
}
