package com.zz.book.beauty.ch1;

/**
 * @className: ThreadLocalTest1
 * @author: zhangzhou
 * @date: 2026/9/22 上午11:00
 * @description:
 */
public class ThreadLocalTest1 {

    //创建ThreadLocal变量
    static ThreadLocal<String> localVariable = new ThreadLocal<>();

    //print函数
    static void print(String str) {
        //打印当前线程本地内存中的localVariable变量的值
        System.out.println(str + ":" + localVariable.get());
        //清除当前线程本地内存中的localVariable的值
        localVariable.remove();
    }

    public static void main(String[] args) {
        Thread threadOne = new Thread(new Runnable() {
            @Override
            public void run() {
                localVariable.set("thradOne local variable");
                print("threadOne");
                System.out.println("threadOne remove after" + ":" + localVariable.get());
            }
        });
        Thread threadTwo = new Thread(new Runnable() {
            @Override
            public void run() {
                localVariable.set("threadTwo local variable");
                print("threadTwo");
                System.out.println("threadTwo remove after" + ":" + localVariable.get());
            }
        });
        threadOne.start();
        threadTwo.start();
    }
}
