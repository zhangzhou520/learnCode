package com.on.java.basic.ch10.interfaces.filters;

/**
 * @author zhangzhou
 * @date 2026/10/20 14:09
 **/
public class LowPass extends Filter {

    double cutoff;

    public LowPass(double cutoff) {
        this.cutoff = cutoff;
    }

    @Override
    public Waveform process(Waveform input) {
        //哑处理
        return input;
    }
}
