package com.on.java.basic.ch11;

/**
 * @author zhangzhou
 * @date 2026/10/21 17:04
 **/
public class DotThis {

    void f() {
        System.out.println("DotThis.f()");
    }

    public class Inner {
        public DotThis outer() {
            //如果直接写this，引用的是Inner的"this"
            return DotThis.this;
        }
    }

    public Inner inner() {
        return new Inner();
    }

    public static void main(String[] args) {
        DotThis dt = new DotThis();
        DotThis.Inner dti = dt.inner();
        dti.outer().f();
    }
}
