package com.geracode.javaupskillingroadmap.donochallenge.jumpgame;

import static org.junit.jupiter.api.Assertions.*;

import com.geracode.javaupskillingroadmap.dojochallenge.jumpgame.JumpGame;
import com.geracode.javaupskillingroadmap.dojochallenge.Utils.CodeException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JumpGameTest {

    private int[] expectedArray_Case1;
    private int[] expectedArray_Case2;

    @BeforeEach
    void setUp() {
         expectedArray_Case1 = new int [] {2,3,1,1,4};
         expectedArray_Case2 = new int [] {3,2,1,0,4};
    }

    @Test
    void canReachLastIndex_Case1_True() {
        var actual = JumpGame.canReachLastIndex(expectedArray_Case1);
        assertTrue(actual);
    }

    @Test
    void canReachLastIndex_Case2_False() {
        var actual = JumpGame.canReachLastIndex(expectedArray_Case2);
        assertFalse(actual);
    }

    @Test
    void canReachLastIndex_ArrayNull() {
        var exception = assertThrows(CodeException.class, () -> JumpGame.canReachLastIndex(null));
        assertTrue(exception.getMessage().contains("The array is null or empty"));
    }

    @Test
    void canReachLastIndex_ArrayEmpty() {
        var exception = assertThrows(CodeException.class, () -> JumpGame.canReachLastIndex(new int[]{}));
        assertTrue(exception.getMessage().contains("The array is null or empty"));
    }

}