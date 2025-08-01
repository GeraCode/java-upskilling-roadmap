package com.geracode.javaupskillingroadmap.dojochallenge.rotateArray;

/**
 * Rotate Array
 */
public class RotateArray {
    private RotateArray() {
    }

    /**
     * Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
     *
     * Example 1:
     * Input: nums = [1,2,3,4,5,6,7], k = 3
     * Output: [5,6,7,1,2,3,4]
     * Explanation:
     * rotate 1 steps to the right: [7,1,2,3,4,5,6]
     * rotate 2 steps to the right: [6,7,1,2,3,4,5]
     * rotate 3 steps to the right: [5,6,7,1,2,3,4]
     *
     * Example 2:
     * Input: nums = [-1,-100,3,99], k = 2
     * Output: [3,99,-1,-100]
     * Explanation:
     * rotate 1 steps to the right: [99,-1,-100,3]
     * rotate 2 steps to the right: [3,99,-1,-100]
     */
    public static int[] rotateArray(int[] nums, int k) {
        reverseArray(nums, 0, nums.length - 1);
        reverseArray(nums, 0, (k % nums.length) - 1);
        reverseArray(nums, k, nums.length - 1);
        return nums;
    }

    private static void reverseArray(int[] nums, int firstNumber, int lastNumber) {
        while (firstNumber < lastNumber) {
            int tempNumber = nums[firstNumber];
            nums[firstNumber] = nums[lastNumber];
            nums[lastNumber] = tempNumber;
            firstNumber++;
            lastNumber--;
        }
    }
}
