package com.geracode.javaupskillingroadmap.dojochallenge.minstack;

import lombok.Getter;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class MinStack {


    @Getter
    private  Node nodeStack;

    private  int minValue = Integer.MAX_VALUE;


    public  void pop() {
        nodeStack = nodeStack.next;
    }
    public  void push(int valor) {
        nodeStack = new Node(valor, nodeStack);
        minValue = Math.min(valor, minValue);
    }

    public  int top() {
        return nodeStack.value;
    }

    public  int getMin() {
        return minValue;
    }
}

