package com.geracode.javaupskillingroadmap.dojochallenge.mergeintervals;

import lombok.Data;

@Data
public class Interval {
    int start;
    int end;

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}
