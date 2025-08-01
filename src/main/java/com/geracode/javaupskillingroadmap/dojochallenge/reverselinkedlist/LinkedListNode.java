package com.geracode.javaupskillingroadmap.dojochallenge.reverselinkedlist;

import lombok.Data;

@Data
public class LinkedListNode {
    int valor;
    LinkedListNode next;

    public LinkedListNode(int valor) {
        this.valor = valor;
        this.next = null;
    }
}
