package com.zz.book.beauty.ch1;

/**
 * @className: ThreadTest
 * @author: zhangzhou
 * @date: 2026/9/20 上午11:04
 * @description:
 */
public class ThreadTest {

    /**
     * @description 继承Thread类并重写run方法
     * @author zhangzhou
     * @date 2026/9/20 上午11:06
     * @param
     */
    public static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("I am a child thread");
        }
    }

    public static void main(String[] args) {
        //创建线程
        MyThread thread = new MyThread();
        //启动线程
        thread.start();
    }
}
