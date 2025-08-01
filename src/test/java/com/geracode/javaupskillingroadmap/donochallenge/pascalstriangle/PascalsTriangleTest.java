package com.geracode.javaupskillingroadmap.donochallenge.pascalstriangle;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import com.geracode.javaupskillingroadmap.dojochallenge.pascalstriangle.PascalsTriangle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class PascalsTriangleTest {

    private List<List<Integer>> expectedListListFive;

    private List<List<Integer>> expectedListListSix;

    @BeforeEach
    public void setUp() {
        expectedListListFive = List.of(Arrays.asList(1),Arrays.asList(1,1),Arrays.asList(1,2,1),Arrays.asList(1,3,3,1),Arrays.asList(1,4,6,4,1));
        expectedListListSix = List.of(Arrays.asList(1),Arrays.asList(1,1),Arrays.asList(1,2,1),Arrays.asList(1,3,3,1),Arrays.asList(1,4,6,4,1),Arrays.asList(1,5,10,10,5,1));
    }

    @ParameterizedTest
    @CsvSource({"5"})
    void printPascalsTriangleTest_fiveSteps(int rowNumber ) {
        var actual= PascalsTriangle.printPascalsTriangle(rowNumber);
        assertEquals(expectedListListFive,actual);
    }

    @ParameterizedTest
    @CsvSource({"6"})
    void printPascalsTriangleTest_sixSteps(int rowNumber ) {
        var actual=PascalsTriangle.printPascalsTriangle(rowNumber);
        assertEquals(expectedListListSix,actual);
    }
}