package com.on.java.basic.ch10.interfaces.filters;

/**
 * @author zhangzhou
 * @date 2026/10/20 14:02
 **/
public class Waveform {

    private static long counter;
    private final long id = counter++;

    @Override
    public String toString() {
        return "Waveform" + id;
    }
}
