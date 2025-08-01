package com.geracode.javaupskillingroadmap.dojochallenge.printnumbersnoloops;

/**
 * Print Numbers With No Loops Class
 */
public class PrintNumbersWithNoLoops{

    private PrintNumbersWithNoLoops() {
    }

    /**
     * Method that prints all numbers in a range
     * @param startNumber int
     * @param lastNumber int
     */
    public static void printRange(int startNumber, int lastNumber){
        System.out.print(startNumber);
        if (startNumber < lastNumber) {
            printRange(startNumber + 1 , lastNumber);
        }
    }
}