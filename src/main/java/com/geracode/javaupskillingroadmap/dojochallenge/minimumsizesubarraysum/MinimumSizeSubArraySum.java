package com.geracode.javaupskillingroadmap.dojochallenge.minimumsizesubarraysum;

import com.geracode.javaupskillingroadmap.dojochallenge.Utils.CodeException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MinimumSizeSubArraySum {
    private MinimumSizeSubArraySum() {
    }

    public static List<Integer> findSubArray(int[] array, int s) {
        if(Objects.isNull(array) || array.length == 0) {
            throw new CodeException("The array is null or empty");
        }
        int left = 0, sum = 0, minLen = Integer.MAX_VALUE;
        List<Integer> result = new ArrayList<>();
        for (int right = 0; right < array.length; right++) {
            sum += array[right];
            while (sum >= s) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    result.clear();
                    for (int i = left; i <= right; i++) {
                        result.add(array[i]);
                    }
                }
                sum -= array[left];
                left++;
            }
        }
        if(result.isEmpty()){
            return List.of(0);
        }
        return result;
    }
}
