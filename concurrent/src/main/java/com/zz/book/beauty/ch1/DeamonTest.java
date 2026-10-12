package com.zz.book.beauty.ch1;

/**
 * @className: DeamonTest
 * @author: zhangzhou
 * @date: 2026/9/21 下午5:44
 * @description:
 */
public class DeamonTest {

    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (;;) {}
            }
        });
        //设置为守护线程
        thread.setDaemon(true);
        thread.start();
        System.out.println("main thread is over");
    }
}
