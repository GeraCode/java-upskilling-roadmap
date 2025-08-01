package com.geracode.javaupskillingroadmap.dojochallenge.pascalstriangle;

import java.util.ArrayList;
import java.util.List;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class PascalsTriangle {


    /**
     * Given numRows, generate the first numRows of Pascal’s triangle. For example, given numRows = 5
     */
    public static List<List<Integer>> printPascalsTriangle(int numRows){
        List<List<Integer>> integerList = new ArrayList<>();
        System.out.println("Input: numRows="+numRows+"\nOutput: \n[");
        for (int i = 0; i < numRows; i++) {
            List<Integer> tempIntegerList = new ArrayList<>();
            for (int j = 0; j <= numRows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                tempIntegerList.add(factorial(i) / (factorial(i - k) * factorial(k)));
            }
            integerList.add(tempIntegerList);
            System.out.println(tempIntegerList + (i!=numRows-1?",":""));
        }
        System.out.println("]");
        return integerList;
    }


    public static int factorial(int i) {
        if (i == 0) {
            return 1;
        }
        return i * factorial(i - 1);
    }
}
