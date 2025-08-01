package com.geracode.javaupskillingroadmap.dojochallenge.validsudoku;

import com.geracode.javaupskillingroadmap.dojochallenge.Utils.CodeException;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * ValidSudoku
 */
public class ValidSudoku {

    private static String MESSAGE_VALOR="valor=>";

    private ValidSudoku() {
    }

    /**
     * Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
     *
     * Each row must contain the digits 1-9 without repetition.
     * Each column must contain the digits 1-9 without repetition.
     * Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
     * Note:
     *
     * A Sudoku board (partially filled) could be valid but is not necessarily solvable.
     * Only the filled cells need to be validated according to the mentioned rules.
     *
     * Input: board =
     * [["5","3",".",".","7",".",".",".","."]
     * ,["6",".",".","1","9","5",".",".","."]
     * ,[".","9","8",".",".",".",".","6","."]
     * ,["8",".",".",".","6",".",".",".","3"]
     * ,["4",".",".","8",".","3",".",".","1"]
     * ,["7",".",".",".","2",".",".",".","6"]
     * ,[".","6",".",".",".",".","2","8","."]
     * ,[".",".",".","4","1","9",".",".","5"]
     * ,[".",".",".",".","8",".",".","7","9"]]
     * Output: true
     *
     * Example 2:
     * Input: board =
     * [["8","3",".",".","7",".",".",".","."]
     * ,["6",".",".","1","9","5",".",".","."]
     * ,[".","9","8",".",".",".",".","6","."]
     * ,["8",".",".",".","6",".",".",".","3"]
     * ,["4",".",".","8",".","3",".",".","1"]
     * ,["7",".",".",".","2",".",".",".","6"]
     * ,[".","6",".",".",".",".","2","8","."]
     * ,[".",".",".","4","1","9",".",".","5"]
     * ,[".",".",".",".","8",".",".","7","9"]]
     * Output: false
     */
    public static boolean isValidSudoku( char[][] board){
        if(Objects.isNull(board) || board.length==0)
            throw new CodeException("The array is null or empty");
        // I use the set because doesn't allow duplicates
        Set<String> seen = new HashSet<>();

        //Rows
        for(int i = 0; i < board.length; i++)
            for (int j = 0; j < 9; ++j) {
                if (board[i][j] == '.')
                    continue;
                final char c = board[i][j];
                if (!seen.add("@row"+i+ MESSAGE_VALOR + c))
                    return false;
            }

        seen = new HashSet<>();

        //Columns
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j <board.length; j++){
                if (board[j][i] == '.')
                    continue;
                final char c = board[j][i];
                if (!seen.add("@column"+i+ MESSAGE_VALOR + c))
                    return false;
            }
        }

        seen = new HashSet<>();

        //sub-boxes  3 * 3
        for(int i = 0; i < board.length; i++)
            for (int j = 0; j < board.length; ++j) {
                if (board[i][j] == '.')
                    continue;
                final char c = board[i][j];
                if (!seen.add("@sub-boxes"+"["+i / 3+ j / 3+"]"+MESSAGE_VALOR+c))
                    return false;
            }

        return true;
    }

}
