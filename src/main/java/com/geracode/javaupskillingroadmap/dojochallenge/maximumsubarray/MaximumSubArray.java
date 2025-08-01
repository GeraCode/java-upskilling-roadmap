package com.geracode.javaupskillingroadmap.dojochallenge.maximumsubarray;

import com.geracode.javaupskillingroadmap.dojochallenge.Utils.CodeException;
import java.util.Objects;

/**
 * MaximumSubArray class
 */
public class MaximumSubArray {

    private MaximumSubArray() {
    }

    /**
     * Given an integer array nums, find the contiguous subarray with the largest sum, and return its sum.
     * <h3><b>Examples</b></h3>
     * <br><b>Example 1: </b>
     * <br>Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
     * <br>Output: 6
     * <br>Explanation: The subarray [4,-1,2,1] has the largest sum 6.
     * <br>----------------------------------<br>
     * <br<b>>Example 2: </b>
     * <br>Input: nums = [1]
     * <br>Output: 1
     * <br>Explanation: The subarray [1] has the largest sum 1.
     * <br>----------------------------------<br>
     * <br><b>Example 3: </b>
     * <br>Input: nums = [5,4,-1,7,8]
     * <br>Output: 23
     * <br>Explanation: The subarray [5,4,-1,7,8] has the largest sum 23
     * @param ints  array that contains the nums
     * @return the mazimum sum
     */
    public static int maxSubArray(int[] ints){
        if(!Objects.isNull(ints) && ints.length>0) {
            int tempMax = 0;
            int tempMaxSumOrActual = 0;
            for (int i = 0; i < ints.length; i++) {
                tempMaxSumOrActual = Math.max(ints[i], ints[i] + tempMaxSumOrActual);
                tempMax = Math.max(tempMax, tempMaxSumOrActual);
            }
            return tempMax;
        }else
            throw new CodeException("The array is null or empty");

    }
}
