package com.on.java.basic.ch10.interfaces.filters.interfaceprocessor;

import com.on.java.basic.ch10.interfaces.filters.*;

/**
 * @author zhangzhou
 * @date 2026/10/20 14:34
 **/
public class FilterProcessor {

    public static void main(String[] args) {
        Waveform w = new Waveform();
        Applicator.apply(new FilterAdapter(new LowPass(1.0)), w);
        Applicator.apply(new FilterAdapter(new HighPass(2.0)), w);
        Applicator.apply(new FilterAdapter(new BandPass(3.0, 4.0)), w);
    }
}

class FilterAdapter implements Processor {

    Filter filter;

    FilterAdapter(Filter filter) {
        this.filter = filter;
    }

    @Override
    public Object process(Object input) {
        return filter.process((Waveform) input);
    }
}
