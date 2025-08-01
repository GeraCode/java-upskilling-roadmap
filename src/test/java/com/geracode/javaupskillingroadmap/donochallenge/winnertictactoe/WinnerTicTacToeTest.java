package com.geracode.javaupskillingroadmap.donochallenge.winnertictactoe;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.geracode.javaupskillingroadmap.dojochallenge.winnertictactoe.WinnerTicTacToe;
import com.geracode.javaupskillingroadmap.dojochallenge.Utils.CodeException;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@Log4j2
class WinnerTicTacToeTest {

    private int[][] moves1;
    private int[][] moves2;
    private int[][] moves3;

    private static final String expectedWinnerPlayerA = "PLAYER A IS THE WINNER";
    private static final String expectedWinnerPlayerB = "PLAYER B IS THE WINNER";
    private static final String expectedDraw="Draw";


    @BeforeEach
    void setUp() {
        moves1 = new int[][]{{0, 0}, {2, 0}, {1, 1}, {2, 1}, {2, 2}};
        moves2 = new int[][]{{0, 0}, {1, 1}, {0, 1}, {0, 2}, {1, 0}, {2, 0}};
        moves3 = new int[][]{{0, 0}, {1, 1}, {2, 0}, {1, 0}, {1, 2}, {2, 1}, {0, 1}, {0, 2}, {2, 2}};
    }

    @Test
    void tictactoe_moves1() {
        var winnerStatus = WinnerTicTacToe.findWinnerTicTacToeGame(moves1);
        log.info(winnerStatus);
        assertEquals(expectedWinnerPlayerA, winnerStatus);
    }

    @Test
    void tictactoe_moves2() {
        var winnerStatus = WinnerTicTacToe.findWinnerTicTacToeGame(moves2);
        log.info(winnerStatus);
        assertEquals(expectedWinnerPlayerB, winnerStatus);
    }

    @Test
    void tictactoe_moves3() {
        var winnerStatus = WinnerTicTacToe.findWinnerTicTacToeGame(moves3);
        log.info(winnerStatus);
        assertEquals(expectedDraw, winnerStatus);
    }


    @Test
    void canReachLastIndex_ArrayNull() {
        var exception = assertThrows(CodeException.class, () -> WinnerTicTacToe.findWinnerTicTacToeGame(null));
        assertTrue(exception.getMessage().contains("The array is null or empty"));
    }

    @Test
    void canReachLastIndex_ArrayEmpty() {
        var exception = assertThrows(CodeException.class, () -> WinnerTicTacToe.findWinnerTicTacToeGame(new int[][]{}));
        assertTrue(exception.getMessage().contains("The array is null or empty"));
    }

}