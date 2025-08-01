package com.geracode.javaupskillingroadmap.donochallenge.twosumiidatastructure;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.geracode.javaupskillingroadmap.dojochallenge.twosumiidatastructure.TwoSumIIDataStructureDesign;
import com.geracode.javaupskillingroadmap.dojochallenge.Utils.CodeException;
import java.util.LinkedList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TwoSumIIDataStructureDesignTest {

    private int[] nums;

    private List<Integer> expectedIntegerList;

    @BeforeEach
    void setUp() {
       nums = new int[]{2,7,11,15};

       expectedIntegerList = new LinkedList<>();
       expectedIntegerList.add(1);
       expectedIntegerList.add(2);
    }

    @ParameterizedTest
    @CsvSource({"9"})
    void twoSum(int target) {
        var actual= TwoSumIIDataStructureDesign.getIndexSumTwoNumbersEqualsToTarget(nums,target);
        assertEquals(expectedIntegerList,actual);
    }

    @Test
    void twoSum_ArrayNull() {
        var exception = assertThrows(CodeException.class, () -> TwoSumIIDataStructureDesign.getIndexSumTwoNumbersEqualsToTarget(null,0));
        assertTrue(exception.getMessage().contains("The array is null or empty"));
    }

    @Test
    void twoSum_ArrayEmpty() {
        var exception = assertThrows(CodeException.class, () -> TwoSumIIDataStructureDesign.getIndexSumTwoNumbersEqualsToTarget(new int[]{},0));
        assertTrue(exception.getMessage().contains("The array is null or empty"));
    }
}