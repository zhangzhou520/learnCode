package com.zz.book.beauty.ch1;

/**
 * @className: SleepTest2
 * @author: zhangzhou
 * @date: 2026/9/20 下午7:30
 * @description:
 */
public class SleepTest2 {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("child thread is in sleep");
                    Thread.sleep(10000);
                    System.out.println("child thread is in awaked");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        //启动线程
        thread.start();
        //主线程休眠2s
        Thread.sleep(2000);
        //主线程中断子线程
        thread.interrupt();
    }
}
