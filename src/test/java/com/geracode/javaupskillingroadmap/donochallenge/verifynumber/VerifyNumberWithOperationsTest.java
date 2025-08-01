package com.geracode.javaupskillingroadmap.donochallenge.verifynumber;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.geracode.javaupskillingroadmap.dojochallenge.verifynumber.VerifyNumberWithOperations;
import com.geracode.javaupskillingroadmap.dojochallenge.Utils.CodeException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class VerifyNumberWithOperationsTest {

    private int[] numsCase1;
    private int[] numsCase2;
    private int[] numsCase3;

    @BeforeEach
    void setUp() {
        numsCase1 = new int[] {1, 2, 3, 4};
        numsCase2 = new int[] {4, 3, 2, 5};
        numsCase3 = new int[] {3,4,2};

    }

    @ParameterizedTest
    @CsvSource({"21"})
    void reachTarget_case1_True(int target) {
        var actual = VerifyNumberWithOperations.reachTarget(numsCase1,target);
        assertTrue(actual);
        System.out.println("\nMy Array reach the target"+target+" => " +actual);

    }

    @ParameterizedTest
    @CsvSource({"33"})
    void reachTarget_case2_True(int target) {
        var actual = VerifyNumberWithOperations.reachTarget(numsCase2,target);
        assertTrue(actual);
        System.out.println("\nMy Array reach the target"+target+" => " +actual);
    }

    @ParameterizedTest
    @CsvSource({"5"})
    void reachTarget_case3_False(int target) {
        var actual = VerifyNumberWithOperations.reachTarget(numsCase3,target);
        assertFalse(actual);
        System.out.println("\nMy Array reach the target"+target+" => " +actual);
    }

    @Test
    void reachTarget_ArrayNull() {
        var exception = assertThrows(CodeException.class, () -> VerifyNumberWithOperations.reachTarget(null,0));
        assertTrue(exception.getMessage().contains("The array is null or empty"));
    }

    @Test
    void reachTarget_ArrayEmpty() {
        var exception = assertThrows(CodeException.class, () -> VerifyNumberWithOperations.reachTarget(new int[]{}, 0));
        assertTrue(exception.getMessage().contains("The array is null or empty"));
    }
}