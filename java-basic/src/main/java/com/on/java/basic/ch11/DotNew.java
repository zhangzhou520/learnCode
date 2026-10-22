package com.on.java.basic.ch11;

/**
 * @author zhangzhou
 * @date 2026/10/21 17:50
 **/
public class DotNew {

    public class Inner {

    }

    public static void main(String[] args) {
        DotNew dn = new DotNew();
        DotNew.Inner dni = dn.new Inner();
    }
}
