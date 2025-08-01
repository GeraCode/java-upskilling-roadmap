package com.geracode.javaupskillingroadmap.donochallenge.minimumwindowsubstring;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.geracode.javaupskillingroadmap.dojochallenge.minimumwindowsubstring.MinimumWindowSubstring;
import com.geracode.javaupskillingroadmap.dojochallenge.Utils.CodeException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class MinimumWindowSubstringTest {

    @ParameterizedTest
    @CsvSource({"ADOBECODEBANC,ABC,BANC",
                "MARCHMONDAYCARRIED,AHC,ARCH",
                "HOUSEMARRIEDCUSTOM,IEMD,MARRIED",
                "EFGHABCIO,ABC,ABC"})
    void minWindowSubstring(String s, String t, String expectedString) {
        var actual= MinimumWindowSubstring.minWindowSubstring(s,t);
        assertEquals(expectedString,actual);
    }


    @Test
    void minWindowSubstring_S_Null() {
        var exception = assertThrows(CodeException.class, () -> MinimumWindowSubstring.minWindowSubstring(null,"A"));
        assertTrue(exception.getMessage().contains("The String is null or empty"));
    }

    @Test
    void minWindowSubstring_T_Null() {
        var exception = assertThrows(CodeException.class, () -> MinimumWindowSubstring.minWindowSubstring("A",null));
        assertTrue(exception.getMessage().contains("The String is null or empty"));
    }

    @Test
    void minWindowSubstring_S_Empty() {
        var exception = assertThrows(CodeException.class, () -> MinimumWindowSubstring.minWindowSubstring("","A"));
        assertTrue(exception.getMessage().contains("The String is null or empty"));
    }
    @Test
    void minWindowSubstring_T_Empty() {
        var exception = assertThrows(CodeException.class, () -> MinimumWindowSubstring.minWindowSubstring("A",""));
        assertTrue(exception.getMessage().contains("The String is null or empty"));
    }

}