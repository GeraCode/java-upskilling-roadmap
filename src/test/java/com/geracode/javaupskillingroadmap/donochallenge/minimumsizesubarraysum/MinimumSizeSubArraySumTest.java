package com.geracode.javaupskillingroadmap.donochallenge.minimumsizesubarraysum;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.geracode.javaupskillingroadmap.dojochallenge.minimumsizesubarraysum.MinimumSizeSubArraySum;
import com.geracode.javaupskillingroadmap.dojochallenge.Utils.CodeException;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MinimumSizeSubArraySumTest {

    private int[] ints_1;
    private int[] ints_2;
    private int[] ints_3;

    private List<Integer> expectedIntegers_1;
    private List<Integer> expectedIntegers_2;
    private List<Integer> expectedIntegers_3;


    @BeforeEach
    void setUp() {

        ints_1=new int[]{2,3,1,2,4,3};
        ints_2=new int[]{2,6,5,6,7,9,10};
        ints_3=new int[]{1,2,3,4,5};

        expectedIntegers_1=List.of(4,3);
        expectedIntegers_2=List.of(6, 7, 9);
        expectedIntegers_3=List.of(0);

    }

    @Test
    void findSubArray_1() {
        var actual= MinimumSizeSubArraySum.findSubArray(ints_1,7);
        assertEquals(expectedIntegers_1,actual);
    }

    @Test
    void findSubArray_2() {
        var actual= MinimumSizeSubArraySum.findSubArray(ints_2,22);
        assertEquals(expectedIntegers_2,actual);
    }
    @Test
    void findSubArray_3() {
        var actual= MinimumSizeSubArraySum.findSubArray(ints_3,16);
        assertEquals(expectedIntegers_3,actual);
    }

    @Test
    void findSubArray_Empty() {
        var exception = assertThrows(CodeException.class, () -> MinimumSizeSubArraySum.findSubArray(new int[]{},0));
        assertTrue(exception.getMessage().contains("The array is null or empty"));
    }

    @Test
    void findSubArray_Null() {
        var exception = assertThrows(CodeException.class, () -> MinimumSizeSubArraySum.findSubArray(null,0));
        assertTrue(exception.getMessage().contains("The array is null or empty"));
    }

}