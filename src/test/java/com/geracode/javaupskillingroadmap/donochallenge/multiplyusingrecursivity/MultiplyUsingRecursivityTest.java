package com.geracode.javaupskillingroadmap.donochallenge.multiplyusingrecursivity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.geracode.javaupskillingroadmap.dojochallenge.multiplyusingrecursivity.MultiplyUsingRecursivity;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class MultiplyUsingRecursivityTest {

    @ParameterizedTest
    @CsvSource({"4,5,20" , "-4,5,-20" , "4,-5,-20" , "-4,-5,20" , "1, 5,5" , "0,5,0"})
    void multiplyTwoNumbers(int num1, int num2, int expectedResult) {
        var actual = MultiplyUsingRecursivity.multiplyTwoNumbers(num1, num2);
        assertEquals(actual, expectedResult);
    }

}