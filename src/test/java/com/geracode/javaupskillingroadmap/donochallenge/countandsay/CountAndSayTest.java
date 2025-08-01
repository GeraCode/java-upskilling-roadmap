package com.geracode.javaupskillingroadmap.donochallenge.countandsay;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.geracode.javaupskillingroadmap.dojochallenge.countandsay.CountAndSay;
import com.geracode.javaupskillingroadmap.dojochallenge.Utils.CodeException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CountAndSayTest {

    @ParameterizedTest
    @CsvSource({"4,1211","1,1"})
    void countAndSay(int n , String expectedResultString) {
        var actual= CountAndSay.countAndSay(n);
        assertEquals(expectedResultString,actual);
    }

    @Test
    void countAndSay_n_lessThanZero() {
        var exception = assertThrows(CodeException.class, () -> CountAndSay.countAndSay(-1));
        assertTrue(exception.getMessage().contains("The number must be greater than zero"));
    }
}