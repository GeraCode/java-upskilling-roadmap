package com.geracode.javaupskillingroadmap.dojochallenge.rainwaterflow;


import com.geracode.javaupskillingroadmap.dojochallenge.Utils.CodeException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * RainwaterFlow class
 */
public class RainwaterFlow {

    private RainwaterFlow() {
    }

    /**
     * The grid below represents an island completely surrounded by water.
     * The numbers on the grid represent the elevation for the respective locations.
     * Write code to determine if rainwater would flow into the ocean when it rains at a given xy coordinate.
     * <pre> <br> &nbsp;&nbsp&nbsp;&nbsp&nbsp;&nbsp  0   1   2   3   4   <br>
     *      ---------------------<br>
     * 0    | 9 | 4 | 8 | 2 | 7 | <br>
     *      --------------------- <br>
     * 1    | 1 | 5 | 9 | 5 | 6 | <br>
     *      --------------------- <br>
     * 2    | 2 | 7 | 3 | 8 | 6 | <br>
     *      --------------------- <br>
     * 3    | 4 | 5 | 4 | 6 | 1 | <br>
     *      --------------------- <br>
     * 4    | 1 | 2 | 7 | 9 | 8 | <br>
     *      --------------------- <br> </pre>
     * <p><b>Remember:</b></p>
     * <li>Water can only move Left, Right, Up and Down.</li>
     * <li>Water can only move to tiles of lower elevation.</li>
     * <li>Water at any tile on the edge of the island (shore) can reach the ocean.</li>
     *
     * Please implement below method. Feel free to write additional methods.
     * Boolean willWaterFlowToTheOcean(int x, int y)
     *
     * @param x index Coordinates
     * @param y index Coordinates
     * @return willWaterFlowToTheOcean (return true if the Coordinates reach the ocean)
     */
    public static Boolean willWaterFlowToTheOcean( int[][] matrixCoordinates, int x, int y) {
        if(!Objects.isNull(matrixCoordinates) && matrixCoordinates.length>0) {
            //the cell that are in the perimeter always reach the ocean
            if (x == 0 || x == matrixCoordinates.length - 1 || y == 0 || y == matrixCoordinates.length - 1) {
                return true;
            } else {
                //the cell thar aren't in the perimeter
                List<Integer> tempRow = new ArrayList<>();
                List<Integer> tempColumn = new ArrayList<>();

                for (int i = 0; i < matrixCoordinates.length; i++) {
                    for (int j = 0; j < matrixCoordinates[i].length; j++) {
                        System.out.print(" | " + matrixCoordinates[i][j]);
                        if (i == y) {
                            tempRow.add(matrixCoordinates[i][j]);
                        }
                        if (j == x) {
                            tempColumn.add(matrixCoordinates[i][j]);
                        }
                    }
                    System.out.print(" | \n");
                }
                boolean tempRight = increaseArrayLoop(tempRow, x, true);
                boolean tempLeft = increaseArrayLoop(tempRow, x, false);
                boolean tempUp = increaseArrayLoop(tempColumn, y, false);
                boolean tempDown = increaseArrayLoop(tempColumn, y, true);

                return tempRight || tempLeft || tempUp || tempDown;
            }
        }else
            throw new CodeException("The matrix is null or empty");

    }


    public static boolean increaseArrayLoop(List<Integer> integerList, int index, boolean isIncrease) {
        if (!Objects.isNull(integerList) && integerList.size() > 0) {
            boolean tempBoolean = false;
            int tempValor = 0;
            if (isIncrease) {
                System.out.println("");
                for (int i = index; i <= integerList.size() - 1; i++) {
                    System.out.print(integerList.get(i) + " | ");
                    if (i == index)
                        tempValor = integerList.get(i);
                    else if (tempValor > integerList.get(i)) {
                        tempValor = integerList.get(i);
                        if (integerList.size() - 1 == i) {
                            tempBoolean = true;
                        }
                    }
                }
            } else {
                System.out.println("");
                for (int j = index; j >= 0; j--) {
                    System.out.print(integerList.get(j) + " | ");
                    if (j == index)
                        tempValor = integerList.get(j);
                    else if (tempValor > integerList.get(j)) {
                        tempValor = integerList.get(j);
                        if (j == 0) {
                            tempBoolean = true;
                        }
                    }
                }
            }
            return tempBoolean;
        }else
            throw new CodeException("The array is null or empty");

    }

}
