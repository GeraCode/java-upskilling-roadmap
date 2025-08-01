package com.geracode.javaupskillingroadmap.dojochallenge.longestconsecutivesequence;

import com.geracode.javaupskillingroadmap.dojochallenge.Utils.CodeException;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Longest Consecutive Sequence Class
 * @author gerardo.salvador
 */
public class LongestConsecutiveSequence {

    private LongestConsecutiveSequence() {
    }

    /**
     * Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
     * You must write an algorithm that runs in O(n) time.
     *
     * Example 1:
     * Input: nums = [100,4,200,1,3,2]
     * Output: 4
     * Explanation: The longest consecutive elements sequence is [1, 2, 3, 4].
     * Therefore its length is 4.
     *
     * Example 2:
     * Input: nums = [0,3,7,2,5,8,4,6,0,1]
     * Output: 9
     */
    public static int getLongestConsecutiveSequence(int[] nums){
        double startTime = System.currentTimeMillis();
        if(Objects.isNull(nums) || nums.length == 0) {
            throw new CodeException("The array is null or empty");
        }
        int longestConsecutiveSequence = 0;
        Set<Integer> integerHashSet = new HashSet<>();
        for (int num : nums) {
            integerHashSet.add(num);
        }
        for (int num : integerHashSet) {
            if (!integerHashSet.contains(num - 1)) {
                int currentNum = num;
                int countConsecutiveSequence = 1;
                while (integerHashSet.contains(currentNum + 1)) {
                    currentNum++;
                    countConsecutiveSequence++;
                }
                longestConsecutiveSequence = Math.max(longestConsecutiveSequence, countConsecutiveSequence);
            }
        }
        double endTime = System.currentTimeMillis();
        System.out.print("The time in milliseconds is =>  "+(endTime - startTime));
        return longestConsecutiveSequence;
    }
}
