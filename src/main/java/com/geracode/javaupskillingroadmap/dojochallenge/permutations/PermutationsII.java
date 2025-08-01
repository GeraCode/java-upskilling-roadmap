package com.geracode.javaupskillingroadmap.dojochallenge.permutations;

import com.geracode.javaupskillingroadmap.dojochallenge.Utils.CodeException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * PermutationsII
 */
public class PermutationsII {

    private PermutationsII() {
    }

    static boolean[] isUsed;
    static List<List<Integer>> permuteList;

    static int[][] permuteArray;

    /**
     *
     * Given a collection of numbers, nums, that might contain duplicates, return all possible unique permutations in any order.
     * Example 1:
     *
     * Input: nums = [1,1,2]
     * Output:
     * [[1,1,2],
     *  [1,2,1],
     *  [2,1,1]]
     * Example 2:
     *
     * Input: nums = [1,2,3]
     * Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
     */
    public static int[][] permuteUnique(int[] nums) {
        if(Objects.isNull(nums) || nums.length==0)
            throw new CodeException("The array is null or empty");
        isUsed = new boolean[nums.length];
        permuteList = new ArrayList<>();
        addElements(new ArrayList<>(), nums);
        permuteArray= new int[permuteList.size()][permuteList.size()];
        for (int z=0; z < permuteList.size(); z++) {
            int[] temp = permuteList.get(z).stream().mapToInt(valor->valor).toArray();
            permuteArray[z]=temp;
        }
        return permuteArray;
    }

    /**
     * recursive method tha help us to add the elements in the list
     * @param tempIntegerList
     * @param nums
     */
    private static void addElements(List<Integer> tempIntegerList, int[] nums){
        if(tempIntegerList.size()==nums.length)
            permuteList.add(new ArrayList<>(tempIntegerList));
        else{
            for(int i = 0; i < nums.length; i++) {
                if((i > 0 && nums[i] == nums[i - 1] && !isUsed[i - 1]) || isUsed[i]){
                    continue;
                }
                tempIntegerList.add(nums[i]);
                isUsed[i] = true;

                addElements(tempIntegerList, nums);
                tempIntegerList.remove(tempIntegerList.size()-1);

                isUsed[i] = false;
            }
        }
    }
}




