package com.zz.book.beauty.ch2;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * @className: TestUnsafe
 * @author: zhangzhou
 * @date: 2026/9/29 下午5:31
 * @description:
 */
public class TestUnsafe2 {

    //获取Unsafe的实例
    static final Unsafe unsafe;
    //记录变量state在类TestUnsafe中的偏移值
    static long stateOffset;
    //变量
    private volatile long state = 0;

    static {
        try {
            //使用反射获取Unsafe的成员变量theUnsafe
            Field field = Unsafe.class.getDeclaredField("theUnsafe");
            //设置为可存取
            field.setAccessible(true);
            //获取该变量的值
            unsafe = (Unsafe) field.get(null);
            //获取state变量在类TestUnsafe中的偏移值
            stateOffset = unsafe.objectFieldOffset(TestUnsafe2.class.getDeclaredField("state"));
        } catch (Exception ex) {
            System.out.println(ex.getLocalizedMessage());
            throw new Error(ex);
        }
    }

    public static void main(String[] args) {
        //创建实例并且设置state值为1
        TestUnsafe2 test = new TestUnsafe2();
        Boolean success = unsafe.compareAndSwapInt(test, stateOffset, 0, 1);
        System.out.println(success);
    }
}
