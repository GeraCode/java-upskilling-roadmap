package com.geracode.javaupskillingroadmap.donochallenge.validsudoku;

import static org.junit.jupiter.api.Assertions.*;

import com.geracode.javaupskillingroadmap.dojochallenge.validsudoku.ValidSudoku;
import com.geracode.javaupskillingroadmap.dojochallenge.Utils.CodeException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ValidSudokuTest {

    private char[][] expectedBoardTrue;
    private char[][] expectedBoardFalseColumn;
    private char[][] expectedBoardFalseRow;
    private char[][] expectedBoardFalseSubBox;

    @BeforeEach
    void setUp() {
        expectedBoardTrue = new char[][] {  {'5','3','.','.','7','.','.','.','.'},
                                            {'6','.','.','1','9','5','.','.','.'},
                                            {'.','9','8','.','.','.','.','6','.'},
                                            {'8','.','.','.','6','.','.','.','3'},
                                            {'4','.','.','8','.','3','.','.','1'},
                                            {'7','.','.','.','2','.','.','.','6'},
                                            {'.','6','.','.','.','.','2','8','.'},
                                            {'.','.','.','4','1','9','.','.','5'},
                                            {'.','.','.','.','8','.','.','7','9'}};

        expectedBoardFalseColumn = new char[][]{{'8','3','.','.','7','.','.','.','.'},
                                                {'6','.','.','1','9','5','.','.','.'},
                                                {'.','9','8','.','.','.','.','6','.'},
                                                {'8','.','.','.','6','.','.','.','3'},
                                                {'4','.','.','8','.','3','.','.','1'},
                                                {'7','.','.','.','2','.','.','.','6'},
                                                {'.','6','.','.','.','.','2','8','.'},
                                                {'.','.','.','4','1','9','.','.','5'},
                                                {'.','.','.','.','8','.','.','7','9'}};

        expectedBoardFalseRow = new char[][] {  {'5','3','.','.','7','.','.','.','.'},
                                                {'6','.','.','1','9','5','.','.','.'},
                                                {'.','9','8','.','.','.','9','6','.'},
                                                {'8','.','.','.','6','.','.','.','3'},
                                                {'4','.','.','8','.','3','.','.','1'},
                                                {'7','.','.','.','2','.','.','.','6'},
                                                {'.','6','.','.','.','.','2','8','.'},
                                                {'.','.','.','4','1','9','.','.','5'},
                                                {'.','.','.','.','8','.','.','7','9'}};

        expectedBoardFalseSubBox = new char[][]{{'5','3','.','.','7','.','.','.','.'},
                                                {'6','.','.','1','9','5','.','.','.'},
                                                {'.','9','8','.','.','.','.','6','.'},
                                                {'8','.','.','.','6','.','.','.','3'},
                                                {'4','.','.','8','.','3','.','.','1'},
                                                {'7','.','.','.','2','.','.','.','6'},
                                                {'.','6','.','.','.','.','2','8','.'},
                                                {'.','.','.','4','1','9','.','.','5'},
                                                {'.','.','6','.','8','.','.','7','9'}};
    }

    @Test
    void isValidSudoku_OK() {
        var actual= ValidSudoku.isValidSudoku(expectedBoardTrue);
        assertTrue(actual);
    }

    @Test
    void isValidSudoku_BoardFalseColumnFalse() {
        var actual=ValidSudoku.isValidSudoku(expectedBoardFalseColumn);
        assertFalse(actual);
    }

    @Test
    void isValidSudoku_BoardFalseRow() {
        var actual=ValidSudoku.isValidSudoku(expectedBoardFalseRow);
        assertFalse(actual);
    }
    @Test
    void isValidSudoku_BoardFalseSubBox() {
        var actual=ValidSudoku.isValidSudoku(expectedBoardFalseSubBox);
        assertFalse(actual);
    }

    @Test
    void increaseArrayLoop_Null() {
        var exception = assertThrows(CodeException.class, () -> ValidSudoku.isValidSudoku(null));
        assertTrue(exception.getMessage().contains("The array is null or empty"));
    }

    @Test
    void increaseArrayLoop_Empty() {
        var exception = assertThrows(CodeException.class, () -> ValidSudoku.isValidSudoku(new char[][]{}));
        assertTrue(exception.getMessage().contains("The array is null or empty"));
    }
}