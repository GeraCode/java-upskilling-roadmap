package com.geracode.javaupskillingroadmap.donochallenge.searchsortedarray;

import static org.junit.jupiter.api.Assertions.*;

import com.geracode.javaupskillingroadmap.dojochallenge.searchsortedarray.SearchRotatedSortedArray;
import com.geracode.javaupskillingroadmap.dojochallenge.Utils.CodeException;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SearchRotatedSortedArrayTest {

    private int[] expectedArrayCase1;
    private int[] expectedArrayCase2;
    private int[] expectedArrayCase3;

    @BeforeEach
    void setUp() {
        expectedArrayCase1=new int [] {4,5,6,7,0,1,2};
        expectedArrayCase2=new int [] {4,5,6,7,0,1,2};
        expectedArrayCase3=new int [] {1};
    }

    @ParameterizedTest
    @CsvSource({"0"})
    void searchRotatedSortedByArrayAndTarget_Case1_OK(int target) {
        double startTime = System.currentTimeMillis();

        var actual= SearchRotatedSortedArray.searchRotatedSortedByArrayAndTarget(expectedArrayCase1,target);
        assertEquals(4,actual);

        double endTime = System.currentTimeMillis();
        System.out.print("The time in milliseconds is =>  "+(endTime - startTime));
        System.out.println("\nInput: nums = "+Arrays.toString(expectedArrayCase1)+", target = "+target+"\nOutput: "+actual );
    }

    @ParameterizedTest
    @CsvSource({"3"})
    void searchRotatedSortedByArrayAndTarget_Case2_OK(int target) {
        double startTime = System.currentTimeMillis();

        var actual= SearchRotatedSortedArray.searchRotatedSortedByArrayAndTarget(expectedArrayCase2,target);
        assertEquals(-1,actual);

        double endTime = System.currentTimeMillis();
        System.out.print("The time in milliseconds is =>  "+(endTime - startTime));
        System.out.println("\nInput: nums = "+Arrays.toString(expectedArrayCase2)+", target = "+target+"\nOutput: "+actual );
    }

    @ParameterizedTest
    @CsvSource({"0"})
    void searchRotatedSortedByArrayAndTarget_Case3_OK(int target) {
        double startTime = System.currentTimeMillis();

        var actual= SearchRotatedSortedArray.searchRotatedSortedByArrayAndTarget(expectedArrayCase3,target);
        assertEquals(-1,actual);

        double endTime = System.currentTimeMillis();
        System.out.print("The time in milliseconds is =>  "+(endTime - startTime));
        System.out.println("\nInput: nums = "+Arrays.toString(expectedArrayCase3)+", target = "+target+"\nOutput: "+actual +"\n");
    }

    @Test
    void getLongestConsecutiveSequence_ArrayNull() {
        var exception = assertThrows(CodeException.class, () -> SearchRotatedSortedArray.searchRotatedSortedByArrayAndTarget(null,100));
        assertTrue(exception.getMessage().contains("The array is null or empty"));
    }

    @Test
    void getLongestConsecutiveSequence_ArrayEmpty() {
        var exception = assertThrows(CodeException.class, () -> SearchRotatedSortedArray.searchRotatedSortedByArrayAndTarget(new int[]{},100));
        assertTrue(exception.getMessage().contains("The array is null or empty"));
    }
}