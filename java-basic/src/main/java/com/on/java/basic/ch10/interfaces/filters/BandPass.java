package com.on.java.basic.ch10.interfaces.filters;

/**
 * @author zhangzhou
 * @date 2026/10/20 14:09
 **/
public class BandPass extends Filter {

    double lowCutoff, highCutoff;

    public BandPass(double lowCut, double highCut) {
        this.lowCutoff = lowCut;
        this.highCutoff = highCut;
    }

    @Override
    public Waveform process(Waveform input) {
        //哑处理
        return input;
    }
}
