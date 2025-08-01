package com.geracode.javaupskillingroadmap.dojochallenge.winnertictactoe;

import com.geracode.javaupskillingroadmap.dojochallenge.Utils.CodeException;

import java.util.Objects;

public class WinnerTicTacToe {

    public WinnerTicTacToe() {
    }

    private static final String WINNER_PLAYER_A="PLAYER A IS THE WINNER";
    private static final String WINNER_PLAYER_B="PLAYER B IS THE WINNER";
    private static final String DRAW="Draw";
    private static final String PENDING="Pending";

    public static String findWinnerTicTacToeGame(int[][] moves) {
        if(Objects.isNull(moves) || moves.length == 0) {
            throw new CodeException("The array is null or empty");
        }

        char[][] board = new char[3][3];
        // Fill the grid Tic-Tac-Toe with the moves in the array
        //'X' for player A
        //'O' for player B
        for (int i = 0; i < moves.length; i++) {
            board[moves[i][0]][moves[i][1]] = (i % 2 == 0) ? 'X' : 'O';
        }

        // Winner
        for (int i = 0; i < 3; i++) {
            // rows
            if (board[i][0] != '\0' &&
                    board[i][0] == board[i][1] &&
                    board[i][1] == board[i][2]) {
                return board[i][0] == 'X' ? WINNER_PLAYER_A : WINNER_PLAYER_B;
            }
            // columns
            if (board[0][i] != '\0' &&
                    board[0][i] == board[1][i] &&
                    board[1][i] == board[2][i]) {
                return board[0][i] == 'X' ?  WINNER_PLAYER_A : WINNER_PLAYER_B;
            }
        }

        // diagonal "\"
        if (board[0][0] != '\0' &&
                board[0][0] == board[1][1] &&
                board[0][0] == board[2][2]) {
            return board[0][0] == 'X' ?  WINNER_PLAYER_A : WINNER_PLAYER_B;
        }
        // diagonal "/"
        if (board[0][2] != '\0' &&
                board[0][2] == board[1][1] &&
                board[0][2] == board[2][0]) {
            return board[0][2] == 'X' ?  WINNER_PLAYER_A : WINNER_PLAYER_B;
        }

        // validate if is draw or pending
        return moves.length == 9 ? DRAW : PENDING;
    }
}
