package com.on.java.basic.ch10.interfaces.filters.interfaceprocessor;

public interface Processor {

    default String name() {
        return getClass().getSimpleName();
    }

    Object process(Object input);
}
