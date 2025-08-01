package com.geracode.javaupskillingroadmap.donochallenge.uglynumber;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.geracode.javaupskillingroadmap.dojochallenge.uglynumber.UglyNumber;
import com.geracode.javaupskillingroadmap.dojochallenge.Utils.CodeException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class UglyNumberTest {

    @ParameterizedTest
    @CsvSource({"10,12","1,1"})
    void findNthUglyNumber(int n, int expectedNthUglyNumber) {
      var actual = UglyNumber.findNthUglyNumber(n);
      assertEquals(expectedNthUglyNumber, actual);
    }

    @Test
    void findNthUglyNumber_negativeNumber() {
        var exception = assertThrows(CodeException.class, () -> UglyNumber.findNthUglyNumber(-1));
        assertTrue(exception.getMessage().contains("The number must be greater than zero"));
    }
}