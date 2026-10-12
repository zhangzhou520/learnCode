package com.zz.book.beauty.ch1;

/**
 * @className: InterruptTest1
 * @author: zhangzhou
 * @date: 2026/9/21 上午11:25
 * @description:
 */
public class InterruptTest2 {

    public static void main(String[] args) throws InterruptedException {
        Thread threadOne = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("threadOne begin sleep for 2000 seconds");
                    Thread.sleep(2000000);
                    System.out.println("threadOne awaking");
                } catch (InterruptedException e) {
                    System.out.println("threadOne is interrupted while sleeping");
                }
                System.out.println("threadOne leaving normally");
            }
        });

        //启动子线程
        threadOne.start();

        //主线程休眠1s，以便中断前让子线程输出
        Thread.sleep(1000);

        //中断子线程
        System.out.println("main thread interrupt thread");
        threadOne.interrupt();

        //等待子线程执行完毕
        threadOne.join();
        System.out.println("main is over");
    }
}
