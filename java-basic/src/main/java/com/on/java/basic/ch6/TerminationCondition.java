package com.on.java.basic.ch6;

/**
 * @className: Book
 * @author: zhangzhou
 * @date: 2026/9/30 下午3:44
 * @description:
 */
public class TerminationCondition {

    public static void main(String[] args) {
        Book novel = new Book(true);
        //正确清理
        novel.checkIn();
        //没有清理就丢掉了该对象的引用
        new Book(true);
        System.gc();
    }
}

class Book {
    boolean checkOut = false;

    Book(boolean checkOut) {
        checkOut = checkOut;
    }

    void checkIn() {
        checkOut = false;
    }

    @SuppressWarnings("deprecation")
    @Override
    public void finalize() throws Throwable {
        if (checkOut) {
            System.out.println("Error: checked out");
        }
        super.finalize();
    }
}
