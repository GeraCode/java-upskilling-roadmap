package com.geracode.javaupskillingroadmap.dojochallenge.triangle;

import java.util.List;

public class Triangle {

    public static int minimumTotal(List<List<Integer>> triangle) {
        if(triangle.isEmpty()){
            return 0;
        }
        for (int i = triangle.size() - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                int minByRow = Math.min(triangle.get(i + 1).get(j), triangle.get(i + 1).get(j + 1));
                int sumMinByRowAndActualValorRow = triangle.get(i).get(j) + minByRow;
                triangle.get(i).set(j, sumMinByRowAndActualValorRow);
            }
        }
        return triangle.get(0).get(0);
    }
}
