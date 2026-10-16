package com.on.java.basic.ch9;

/**
 * @author zhangzhou
 * @date 2026/10/16 16:06
 **/
public class FieldAccess {

    public static void main(String[] args) {
        //向上转型
        Super sup = new Sub();
        System.out.println("sup.field = " + sup.field + ", sup.getField() = " + sup.getField());
        Sub sub = new Sub();
        System.out.println("sub.field = " + sub.field + ", sub.getField() = " + sub.getField() + ", sub.getSuperField() = " + sub.getSuperField());
    }
}

class Super {

    public int field = 0;

    public int getField() {
        return field;
    }
}

class Sub extends Super {

    public int field = 1;

    @Override
    public int getField() {
        return field;
    }

    public int getSuperField() {
        return super.field;
    }
}
