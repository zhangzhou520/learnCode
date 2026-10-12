package com.zz.book.beauty.ch1;

/**
 * @className: ThreadLocalTest2
 * @author: zhangzhou
 * @date: 2026/9/22 上午11:28
 * @description:
 */
public class ThreadLocalTest2 {

    public static InheritableThreadLocal<String> threadLocal = new InheritableThreadLocal<>();

    public static void main(String[] args) {
        threadLocal.set("hello world");
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread:" + threadLocal.get());
            }
        });
        thread.start();
        System.out.println("main:" + threadLocal.get());
    }
}
