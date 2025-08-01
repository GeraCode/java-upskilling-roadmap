package com.geracode.javaupskillingroadmap.donochallenge.minstack;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.geracode.javaupskillingroadmap.dojochallenge.minstack.MinStack;
import com.geracode.javaupskillingroadmap.dojochallenge.minstack.Node;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class MinStackTest {

    @InjectMocks
    private MinStack MinStack;

    private Node expecetdNode;

    @Test
    void push() {
        expecetdNode=new Node(1,expecetdNode);
        expecetdNode=new Node(2,expecetdNode);
        expecetdNode=new Node(3,expecetdNode);
        MinStack.push(1);
        MinStack.push(2);
        MinStack.push(3);
        assertEquals(expecetdNode,MinStack.getNodeStack());
    }



    @Test
    void pop() {
        expecetdNode=new Node(1,expecetdNode);
        expecetdNode=new Node(2,expecetdNode);
        MinStack.push(1);
        MinStack.push(2);
        MinStack.push(3);
        MinStack.pop();
        assertEquals(expecetdNode,MinStack.getNodeStack());

    }

    @ParameterizedTest
    @CsvSource({"3"})
    void top(int expectedTop) {
        MinStack.push(1);
        MinStack.push(2);
        MinStack.push(3);
        var actual = MinStack.top();
        assertEquals(expectedTop,actual);

    }

    @ParameterizedTest
    @CsvSource({"1"})
    void getMin(int expectedMin) {
        MinStack.push(10);
        MinStack.push(2);
        MinStack.push(4);
        MinStack.push(1);
        MinStack.push(3);
        var actual = MinStack.getMin();
        assertEquals(expectedMin, actual);
    }


}

