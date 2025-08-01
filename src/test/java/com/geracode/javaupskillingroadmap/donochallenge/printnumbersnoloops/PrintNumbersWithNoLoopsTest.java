package com.geracode.javaupskillingroadmap.donochallenge.printnumbersnoloops;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.geracode.javaupskillingroadmap.dojochallenge.printnumbersnoloops.PrintNumbersWithNoLoops;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class PrintNumbersWithNoLoopsTest {

    private static final java.io.ByteArrayOutputStream OUTPUT_STREAM = new java.io.ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new java.io.PrintStream(OUTPUT_STREAM));
    }

    @AfterEach
    public void tearDown() {
        OUTPUT_STREAM.reset();
    }

    private String getOutput() {
        return OUTPUT_STREAM.toString();
    }


    @ParameterizedTest
    @CsvSource({"0 , 10, '012345678910'",
                "-3 , 1,'-3-2-101'",
                "5,5,5"})
    void printRange(int startNumber , int lastNumber, String expectedPrint) {
        PrintNumbersWithNoLoops.printRange(startNumber , lastNumber);
        assertEquals(expectedPrint , getOutput());
    }

}