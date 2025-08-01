package com.geracode.javaupskillingroadmap.donochallenge.lettercombinationofaphonenumber;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import com.geracode.javaupskillingroadmap.dojochallenge.lettercombinationofaphonenumber.LetterCombinationOfAPhoneNumber;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class LetterCombinationOfAPhoneNumberTest {

    private String[] expectedArrayCase1;
    private String[] expectedArrayCase2;
    @BeforeEach
    void setUp() {
        expectedArrayCase1= new String[]{"ad","ae","af","bd","be","bf","cd","ce","cf"};
        expectedArrayCase2= new String[]{"a","b","c"};
    }

    @ParameterizedTest
    @CsvSource({"23"})
    void letterCombinations_Case1_OK(String input) {
        var actual= LetterCombinationOfAPhoneNumber.letterCombinations(input);
        assertArrayEquals(expectedArrayCase1,actual);

        System.out.println("\nInput: digits = "+input+"\nOutput: "+ Arrays.toString(actual));
    }

    @ParameterizedTest
    @CsvSource({"2"})
    void letterCombinations_Case2_OK(String input) {
        String[] actual= LetterCombinationOfAPhoneNumber.letterCombinations(input);
        assertArrayEquals(expectedArrayCase2,actual);

        System.out.println("\nInput: digits = "+input+"\nOutput: "+ Arrays.toString(actual));
    }
}