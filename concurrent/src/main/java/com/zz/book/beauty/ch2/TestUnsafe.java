package com.zz.book.beauty.ch2;

import sun.misc.Unsafe;

/**
 * @className: TestUnsafe
 * @author: zhangzhou
 * @date: 2026/9/29 下午5:31
 * @description:
 */
public class TestUnsafe {

    //获取Unsafe的实例
    static final Unsafe unsafe = Unsafe.getUnsafe();
    //记录变量state在类TestUnsafe中的偏移值
    static long stateOffset;
    //变量
    private volatile long state = 0;

    static {
        try {
            //获取state变量在类TestUnsafe中的偏移值
            stateOffset = unsafe.objectFieldOffset(TestUnsafe.class.getDeclaredField("state"));
        } catch (Exception ex) {
            System.out.println(ex.getLocalizedMessage());
        }
    }

    public static void main(String[] args) {
        //创建实例并且设置state值为1
        TestUnsafe test = new TestUnsafe();
        Boolean success = unsafe.compareAndSwapInt(test, stateOffset, 0, 1);
        System.out.println(success);
    }
}
