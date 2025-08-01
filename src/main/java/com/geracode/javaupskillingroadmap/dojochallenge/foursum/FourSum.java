package com.geracode.javaupskillingroadmap.dojochallenge.foursum;

import com.geracode.javaupskillingroadmap.dojochallenge.Utils.CodeException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * 4Sum class
 */
public class FourSum {

    private FourSum() {
    }

     /**
     * Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:
     * 0 <= a, b, c, d < n
     * a, b, c, and d are distinct.
     *
     * nums[a] + nums[b] + nums[c] + nums[d] == target
     * You may return the answer in any order.
     *
     * nums[a] + nums[b] + nums[c] + nums[d] == target
     * You may return the answer in any order.
     *
     * Example 1:
     *
     * Input: nums = [1,0,-1,0,-2,2], target = 0
     * Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
     *
     * Example 2:
     * Input: nums = [2,2,2,2,2], target = 8
     * Output: [[2,2,2,2]]
     */
     public static int[][] fourSum(int[] nums, int target){
        List<List<Integer>> quadruplets = new ArrayList<>();

        if(Objects.isNull(nums) || nums.length==0)
             throw new CodeException("The array is null or empty");
        if(nums.length < 4)
            throw new CodeException("The array must be at least size 4.");

        Arrays.sort(nums);

        for(int i=0; i<nums.length; i++) {
            if(i != 0 && nums[i] == nums[i-1])
                continue;
            for(int j=i+1; j<nums.length; j++) {
                if(j != i+1 && nums[j] == nums[j-1])
                    continue;
                int indexLeft = j+1;
                int indexRight = nums.length-1;
                while(indexLeft < indexRight) {
                    int sum = nums[i] + nums[j] + nums[indexLeft] +nums [indexRight];
                    if(sum==target) {
                        quadruplets.add(List.of(nums[i], nums[j], nums[indexLeft], nums[indexRight]));
                        indexLeft += 1;
                        indexRight -= 1;
                    }else if(sum<target)
                        indexLeft += 1;
                    else
                        indexRight -= 1;
                }
            }
        }
        System.out.println("Output: ");
        quadruplets.forEach(System.out::println);
        int[][] quadrupletsArray= new int[quadruplets.size()][quadruplets.get(0).size()];
        for (int index=0; index < quadruplets.size(); index++) {
             int[] temp = quadruplets.get(index).stream().mapToInt(valor->valor).toArray();
             quadrupletsArray[index]=temp;
        }
        return quadrupletsArray;
    }

}
