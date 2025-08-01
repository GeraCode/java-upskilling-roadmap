package com.geracode.javaupskillingroadmap.donochallenge.threesum;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.geracode.javaupskillingroadmap.dojochallenge.threesum.ThreeSum;
import com.geracode.javaupskillingroadmap.dojochallenge.Utils.CodeException;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ThreeSumTest {

    private int[] expectedIntsCase1;
    private int[] expectedIntsCase2;
    private int[] expectedIntsCase3;
    private List<List<Integer>> expectedIntsMatrix1;
    private List<List<Integer>> expectedIntsMatrix2;
    private List<List<Integer>> expectedIntsMatrix3;

    @BeforeEach
    void setUp() {
        expectedIntsCase1=new int []{-1,0,1,2,-1,-4};
        expectedIntsCase2=new int []{0,1,1};
        expectedIntsCase3=new int []{0,0,0};
        expectedIntsMatrix1= Arrays.asList(Arrays.asList(-1,-1,2),Arrays.asList(-1,0,1));
        expectedIntsMatrix2= List.of();
        expectedIntsMatrix3= List.of(Arrays.asList(0, 0, 0));
    }

    @Test
    void getThreeSum_Case1_OK() {
        var actual=  ThreeSum.getThreeSum(expectedIntsCase1);
        assertEquals(actual,expectedIntsMatrix1);
    }

    @Test
    void getThreeSum_Case2_OK() {
        var actual=  ThreeSum.getThreeSum(expectedIntsCase2);
        assertEquals(actual,expectedIntsMatrix2);
    }

    @Test
    void getThreeSum_Case3_OK() {
        var actual=  ThreeSum.getThreeSum(expectedIntsCase3);
        assertEquals(actual,expectedIntsMatrix3);
    }


    @Test
    void fourSum_ArrayNull() {
        var exception = assertThrows(CodeException.class, () -> ThreeSum.getThreeSum(null));
        assertTrue(exception.getMessage().contains("The array is null or empty"));
    }

    @Test
    void fourSum_ArrayEmpty() {
        var exception = assertThrows(CodeException.class, () -> ThreeSum.getThreeSum(new int[]{}));
        assertTrue(exception.getMessage().contains("The array is null or empty"));
    }
}