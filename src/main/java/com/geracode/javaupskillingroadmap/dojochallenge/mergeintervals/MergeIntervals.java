package com.geracode.javaupskillingroadmap.dojochallenge.mergeintervals;

import com.geracode.javaupskillingroadmap.dojochallenge.Utils.CodeException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class MergeIntervals {
    public static List<Interval> mergeIntervals(List<Interval> intervals) {
        if(Objects.isNull(intervals) || intervals.isEmpty()) {
            throw new CodeException("The array is null or empty");
        }
        intervals.sort(Comparator.comparingInt(value -> value.start));
        List<Interval> resultIntervalList = new ArrayList<>();
        Interval current = intervals.get(0);
        for (Interval interval : intervals) {
            if (interval.start <= current.end) {
                current.end = Math.max(current.end, interval.end);
            } else {
                resultIntervalList.add(current);
                current = interval;
            }
        }
        resultIntervalList.add(current);
        return resultIntervalList;
    }
}

