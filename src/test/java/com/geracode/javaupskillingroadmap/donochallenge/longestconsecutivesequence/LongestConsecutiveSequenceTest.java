package com.geracode.javaupskillingroadmap.donochallenge.longestconsecutivesequence;

import static org.junit.jupiter.api.Assertions.*;

import com.geracode.javaupskillingroadmap.dojochallenge.longestconsecutivesequence.LongestConsecutiveSequence;
import com.geracode.javaupskillingroadmap.dojochallenge.Utils.CodeException;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class LongestConsecutiveSequenceTest {

    private int[] expectedArray_Case1;
    private int[] expectedArray_Case2;


    @BeforeEach
    void setUp() {

        expectedArray_Case1 = new int[]{100,4,200,1,3,2};

        expectedArray_Case2 = new int[]{0,3,7,2,5,8,4,6,0,1};

    }

    @ParameterizedTest
    @CsvSource({"4"})
    void getLongestConsecutiveSequence_Case1_OK(int expectedIntResult) {
        var actual = LongestConsecutiveSequence.getLongestConsecutiveSequence(expectedArray_Case1);
        assertEquals(expectedIntResult, actual);

        System.out.println("\nInput: nums = " + Arrays.toString(expectedArray_Case1) + "\nOutput: " + actual);
    }

    @ParameterizedTest
    @CsvSource({"9"})
    void getLongestConsecutiveSequence_Case2_OK(int expectedIntResult) {
        var actual = LongestConsecutiveSequence.getLongestConsecutiveSequence(expectedArray_Case2);
        assertEquals(expectedIntResult, actual);

        System.out.println("\nInput: nums = " + Arrays.toString(expectedArray_Case2) + "\nOutput: " + actual);
    }

    @Test
    void getLongestConsecutiveSequence_ArrayNull() {
        var exception = assertThrows(CodeException.class, () -> LongestConsecutiveSequence.getLongestConsecutiveSequence(null));
        assertTrue(exception.getMessage().contains("The array is null or empty"));
    }

    @Test
    void getLongestConsecutiveSequence_ArrayEmpty() {
        var exception = assertThrows(CodeException.class, () -> LongestConsecutiveSequence.getLongestConsecutiveSequence(new int[]{}));
        assertTrue(exception.getMessage().contains("The array is null or empty"));
    }
}