package com.geracode.javaupskillingroadmap.dojochallenge.minstack;

import lombok.Data;

@Data
public class Node {
    public Node(int index, Node next) {
        this.value = index;
        this.next = next;
    }

    public Node() {
    }

    int value;
    Node next;
}
