package com.on.java.basic.ch10.interfaces.filters;

/**
 * @author zhangzhou
 * @date 2026/10/20 14:03
 **/
public class Filter {

    public String name() {
        return getClass().getSimpleName();
    }

    public Waveform process(Waveform input) {
        return input;
    }
}
