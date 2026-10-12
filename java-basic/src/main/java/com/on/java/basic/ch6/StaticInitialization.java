package com.on.java.basic.ch6;

/**
 * @className: StaticInitialization
 * @author: zhangzhou
 * @date: 2026/9/30 下午4:57
 * @description:
 */
public class StaticInitialization {

    static Table table = new Table();
    static Cupboard cupboard = new Cupboard();

    public static void main(String[] args) {
        System.out.println("main creating new Cupboard");
        new Cupboard();
        System.out.println("main creating new Cupboard");
        new Cupboard();
        table.f2(1);
        cupboard.f3(1);
    }
}

class Bowl {

    Bowl(int maker) {
        System.out.println("Bowl(" + maker + ")");
    }

    void f1(int maker) {
        System.out.println("f1(" + maker + ")");
    }
}

class Table {

    static Bowl bowl = new Bowl(1);
    Table() {
        System.out.println("Table()");
        bow2.f1(1);
    }
    void f2(int maker) {
        System.out.println("f2(" + maker + ")");
    }
    static Bowl bow2 = new Bowl(2);
}

class Cupboard {

    Bowl bowl3 = new Bowl(3);
    static Bowl bowl4 = new Bowl(4);
    Cupboard() {
        System.out.println("Cupboard()");
        bowl4.f1(2);
    }
    void f3(int maker) {
        System.out.println("f3(" + maker + ")");
    }
    static Bowl bowl5 = new Bowl(5);
}

//output
//        Bowl(1)
//        Bowl(2)
//        Table()
//        f1(1)
//        Bowl(4)
//        Bowl(5)
//        Bowl(3)
//        Cupboard()
//        f1(2)
//        main creating new Cupboard
//        Bowl(3)
//        Cupboard()
//        f1(2)
//        main creating new Cupboard
//        Bowl(3)
//        Cupboard()
//        f1(2)
//        f2(1)
//        f3(1)