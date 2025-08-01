package com.geracode.javaupskillingroadmap.dojochallenge.setmatrixzeroes;

import com.geracode.javaupskillingroadmap.dojochallenge.Utils.CodeException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class SetMatrixZeroes {

    private SetMatrixZeroes() {
    }

    public static int[][] setMatrixZeroes(int[][] matrix, int targetRow) {
        if(Objects.isNull(matrix) || matrix.length == 0) {
            throw new CodeException("The matrix is null or empty");
        }
        Set<Integer> rowsWithZero = new HashSet<>();
        Set<Integer> columnsWithZero = new HashSet<>();
        boolean findZeroRow= false;
        int count = 0;
        int iTemp=0;
        //find the index  "i"  in where exist the target
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (count == targetRow) {
                    iTemp = i;
                }
                count++;
            }
        }
        // valid if exist 0 in the row
        for (int j = 0; j < matrix[iTemp].length; j++) {
            if (matrix[iTemp][j] == 0) {
                findZeroRow = true;
                break;
            }
        }
        //if exist 0 in the row
        if (findZeroRow) {
            rowsWithZero.add(iTemp);
            // valid if exist a 0 in column with J index 0
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][0] == 0) {
                    columnsWithZero.add(0);
                    break;
                }
            }
            //set all cells values in the row with iTemp with 0
            for (int i : rowsWithZero) {
                Arrays.fill(matrix[i], 0);
            }
            //set all cells values with 0 in the column with index 0 in J
            for (int j : columnsWithZero) {
                for (int i = 0; i < matrix.length; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
        return matrix;
    }



}
