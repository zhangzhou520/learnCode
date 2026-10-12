package com.zz.book.beauty.ch1;

/**
 * @className: DeadLockTest
 * @author: zhangzhou
 * @date: 2026/9/21 下午5:32
 * @description:
 */
public class DeadLockTest {

    private static Object resourceA = new Object();
    private static Object resourceB = new Object();

    public static void main(String[] args) {
        //创建线程A
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (resourceA) {
                    System.out.println(Thread.currentThread() + " get resourceA");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread() + " waiting get resourceB");
                    synchronized (resourceB) {
                        System.out.println(Thread.currentThread() + " get resourceB");
                    }
                }
            }
        });
        //创建线程B
        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (resourceA) {
                    System.out.println(Thread.currentThread() + " get resourceB");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread() + " waiting get resourceA");
                    synchronized (resourceB) {
                        System.out.println(Thread.currentThread() + " get resourceA");
                    }
                }
            }
        });

        //启动线程
        threadA.start();
        threadB.start();
    }
}
