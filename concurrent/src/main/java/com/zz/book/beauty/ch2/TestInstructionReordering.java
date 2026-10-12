package com.zz.book.beauty.ch2;

/**
 * @className: ReadThread
 * @author: zhangzhou
 * @date: 2026/9/29 下午5:51
 * @description:
 */
public class TestInstructionReordering {

    private static int num = 0;
    private static boolean ready = false;

    public static class ReadThread extends Thread {
        @Override
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                if (ready) {
                    System.out.println(num + num);
                }
                System.out.println("read thread....");
            }
        }
    }

    public static class WriteThread extends Thread {
        @Override
        public void run() {
            num = 2;
            ready = true;
            System.out.println("writeThread set over....");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ReadThread rt = new ReadThread();
        rt.start();
        WriteThread wt = new WriteThread();
        wt.start();
        Thread.sleep(10);
        rt.interrupt();
        System.out.println("main exit");
    }
}
