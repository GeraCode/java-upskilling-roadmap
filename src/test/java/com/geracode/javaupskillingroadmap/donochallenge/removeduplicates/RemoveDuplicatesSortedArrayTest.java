package com.geracode.javaupskillingroadmap.donochallenge.removeduplicates;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.geracode.javaupskillingroadmap.dojochallenge.removeduplicates.RemoveDuplicatesSortedArray;
import com.geracode.javaupskillingroadmap.dojochallenge.Utils.CodeException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveDuplicatesSortedArrayTest {

    private int[] A;
    private int[] S;
    private int[] expectedResult_A;
    private int[] expectedResult_S;


    @BeforeEach
    void setUp() {
        A = new int[] {-1, 0, 1, 2, -1, -4};
        S = new int[] {10, 15, 18, 15, 22};
        expectedResult_A =  new int[] {-4, -1, 0, 1, 2};
        expectedResult_S =  new int[] {10, 15, 18, 22};

    }

    @Test
    void removeDuplicates_A() {
        var result= RemoveDuplicatesSortedArray.removeDuplicates(A);
        assertArrayEquals(result,expectedResult_A);
    }

    @Test
    void removeDuplicates_S() {
        var result= RemoveDuplicatesSortedArray.removeDuplicates(S);
        assertArrayEquals(result,expectedResult_S);

    }

    @Test
    void increaseArrayLoop_Null() {
        var exception = assertThrows(CodeException.class, () -> RemoveDuplicatesSortedArray.removeDuplicates(null));
        assertTrue(exception.getMessage().contains("The array is null or empty"));
    }

    @Test
    void increaseArrayLoop_Empty() {
        var exception = assertThrows(CodeException.class, () -> RemoveDuplicatesSortedArray.removeDuplicates(new int[]{}));
        assertTrue(exception.getMessage().contains("The array is null or empty"));
    }
}