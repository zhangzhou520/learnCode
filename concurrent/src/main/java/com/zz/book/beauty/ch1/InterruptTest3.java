package com.zz.book.beauty.ch1;

/**
 * @className: InterruptTest3
 * @author: zhangzhou
 * @date: 2026/9/21 上午11:35
 * @description:
 */
public class InterruptTest3 {

    public static void main(String[] args) throws InterruptedException {
        Thread threadOne = new Thread(new Runnable() {
            @Override
            public void run() {
                for (;;) {

                }
            }
        });

        //启动线程
        threadOne.start();
        //设置中断标志
        threadOne.interrupt();
        //获取中断标志
        System.out.println("isInterrupted:" + threadOne.isInterrupted()); //true
        //获取中断标志并重置
        System.out.println("isInterrupted:" + threadOne.interrupted()); //false
        //获取中断标志并重置
        System.out.println("isInterrupted:" + Thread.interrupted()); //false
        //获取中断标志
        System.out.println("isInterrupted:" + threadOne.isInterrupted()); //true

        threadOne.join();
        System.out.println("main thread is over");
    }
}
