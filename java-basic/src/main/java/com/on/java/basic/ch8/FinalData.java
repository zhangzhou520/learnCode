package com.on.java.basic.ch8;

import java.util.Random;

/**
 * @author zhangzhou
 * @date 2026/10/16 11:17
 **/
public class FinalData {

    private static Random rand = new Random(47);
    private String id;

    public FinalData(String id) {
        this.id = id;
    }

    //可以是编译时常量
    private final int valueOne = 0;
    private static final int VALUE_TWO = 99;
    //类型的公共变量
    public static final int VALUE_THRER = 39;
    //这些不能作为编译时常量
    private final int i4 = rand.nextInt(20);
    static final int INT_5 = rand.nextInt(20);
    private Value v1 = new Value(11);
    private final Value v2 = new Value(22);
    private static final Value VAL_3 = new Value(33);
    //数组
    private final int[] a = {1, 2, 3, 4, 5, 6};

    @Override
    public String toString() {
        return id + ": " + "i4 = " + i4 + ", INT_5 = " + INT_5;
    }

    public static void main(String[] args) {
        FinalData fd1 = new FinalData("fd1");
        //错误：值无法修改
        //fd1.valueOne++;
        //对象非恒定不变
        fd1.v2.i++;
        //正常，非final
        fd1.v1 = new Value(9);
        for (int i = 0; i < fd1.a.length; i++) {
            //对象非恒定不变
            fd1.a[i]++;
        }
        //错误
        //fd1.v2 = new Value(0);
        //引用不能修改
        //fd1.VAL_3 = new Value(1);
        //fd1.a = new int[3];
        System.out.println(fd1);
        System.out.println("Creating new FinalData");
        FinalData fd2 = new FinalData("fd2");
        System.out.println(fd1);
        System.out.println(fd2);
    }
}

class Value {

    //包访问权限
    int i;

    Value(int i) {
        this.i = i;
    }
}
