package com.geracode.javaupskillingroadmap.donochallenge.triangle;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.geracode.javaupskillingroadmap.dojochallenge.triangle.Triangle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TriangleTest {

    private List<List<Integer>> triangle;



    @BeforeEach
    void setUp() {
        triangle = new ArrayList<>();
        triangle.add(Arrays.asList(2));
        triangle.add(Arrays.asList(3, 4));
        triangle.add(Arrays.asList(6, 5, 7));
        triangle.add(Arrays.asList(4, 1, 8, 3));

    }

    @ParameterizedTest
    @CsvSource({"11"})
    void minimumTriangleTotal(int expectedResult) {
        var actual= Triangle.minimumTotal(triangle);
        assertEquals(expectedResult,actual);
    }

    @ParameterizedTest
    @CsvSource({"0"})
    void minimumTriangleTotal_Empty(int expectedResult) {
        var actual= Triangle.minimumTotal(new ArrayList<>());
        assertEquals(expectedResult,actual);
    }
}