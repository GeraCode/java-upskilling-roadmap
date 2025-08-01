package com.geracode.javaupskillingroadmap.donochallenge.setmatrixzeroes;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.geracode.javaupskillingroadmap.dojochallenge.setmatrixzeroes.SetMatrixZeroes;
import com.geracode.javaupskillingroadmap.dojochallenge.Utils.CodeException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetMatrixZeroesTest {

    int[][] matrix1;
    int[][] matrix2;
    int[][] matrix3;
    int[][] expectedMatrix1;
    int[][] expectedMatrix2;
    int[][] expectedMatrix3;

    @BeforeEach
    void setUp() {

        matrix1 = new int[][] { {1, 1, 1, 1},
                                {1, 1, 1, 1},
                                {1, 0, 1, 1},
                                {0, 1, 1, 1}};

        matrix2 = new int[][] { {1, 1, 1, 1},
                                {1, 0, 0, 0},
                                {1, 1, 0, 1},
                                {1, 0, 0, 1}};

        matrix3 = new int[][] { {0, 1, 1, 1},
                                {1, 0, 1, 0},
                                {1, 1, 1, 0},
                                {0, 1, 1, 1}};

        expectedMatrix1 = new int[][] { {0, 1, 1, 1},
                                        {0, 1, 1, 1},
                                        {0, 0, 0, 0},
                                        {0, 1, 1, 1}};

        expectedMatrix2 = new int[][] { {1, 1, 1, 1},
                                        {1, 0, 0, 0},
                                        {1, 1, 0, 1},
                                        {1, 0, 0, 1}};

        expectedMatrix3 = new int[][] { {0, 1, 1, 1},
                                        {0, 0, 0, 0},
                                        {0, 1, 1, 0},
                                        {0, 1, 1, 1}};
    }

    @Test
    void setMatrixZeroes_case1() {

        var actual = SetMatrixZeroes.setMatrixZeroes(matrix1,10);
        assertArrayEquals(expectedMatrix1,actual);

    }

    @Test
    void setMatrixZeroes_case2() {

        var actual = SetMatrixZeroes.setMatrixZeroes(matrix2,2);
        assertArrayEquals(expectedMatrix2,actual);

    }

    @Test
    void setMatrixZeroes_case3() {

        var actual = SetMatrixZeroes.setMatrixZeroes(matrix3,4);
        assertArrayEquals(expectedMatrix3,actual);

    }

    @Test
    void increaseArrayLoop_Null() {
        var exception = assertThrows(CodeException.class, () -> SetMatrixZeroes.setMatrixZeroes(null,0));
        assertTrue(exception.getMessage().contains("The matrix is null or empty"));
    }

    @Test
    void increaseArrayLoop_Empty() {
        var exception = assertThrows(CodeException.class, () -> SetMatrixZeroes.setMatrixZeroes(new int[][]{},0));
        assertTrue(exception.getMessage().contains("The matrix is null or empty"));
    }


}