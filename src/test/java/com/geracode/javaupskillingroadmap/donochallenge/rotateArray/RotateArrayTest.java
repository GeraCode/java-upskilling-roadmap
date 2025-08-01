package com.geracode.javaupskillingroadmap.donochallenge.rotateArray;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import com.geracode.javaupskillingroadmap.dojochallenge.rotateArray.RotateArray;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class RotateArrayTest {

    private int[] expectedArray_Case1;
    private int[] expectedArray_Case2;

    @BeforeEach
    void setUp() {
        expectedArray_Case1 = new int[]{5, 6, 7, 1, 2, 3, 4};

        expectedArray_Case2 = new int[]{3, 99, -1, -100};
    }

    @ParameterizedTest
    @CsvSource({"3"})
    void rotateArray_Case1(int k) {
        var actual = RotateArray.rotateArray(new int[]{1,2,3,4,5,6,7}, k);
        assertArrayEquals(expectedArray_Case1, actual);

    }

    @ParameterizedTest
    @CsvSource({"2"})
    void rotateArray_Case2(int k) {
        var actual = RotateArray.rotateArray(new int[]{-1,-100,3,99}, k);
        assertArrayEquals(expectedArray_Case2, actual);
    }

}