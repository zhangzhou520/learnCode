package com.on.java.basic.ch10.interfaces;

import java.util.Arrays;

/**
 * @author zhangzhou
 * @date 2026/10/20 11:33
 **/
public class Applicator {

    public static void apply(Processor p, Object s) {
        System.out.println("Using Processor" + p.name());
        System.out.println(p.process(s));
    }

    public static void main(String[] args) {
        String s = "We are such stuff as dreams are made on";
        apply(new Upcase(), s);
        apply(new Downcase(), s);
        apply(new Splitter(), s);
    }
}

class Processor {

    public String name() {
        return getClass().getSimpleName();
    }

    public Object process(Object input) {
        return input;
    }
}

class Upcase extends Processor {

    //协变返回
    @Override
    public Object process(Object input) {
        return ((String) input).toUpperCase();
    }
}

class Downcase extends Processor {

    //协变返回
    @Override
    public Object process(Object input) {
        return ((String) input).toLowerCase();
    }
}

class Splitter extends Processor {

    //协变返回
    @Override
    public Object process(Object input) {
        return Arrays.toString(((String) input).split(" "));
    }
}
