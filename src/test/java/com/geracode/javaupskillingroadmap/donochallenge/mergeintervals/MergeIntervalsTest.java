package com.geracode.javaupskillingroadmap.donochallenge.mergeintervals;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.geracode.javaupskillingroadmap.dojochallenge.mergeintervals.Interval;
import com.geracode.javaupskillingroadmap.dojochallenge.mergeintervals.MergeIntervals;
import com.geracode.javaupskillingroadmap.dojochallenge.Utils.CodeException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MergeIntervalsTest {

    private List<Interval> intervals1;
    private List<Interval> intervals2;
    private List<Interval> expectedIntervalList1;
    private List<Interval> expectedIntervalList2;

    @BeforeEach
    void setUp() {
        intervals1 = Arrays.asList(new Interval(1, 3), new Interval(2, 6), new Interval(8,10), new Interval(15, 18));
        intervals2 = Arrays.asList(new Interval(1, 3), new Interval(4, 10), new Interval(6, 12), new Interval(11, 18));
        expectedIntervalList1 = Arrays.asList(new Interval(1, 6),new Interval(8, 10), new Interval(15, 18));
        expectedIntervalList2 = Arrays.asList(new Interval(1, 3),new Interval(4, 18));
    }

    @Test
    void mergeIntervals_case1() {
        var actual = MergeIntervals.mergeIntervals(intervals1);
        assertEquals(expectedIntervalList1,actual);
    }


    @Test
    void mergeIntervals_case2() {
        var actual = MergeIntervals.mergeIntervals(intervals2);
        assertEquals(expectedIntervalList2,actual);
    }


    @Test
    void mergeIntervals_Null() {
        var exception = assertThrows(CodeException.class, () -> MergeIntervals.mergeIntervals((null)));
        assertTrue(exception.getMessage().contains("The array is null or empty"));
    }

    @Test
    void mergeIntervals_Empty() {
        var exception = assertThrows(CodeException.class, () -> MergeIntervals.mergeIntervals(new ArrayList<>()));
        assertTrue(exception.getMessage().contains("The array is null or empty"));
    }

}