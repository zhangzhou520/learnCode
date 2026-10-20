package com.on.java.basic.ch10.interfaces.filters.interfaceprocessor;

import java.util.Arrays;

/**
 * @author zhangzhou
 * @date 2026/10/20 14:19
 **/
interface StringProcessor extends Processor {

    @Override
    String process(Object input);

    //字段自动式static和final，因为在接口内定义
    String S = "If she weighs the same as a duck, " + "she's made of wood";

    //可以在接口中定义main方法
    static void main(String[] args) {
        Applicator.apply(new Upcase(), S);
        Applicator.apply(new Lowecase(), S);
        Applicator.apply(new Splitter(), S);
    }
}

class Upcase implements StringProcessor {

    //协变返回
    @Override
    public String process(Object input) {
        return ((String) input).toUpperCase();
    }
}

class Lowecase implements StringProcessor {

    //协变返回
    @Override
    public String process(Object input) {
        return ((String) input).toLowerCase();
    }
}

class Splitter implements StringProcessor {

    //协变返回
    @Override
    public String process(Object input) {
        return Arrays.toString(((String) input).split(" "));
    }
}
