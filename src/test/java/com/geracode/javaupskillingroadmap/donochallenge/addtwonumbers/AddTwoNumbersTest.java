package com.geracode.javaupskillingroadmap.donochallenge.addtwonumbers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.geracode.javaupskillingroadmap.dojochallenge.addtwonumbers.AddTwoNumbers;
import com.geracode.javaupskillingroadmap.dojochallenge.addtwonumbers.ListNote;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AddTwoNumbersTest {

    private ListNote expectedListNote1;
    private ListNote expectedListNote2;
    private ListNote expectedListNote3;
    private ListNote expectedListNote4;
    private ListNote expectedListNote5;
    private ListNote expectedListNote6;

    private ListNote expectedResultListNote_case1;
    private ListNote expectedResultListNote_case2;
    private ListNote expectedResultListNote_case3;


    @BeforeEach
    void setUp() {
        expectedListNote1 = new ListNote(243);
        expectedListNote2 = new ListNote(564);
        expectedListNote3 = new ListNote(0);
        expectedListNote4 = new ListNote(0);
        expectedListNote5 = new ListNote(9999999);
        expectedListNote6 = new ListNote(9999);

        expectedResultListNote_case1 = new ListNote(7);
        expectedResultListNote_case1.setNext(new ListNote(0));
        expectedResultListNote_case1.getNext().setNext(new ListNote(8));

        expectedResultListNote_case2 = new ListNote(0);

        expectedResultListNote_case3 = new ListNote(8);
        expectedResultListNote_case3.setNext(new ListNote(9));
        expectedResultListNote_case3.getNext().setNext(new ListNote(9));
        expectedResultListNote_case3.getNext().getNext().setNext(new ListNote(9));
        expectedResultListNote_case3.getNext().getNext().getNext().setNext(new ListNote(0));
        expectedResultListNote_case3.getNext().getNext().getNext().getNext().setNext(new ListNote(0));
        expectedResultListNote_case3.getNext().getNext().getNext().getNext().getNext().setNext(new ListNote(0));
        expectedResultListNote_case3.getNext().getNext().getNext().getNext().getNext().getNext().setNext(new ListNote(1));
    }

    @Test
    void addTwoNumbers_Case1() {
        var actual = AddTwoNumbers.addTwoNumbers(expectedListNote1, expectedListNote2);
        assertEquals(actual.getVal(), expectedResultListNote_case1.getVal());
        assertEquals(actual.getNext().getVal(), expectedResultListNote_case1.getNext().getVal());
        assertEquals(actual.getNext().getNext().getVal(), expectedResultListNote_case1.getNext().getNext().getVal());
    }

    @Test
    void addTwoNumbers_Case2() {
        var actual = AddTwoNumbers.addTwoNumbers(expectedListNote3, expectedListNote4);
        assertEquals(actual.getVal(), expectedResultListNote_case2.getVal());
    }

    @Test
    void addTwoNumbers_case3_OK() {
        var actual = AddTwoNumbers.addTwoNumbers(expectedListNote5, expectedListNote6);
        assertEquals(actual.getVal(), expectedResultListNote_case3.getVal());
        assertEquals(actual.getNext().getVal(), expectedResultListNote_case3.getNext().getVal());
        assertEquals(actual.getNext().getNext().getVal(), expectedResultListNote_case3.getNext().getNext().getVal());
        assertEquals(actual.getNext().getNext().getNext().getVal(),
                expectedResultListNote_case3.getNext().getNext().getNext().getVal());
        assertEquals(actual.getNext().getNext().getNext().getNext().getVal(),
                expectedResultListNote_case3.getNext().getNext().getNext().getNext().getVal());
        assertEquals(actual.getNext().getNext().getNext().getNext().getNext().getVal(),
                expectedResultListNote_case3.getNext().getNext().getNext().getNext().getNext().getVal());
        assertEquals(actual.getNext().getNext().getNext().getNext().getNext().getNext().getVal(),
                expectedResultListNote_case3.getNext().getNext().getNext().getNext().getNext().getNext().getVal());
        assertEquals(actual.getNext().getNext().getNext().getNext().getNext().getNext().getNext().getVal(),
                expectedResultListNote_case3.getNext().getNext().getNext().getNext().getNext().getNext().getNext().getVal());
    }
}