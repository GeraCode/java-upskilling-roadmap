package com.geracode.javaupskillingroadmap.donochallenge.maximumsubarray;

import static org.junit.jupiter.api.Assertions.*;

import com.geracode.javaupskillingroadmap.dojochallenge.maximumsubarray.MaximumSubArray;
import com.geracode.javaupskillingroadmap.dojochallenge.Utils.CodeException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *  Maximum SubArray Test
 */
class MaximumSubArrayTest {

    private int[] expectedArray1;
    private int[] expectedArray2;
    private int[] expectedArray3;

    @BeforeEach
    void setUp() {
        expectedArray1=new int[] {-2,1,-3,4,-1,2,1,-5,4} ;

        expectedArray2=new int[] {1};

        expectedArray3=new int[] {5,4,-1,7,8};
    }

    @Test
    void maxSubArray_case1_OK() {
        var actual = MaximumSubArray.maxSubArray(expectedArray1);
        assertEquals(6,actual);
    }

    @Test
    void maxSubArray_case2_OK() {
        var actual = MaximumSubArray.maxSubArray(expectedArray2);
        assertEquals(1,actual);
    }

    @Test
    void maxSubArray_case3_OK() {
        var actual = MaximumSubArray.maxSubArray(expectedArray3);
        assertEquals(23,actual);
    }



    @Test
    void maxSubArray_Null() {
        var exception = assertThrows(CodeException.class,() -> MaximumSubArray.maxSubArray(null));
        assertTrue(exception.getMessage().contains("The array is null or empty"));
    }

    @Test
    void maxSubArray_Empty() {
        var exception = assertThrows(CodeException.class,() -> MaximumSubArray.maxSubArray(new int[] {}));
        assertTrue(exception.getMessage().contains("The array is null or empty"));

    }
}