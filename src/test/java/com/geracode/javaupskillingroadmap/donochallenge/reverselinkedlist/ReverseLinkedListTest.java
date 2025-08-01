package com.geracode.javaupskillingroadmap.donochallenge.reverselinkedlist;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.geracode.javaupskillingroadmap.dojochallenge.reverselinkedlist.LinkedListNode;
import com.geracode.javaupskillingroadmap.dojochallenge.reverselinkedlist.ReverseLinkedList;
import com.geracode.javaupskillingroadmap.dojochallenge.Utils.CodeException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReverseLinkedListTest {

    private LinkedListNode linkedListNode;
    private LinkedListNode expectedLinkedListNode;

    @BeforeEach
    void setUp() {
        linkedListNode = new LinkedListNode(1);
        linkedListNode.setNext(new LinkedListNode(2));
        linkedListNode.getNext().setNext(new LinkedListNode(3));
        linkedListNode.getNext().getNext().setNext(new LinkedListNode(4));
        linkedListNode.getNext().getNext().getNext().setNext(  new LinkedListNode(5));



        expectedLinkedListNode = new LinkedListNode(5);
        expectedLinkedListNode.setNext(new LinkedListNode(4));
        expectedLinkedListNode.getNext().setNext(new LinkedListNode(3));
        expectedLinkedListNode.getNext().getNext().setNext(new LinkedListNode(2));
        expectedLinkedListNode.getNext().getNext().getNext().setNext(new LinkedListNode(1));


    }

    @Test
    void reverseLinkedListNode() {
      var actual= ReverseLinkedList.reverseLinkedListNode(linkedListNode);
      assertEquals(expectedLinkedListNode,actual);
    }

    @Test
    void countAndSay_n_lessThanZero() {
        var exception = assertThrows(CodeException.class, () -> ReverseLinkedList.reverseLinkedListNode(null));
        assertTrue(exception.getMessage().contains("The LinkedListNode is null"));
    }
}