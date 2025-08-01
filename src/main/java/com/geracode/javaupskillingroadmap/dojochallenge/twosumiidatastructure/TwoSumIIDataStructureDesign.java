package com.geracode.javaupskillingroadmap.dojochallenge.twosumiidatastructure;

import com.geracode.javaupskillingroadmap.dojochallenge.Utils.CodeException;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class TwoSumIIDataStructureDesign {

    private TwoSumIIDataStructureDesign() {
    }

    public static List<Integer> getIndexSumTwoNumbersEqualsToTarget(int[] nums, int target) {
        if(Objects.isNull(nums) || nums.length == 0) {
            throw new CodeException("The array is null or empty");
        }
        List<Integer> integerLinkedList = new LinkedList<>();
        for(int i = 0; i < nums.length-1; i++){
            int find = target - nums[i];
            for(int j = i + 1; j < nums.length; j++){
                if(nums[j] == find){
                    integerLinkedList.add(i+1);
                    integerLinkedList.add(j + 1);
                }else if(nums[j] > find) {
                    break;
                }
            }
        }
        return integerLinkedList;
    }
}
