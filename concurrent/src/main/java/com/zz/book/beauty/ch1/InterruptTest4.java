package com.zz.book.beauty.ch1;

/**
 * @className: InterruptTest4
 * @author: zhangzhou
 * @date: 2026/9/21 上午11:43
 * @description:
 */
public class InterruptTest4 {

    public static void main(String[] args) throws InterruptedException {
        Thread threadOne = new Thread(new Runnable() {
            @Override
            public void run() {
                //中断标志为true时会退出循环，并且清除中断标志
                while (!Thread.currentThread().interrupted()) {

                }
                System.out.println("threadOne isInterrupted:" + Thread.currentThread().isInterrupted());
            }
        });

        //启动线程
        threadOne.start();
        //设置中断标志
        threadOne.interrupt();

        threadOne.join();
        System.out.println("main is over");
    }
}
