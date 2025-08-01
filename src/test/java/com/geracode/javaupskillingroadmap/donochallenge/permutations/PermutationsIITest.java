package com.geracode.javaupskillingroadmap.donochallenge.permutations;

import static org.junit.jupiter.api.Assertions.*;

import com.geracode.javaupskillingroadmap.dojochallenge.permutations.PermutationsII;
import com.geracode.javaupskillingroadmap.dojochallenge.Utils.CodeException;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PermutationsIITest {

    private int[][] expectedMatrix1;
    private int[][] expectedMatrix2;
    private int[] input1;
    private int[] input2;

    @BeforeEach
    void setUp() {
        input1=new int[] {1,1,2};
        expectedMatrix1= new int[][]{{1, 1, 2},{1, 2, 1}, {2, 1, 1}};

        input2=new int[] {1,2,3};
        expectedMatrix2= new int[][]{{1, 2, 3},{1, 3, 2}, {2, 1, 3},
                                     {2, 3, 1},{3, 1, 2}, {3, 2, 1}};

    }

    @Test
    void permuteUnique_case1_OK() {
        System.out.println("Input: nums = "+ Arrays.toString(input1));
        System.out.println("Output:");
        var actual= PermutationsII.permuteUnique(input1) ;
        Arrays.stream(actual).forEach(ints -> System.out.println(Arrays.toString(ints)));
        assertArrayEquals(expectedMatrix1,actual);

        System.out.println("\n--------------------------");

    }

    @Test
    void permuteUnique_case2_OK() {
        System.out.println("Input: nums = "+ Arrays.toString(input2));
        System.out.println("Output:");
        var actual= PermutationsII.permuteUnique(input2) ;
        Arrays.stream(actual).forEach(ints -> System.out.println(Arrays.toString(ints)));
        assertArrayEquals(expectedMatrix2,actual);

        System.out.println("\n--------------------------");
    }

    @Test
    void increaseArrayLoop_Null() {
        var exception = assertThrows(CodeException.class, () -> PermutationsII.permuteUnique(null));
        assertTrue(exception.getMessage().contains("The array is null or empty"));
    }


    @Test
    void increaseArrayLoop_Empty() {
        var exception = assertThrows(CodeException.class, () -> PermutationsII.permuteUnique(new int[]{}));
        assertTrue(exception.getMessage().contains("The array is null or empty"));
    }
}