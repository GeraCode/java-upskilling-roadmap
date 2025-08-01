package com.geracode.javaupskillingroadmap.dojochallenge.jumpgame;

import com.geracode.javaupskillingroadmap.dojochallenge.Utils.CodeException;
import java.util.Objects;

/**
 * JumpGame Class
 */
public class JumpGame {

    private JumpGame() {
    }

    /**
     * You are given an integer array nums.
     * You are initially positioned at the array's first index, and each element in the array
     * represents your maximum jump length at that position.
     * Return true if you can reach the last index, or false otherwise.
     *
     * Example 1:
     * Input: nums = [2,3,1,1,4]
     * Output: true
     * Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
     *
     * Example 2:
     * Input: nums = [3,2,1,0,4]
     * Output: false
     *
     * Explanation: You will always arrive at index 3 no matter what.
     * Its maximum jump length is 0, which makes it impossible to reach the last index.
     */
    public static boolean canReachLastIndex(int[] nums) {
        if(Objects.isNull(nums) || nums.length == 0) {
            throw new CodeException("The array is null or empty");
        }
        int lastIndex = nums.length - 1;
        int currentValorTemp = 0;
        for(int i = 0; i < nums.length; i++) {
            currentValorTemp = nums[i];
            if ( (i + currentValorTemp) == lastIndex ) {
                return true;
            }
        }
        return false;
    }
}
