package com.geracode.javaupskillingroadmap.dojochallenge.minimumwindowsubstring;

import com.geracode.javaupskillingroadmap.dojochallenge.Utils.CodeException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Minimum Window Substring class
 */
public class MinimumWindowSubstring {


    public static String minWindowSubstring(String s, String t) {
        if (Objects.isNull(s) || Objects.isNull(t) || s.isBlank() || t.isEmpty()) {
            throw new CodeException("The String is null or empty");
        }

        Map<Character, Integer> target = new HashMap<>();
        //save the target characters in the map
        for (char ch : t.toCharArray()) {
            target.put(ch, target.getOrDefault(ch, 0) + 1);
        }

        int intMaxValue = Integer.MAX_VALUE, beginIndex = 0, lastIndex = 0, count = 0;
        String minSubString = "";

        //Map that saves the SubStrings that contains the target characters
        Map<Character, Integer> windowCounts = new HashMap<>();

        while (lastIndex < s.length()) {
            //saves the target characters in the map
            char ch = s.charAt(lastIndex);
            windowCounts.put(ch, windowCounts.getOrDefault(ch, 0) + 1);
            //counts how many target characters there are in the SubString
            if (target.containsKey(ch) && windowCounts.get(ch).equals(target.get(ch))) {
                count++;
            }
            while (count == target.size() && beginIndex <= lastIndex ) {
                //increase one because the index is zero and needs to obtain the size of the SubString
                int lengthSubString = lastIndex +1;

                int partialLengthSubString = lengthSubString - beginIndex;

                //obtains the substring if the partialSubstring is the least length
                if (partialLengthSubString < intMaxValue) {
                    intMaxValue = partialLengthSubString;
                    minSubString = s.substring(beginIndex, lengthSubString);
                }
                char leftChar = s.charAt(beginIndex);
                windowCounts.put(leftChar, windowCounts.get(leftChar) - 1);
                if (target.containsKey(leftChar) && windowCounts.get(leftChar) < target.get(leftChar)) {
                    count--;
                }
                beginIndex++;
            }
            lastIndex++;
        }
        return minSubString;
    }
}
