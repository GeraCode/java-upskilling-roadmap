package com.geracode.javaupskillingroadmap.dojochallenge.addtwonumbers;

/**
 * Add Two Numbers Class
 */
public class AddTwoNumbers {

    private AddTwoNumbers() {
    }

    /**
     *  You are given two non-empty linked lists representing two non-negative integers.
     *  The digits are stored in reverse order, and each of their nodes contains a single digit.
     *  Add the two numbers and return the sum as a linked list.
     *  You may assume the two numbers do not contain any leading zero, except the number 0 itself.
     *
     *     2      --->     4                  ---> 3
     *     5      --->     6                  ---> 4
     *     ---------------------
     *     7      ---> 10 but is 8 and carry 1---> 8
     *     -------------------
     *     7 ---> 0 ---> 8

             Input: l1 = [2,4,3], l2 = [5,6,4]
             Output: [7,0,8]
             Explanation: 342 + 465 = 807.

             Example 2:
             Input: l1 = [0], l2 = [0]
             Output: [0]

             Example 3:
             Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
             Output: [8,9,9,9,0,0,0,1]
     *
             Input: l1 = [2,4,3], l2 = [5,6,4]
             Output: [7,0,8]
             Explanation: 342 + 465 = 807.

             Example 2:
             Input: l1 = [0], l2 = [0]
             Output: [0]

             Example 3:
             Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
             Output: [8,9,9,9,0,0,0,1]

     */
  public static ListNote addTwoNumbers(ListNote l1, ListNote l2) {
      ListNote resultListNode = new ListNote();
      ListNote tempListNode = resultListNode;
      int carry = 0;
      while (l1 != null || l2 != null || carry > 0) {
          int valorl1 = l1 != null ? l1.getVal() : 0;
          int valorl2 = l2 != null ? l2.getVal() : 0;
          int sum = valorl1 + valorl2 + carry;
          carry = sum / 10;
          sum = sum % 10;
          tempListNode.setNext(new ListNote(sum));
          l1 = l1 != null ? l1.getNext() : null;
          l2 = l2 != null ? l2.getNext() : null;
          tempListNode = tempListNode.getNext();
      }
      return resultListNode.getNext();
   }
}
