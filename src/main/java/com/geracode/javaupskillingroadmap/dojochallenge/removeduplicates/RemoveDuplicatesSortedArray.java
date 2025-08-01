package com.geracode.javaupskillingroadmap.dojochallenge.removeduplicates;

import java.util.Arrays;
import java.util.Objects;
import java.util.function.IntFunction;
import java.util.stream.IntStream;

import com.geracode.javaupskillingroadmap.dojochallenge.Utils.CodeException;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class RemoveDuplicatesSortedArray {
    private RemoveDuplicatesSortedArray() {
    }

    private static IntFunction<IntStream> intStreamIntFunction = value -> { log.info(value);
                                                                            return IntStream.of(value);
                                                                          };
    public static int[] removeDuplicates(int[] nums) {
        if(Objects.isNull(nums) || nums.length == 0) {
            throw new CodeException("The array is null or empty");
        }
        return Arrays.stream(nums).distinct().sorted().flatMap(intStreamIntFunction).toArray();
    }
}
