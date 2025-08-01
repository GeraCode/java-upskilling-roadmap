package com.geracode.javaupskillingroadmap.dojochallenge.verifynumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;

import com.geracode.javaupskillingroadmap.dojochallenge.Utils.CodeException;
import lombok.extern.log4j.Log4j2;


/**
 * Verify Number With Operations
 */
@Log4j2
public class VerifyNumberWithOperations {

    // Method to know if the operation reach the target
    public static boolean reachTarget(int[] nums, int target){
        if(Objects.isNull(nums) || nums.length == 0) {
            throw new CodeException("The array is null or empty");
        }
        log.info("\nMy Array: {}", Arrays.toString(nums));
        log.info("\nPermutations :");
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> listList = obtainPermutations(nums);
        listList.forEach(log::info);
        for (List<Integer> integerList : listList) {
            int sum1 = integerList.get(0) + integerList.get(1);
            int subtract1 = integerList.get(0) - integerList.get(1);
            int sum2 = 0;
            int subtract2 = 0;
            if((integerList.size() % 2) == 0) {
                sum2 = integerList.get(2)+ integerList.get(3);
                subtract2 = integerList.get(2) - integerList.get(3);

                list.add(integerList.get(0) + (integerList.get(1) * sum2));
                list.add(integerList.get(0) - (integerList.get(1) * subtract2));
                if (integerList.get(1) > 0) {
                    list.add(integerList.get(0) + (integerList.get(1) / sum2));
                    list.add(integerList.get(0) - (integerList.get(1) / subtract2));
                }
                list.add(sum1 * sum2);
                list.add(subtract1 * subtract2);
                if (sum1 > 0 && subtract1 > 0) {
                    list.add(sum1 / sum2);
                    list.add(subtract1 / subtract2);
                }
            }else{
                sum2 = integerList.get(1)+ integerList.get(2);
                subtract2 = integerList.get(1) - integerList.get(2);
                list.add(sum1 * integerList.get(2));
                list.add(subtract1 * integerList.get(2));
                if (sum1 > 0 && subtract1 > 0) {
                    list.add(sum1 / integerList.get(2));
                    list.add(subtract1 / integerList.get(2));
                }
                list.add(integerList.get(0) * sum2);
                list.add(integerList.get(0) * subtract2);
                if (integerList.get(0) > 0) {
                    list.add(integerList.get(0) / sum2);
                    list.add(integerList.get(0) / subtract2);
                }
            }
        }
        for (int num : list) {
            if (num == target ) {
                return true;
            }
        }
        return false;
    }



    // Method to calculate permutations of an array.
    public static List<List<Integer>> obtainPermutations(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        permute( nums,0, result);
        return result;
    }

    // Recursive method to generate permutations.
    private static void permute( int[] nums,int firstIndex, List<List<Integer>> result) {
        if (firstIndex == nums.length - 1) {
            List<Integer> list = new ArrayList<>();
            IntStream.of(nums).forEach(list::add);
            result.add(list);
        } else {
            for (int j = firstIndex; j < nums.length; j++) {
                int temp = nums[j];
                nums[j] = nums[firstIndex];
                nums[firstIndex] = temp;
                permute( nums,firstIndex + 1, result);
                temp = nums[j];
                nums[j] = nums[firstIndex];
                nums[firstIndex] = temp;
            }
        }
    }


}


