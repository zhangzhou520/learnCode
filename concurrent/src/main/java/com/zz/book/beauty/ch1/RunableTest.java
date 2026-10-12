package com.zz.book.beauty.ch1;

/**
 * @className: RunableTest
 * @author: zhangzhou
 * @date: 2026/9/20 上午11:16
 * @description:
 */
public class RunableTest {

    public static class RunableTask implements Runnable {

        @Override
        public void run() {
            System.out.println("I am a child thread");
        }
    }

    public static void main(String[] args) {
        RunableTask task = new RunableTask();
        new Thread(task).start();
        new Thread(task).start();
    }
}
