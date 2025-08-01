package com.geracode.javaupskillingroadmap.dojochallenge.multiplyusingrecursivity;

/**
 * 	Multiply Using Recursivity without multiply operator
 */
public class MultiplyUsingRecursivity {
    private MultiplyUsingRecursivity() {
    }

    /**
     * 	Multiply Using Recursivity Without Multiply Operator Method
     * @param num1 int number
     * @param num2 int number
     * @return int result with the multiplyTwoNumbers Using Recursivity without multiply operator
     * <br><b>Given two integers, use a recursive function to multiply them without using the multiplication operator. Integers can be positive or negative or zeros.</b>
     * <br>&nbsp*  Result Examples:
     * <pre>   Multiply( 4, 5) ->   20</pre>
     * <pre>   Multiply(-4, 5) ->  -20</pre>
     * <pre>   Multiply( 4,-5) ->  -20</pre>
     * <pre>   Multiply(-4,-5) ->   20</pre>
     * <pre>   Multiply( 1, 5) ->    5</pre>
     * <pre>   Multiply( 0, 5) ->    0</pre>
     */
    public static int multiplyTwoNumbers(int num1, int num2){
        if (num1 == 0 || num2 == 0){
            return 0;
        } else if (num2 < 0) {
            return -multiplyTwoNumbers(num1 , -num2);
        }else {
            return (num1 + multiplyTwoNumbers(num1 , num2 - 1));
        }
    }

}