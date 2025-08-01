package com.geracode.javaupskillingroadmap.dojochallenge.countandsay;

import com.geracode.javaupskillingroadmap.dojochallenge.Utils.CodeException;

/**
 *  Count And Say Class
 */
public class CountAndSay {

    /**
     * The count-and-say sequence is a sequence of digit strings defined by the recursive formula:
     *
     * countAndSay(1) = "1"
     * countAndSay(n) is the way you would "say" the digit string from countAndSay(n-1), which is then converted into a
     * different digit string. To determine how you "say" a digit string, split it into the minimal number of substrings such
     * that each substring contains exactly one unique digit. Then for each substring, say the number of digits, then
     * say the digit. Finally, concatenate every said digit.
     *
     * For example:
     *  the saying and conversion for digit string "3322251":
     *  Given a positive integer n
     *  return the nth term of the count-and-say sequence.
     *
     * @param n input number
     * @return String with the sequence
     */
    public static String countAndSay(int n) {
        if(n < 1) {
            throw new CodeException("The number must be greater than zero");
        } else if(n ==1 ) {
            return "1";
        }else {
            String recursiveString = countAndSay(n - 1);
            StringBuilder tempString= new StringBuilder();
            int count = 1, i = 1;
            for (; i < recursiveString.length(); i ++) {
                if (recursiveString.charAt(i) == recursiveString.charAt(i - 1))
                    ++count;
                else {
                    tempString.append(count).append(recursiveString.charAt(i - 1));
                    count = 1;
                }
            }
            tempString.append(count).append(recursiveString.charAt(i - 1));
            return tempString.toString();
        }
    }
}
