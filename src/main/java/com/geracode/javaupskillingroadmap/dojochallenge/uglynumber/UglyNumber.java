package com.geracode.javaupskillingroadmap.dojochallenge.uglynumber;


import com.geracode.javaupskillingroadmap.dojochallenge.Utils.CodeException;

/**
 * Ugly number class
 */
public class UglyNumber {

    /**
     * An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.
     * Given an integer n, return the nth ugly number.
     * Example 1:
     * Input: n = 10
     * Output: 12
     * Explanation: [1, 2, 3, 4, 5, 6, 8, 9, 10, 12] is the sequence of the first 10 ugly numbers.
     * Example 2:
     * Input: n = 1
     * Output: 1
     * Explanation: 1 has no prime factors, therefore all of its prime factors are limited to 2, 3, and 5.
     */
    public static int findNthUglyNumber(int n) {
        if (n <= 0) {
            throw new CodeException("The number must be greater than zero");
        }

        int[] uglyNumbersArray = new int[n];
        uglyNumbersArray[0] = 1;
        int index2 = 0, index3 = 0, index5 = 0;
        int factor2 = 2, factor3 = 3, factor5 = 5;

        for (int i = 1; i < n; i++) {
            int min = Math.min(Math.min(factor2, factor3), factor5);
            uglyNumbersArray[i] = min;
            if (min == factor2) {
                factor2 = 2 * uglyNumbersArray[++index2];
            }
            if (min == factor3) {
                factor3 = 3 * uglyNumbersArray[++index3];
            }
            if (min == factor5) {
                factor5 = 5 * uglyNumbersArray[++index5];
            }
        }

        return uglyNumbersArray[n - 1];
    }
}
