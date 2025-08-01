package com.geracode.javaupskillingroadmap.dojochallenge.reverselinkedlist;

import com.geracode.javaupskillingroadmap.dojochallenge.Utils.CodeException;
import java.util.Objects;

public class ReverseLinkedList {

    private ReverseLinkedList() {
    }

    public static LinkedListNode reverseLinkedListNode(LinkedListNode head) {
        if(Objects.isNull(head)) {
            throw new CodeException("The LinkedListNode is null");
        }
        LinkedListNode reverse = null;
        LinkedListNode current = head;
        LinkedListNode nextTemp;

        while (current != null) {
            nextTemp = current.next;
            current.next = reverse;
            reverse = current;
            current = nextTemp;
        }

        return reverse;
    }
}

