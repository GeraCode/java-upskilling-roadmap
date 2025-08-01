package com.geracode.javaupskillingroadmap.donochallenge.foursum;

import static org.junit.jupiter.api.Assertions.*;

import com.geracode.javaupskillingroadmap.dojochallenge.foursum.FourSum;
import com.geracode.javaupskillingroadmap.dojochallenge.Utils.CodeException;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FourSumTest {




    private int[] expectedIntsCase1;
    private int[] expectedIntsCase2;

    private int[][] expectedIntsMatrix1;
    private int[][] expectedIntsMatrix2;

    @BeforeEach
    void setUp() {
        expectedIntsCase1=new int []{1,0,-1,0,-2,2};
        expectedIntsCase2=new int []{2,2,2,2,2};

        expectedIntsMatrix1= new int[][]{{-2, -1, 1, 2},{-2, 0, 0, 2},{-1, 0, 0, 1}};
        expectedIntsMatrix2= new int[][]{{2, 2, 2, 2}};
    }

    @ParameterizedTest
    @CsvSource({"0"})
    void fourSum_Case1_OK(int target) {
        System.out.println("Input: nums = "+Arrays.toString(expectedIntsCase1)+", target= "+target);
        var actual= FourSum.fourSum(expectedIntsCase1,target);
        assertArrayEquals(actual,expectedIntsMatrix1);
    }

    @ParameterizedTest
    @CsvSource({"8"})
    void fourSum_Case2_OK(int target) {
        System.out.println("Input: nums = "+Arrays.toString(expectedIntsCase2)+", target= "+target);
        var actual= FourSum.fourSum(expectedIntsCase2,target);
        assertArrayEquals(actual,expectedIntsMatrix2);
    }


    @Test
    void fourSum_ArrayNull() {
        var exception = assertThrows(CodeException.class, () -> FourSum.fourSum(null,0));
        assertTrue(exception.getMessage().contains("The array is null or empty"));
    }

    @Test
    void fourSum_ArrayEmpty() {
        var exception = assertThrows(CodeException.class, () -> FourSum.fourSum(new int[]{},0));
        assertTrue(exception.getMessage().contains("The array is null or empty"));
    }

    @Test
    void fourSum_sizeMustBe4() {
        var exception = assertThrows(CodeException.class, () -> FourSum.fourSum(new int[]{1,0,-1},0));
        assertTrue(exception.getMessage().contains("The array must be at least size 4."));
    }
}