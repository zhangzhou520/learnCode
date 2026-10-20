package com.on.java.basic.ch10.interfaces.filters.interfaceprocessor;

/**
 * @author zhangzhou
 * @date 2026/10/20 14:17
 **/
public class Applicator {

    public static void apply(Processor p, Object s) {
        System.out.println("Using Processor " + p.name());
        System.out.println(p.process(s));
    }
}
