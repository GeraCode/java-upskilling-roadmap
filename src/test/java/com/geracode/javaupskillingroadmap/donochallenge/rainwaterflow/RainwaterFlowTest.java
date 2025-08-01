package com.geracode.javaupskillingroadmap.donochallenge.rainwaterflow;

import static org.junit.jupiter.api.Assertions.*;

import com.geracode.javaupskillingroadmap.dojochallenge.rainwaterflow.RainwaterFlow;
import com.geracode.javaupskillingroadmap.dojochallenge.Utils.CodeException;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class RainwaterFlowTest {

    private int[][] expectedMatrixCoordinates;
    private List<Integer> expectedRowCoordinates;

    @BeforeEach
    void setUp() {
        expectedMatrixCoordinates = new int[][]{{9, 4, 8, 2, 7},
                {1, 5, 9, 5, 6},
                {2, 7, 3, 8, 6},
                {4, 5, 4, 6, 1},
                {1, 2, 7, 9, 8}};

        expectedRowCoordinates = List.of(1, 5, 9, 5, 6);
    }

    @ParameterizedTest
    @CsvSource({"0,1","1,0", "4,0","0,4"})
    void willWaterFlowToTheOcean_indexAreInThePerimeter(int x,int y) {
        var actual = RainwaterFlow.willWaterFlowToTheOcean(expectedMatrixCoordinates, x, y);
        assertTrue(actual);
    }

    @Test
    void willWaterFlowToTheOcean() {
        var actual = RainwaterFlow.willWaterFlowToTheOcean(expectedMatrixCoordinates, 2, 1);
        assertTrue(actual);
    }


    @Test
    void willWaterFlowToTheOcean_Null() {
        var exception = assertThrows(CodeException.class, () -> RainwaterFlow.willWaterFlowToTheOcean(null, 2, 1));
        assertTrue(exception.getMessage().contains("The matrix is null or empty"));
    }


    @Test
    void willWaterFlowToTheOcean_Empty() {
        var exception = assertThrows(CodeException.class, () -> RainwaterFlow.willWaterFlowToTheOcean(new int[][]{}, 2, 1));
        assertTrue(exception.getMessage().contains("The matrix is null or empty"));
    }

    /**
     * with the  List.of(1, 5, 9, 5, 6) increase the index by 1
     * check if in the index 2 to the expectedRowCoordinates.size-1
     * reach the ocean knowing that the position with the index 2 has the value of 9
     * 9 -->  5 --> 6
     */
    @Test
    void increaseArrayLoop_case_increase() {
        var actual = RainwaterFlow.increaseArrayLoop(expectedRowCoordinates, 2, true);
        assertFalse(actual);
    }

    /**
     * with the  List.of(1, 5, 9, 5, 6) decrease the index by 1
     * check if in the index 2 to the 0
     * reach the ocean knowing that the position with the index 2 has the value of 9
     * 1 <--  5 <-- 9
     */
    @Test
    void increaseArrayLoop_case_decrease() {
        var actual = RainwaterFlow.increaseArrayLoop(expectedRowCoordinates, 2, false);
        assertTrue(actual);
    }

    @Test
    void increaseArrayLoop_Null() {
        var exception = assertThrows(CodeException.class, () -> RainwaterFlow.increaseArrayLoop(null, 2, true));
        assertTrue(exception.getMessage().contains("The array is null or empty"));
    }


    @Test
    void increaseArrayLoop_Empty() {
        var exception = assertThrows(CodeException.class, () -> RainwaterFlow.increaseArrayLoop(new ArrayList<>(), 2, true));
        assertTrue(exception.getMessage().contains("The array is null or empty"));
    }
}