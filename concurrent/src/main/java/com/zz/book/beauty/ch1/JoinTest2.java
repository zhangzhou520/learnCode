package com.zz.book.beauty.ch1;

/**
 * @className: JoinTest2
 * @author: zhangzhou
 * @date: 2026/9/20 下午7:08
 * @description:
 */
public class JoinTest2 {

    public static void main(String[] args) throws InterruptedException {
        Thread threadOne = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("threadOne begin run!");
                for (;;) {
                }
            }
        });

        //获取主线程
        final Thread mainThread = Thread.currentThread();

        Thread threadTwo = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //中断主线程
                mainThread.interrupt();
            }
        });

        //启动子线程
        threadOne.start();
        threadTwo.start();

        try {
            //等待线程one结束
            threadOne.join();
        } catch (InterruptedException e) {
            System.out.println("main thread:" + e);
        }
    }
}
