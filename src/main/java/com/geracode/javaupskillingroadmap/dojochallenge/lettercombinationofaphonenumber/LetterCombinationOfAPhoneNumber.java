package com.geracode.javaupskillingroadmap.dojochallenge.lettercombinationofaphonenumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Letter Combinations of a Phone Number
 */
public class LetterCombinationOfAPhoneNumber {
    private static final Map<Integer,String> LETTER_MAP= Map.of(2, "abc",
                                                                3,"def",
                                                                4,"ghi",
                                                                5,"jkl",
                                                                6,"mno",
                                                                7,"pqrs",
                                                                8,"tuv",
                                                                9,"wxyz");
    private LetterCombinationOfAPhoneNumber() {
    }

    /**
     * Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.
     * A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
     *
     * Example 1:
     * Input: digits = "23"
     * Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
     *
     * Example 2:
     * Input: digits = ""
     * Output: []
     *
     * Example 3:
     * Input: digits = "2"
     * Output: ["a","b","c"]
     */
    public static String[] letterCombinations(String digits) {
        List<String> combinatiosList = new ArrayList<>();
        combinations(combinatiosList, digits, 0, "");
        Collections.sort(combinatiosList);
        return combinatiosList.toArray(new String[0]);
    }
    private static void combinations(List<String> list, String digits, int index, String tempCombination){
        if(digits.length()==index){
            list.add(tempCombination);
            return;
        }
        int digitsCurrentValor = digits.charAt(index)-'0';
        for(int i=0; i<LETTER_MAP.get(digitsCurrentValor).length(); i++) {
            combinations(list, digits, index+1, tempCombination+LETTER_MAP.get(digitsCurrentValor).charAt(i));
        }
    }

}
