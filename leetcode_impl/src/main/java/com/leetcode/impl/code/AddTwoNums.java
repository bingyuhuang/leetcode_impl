package com.leetcode.impl.code;

/**
 * @author huangbingyu
 * @description :
 *   Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 *   Output: 7 -> 0 -> 8
 *   Explanation: 342 + 465 = 807.
 * @date 2019/4/24
 */
public class AddTwoNums {

    public static ListNode addTwoNums(ListNode num1, ListNode num2) {

        return null;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(2);
        node1.next = new ListNode(3);
        node1.next.next = new ListNode(4);

        ListNode node2 = new ListNode(2);
        node2.next = new ListNode(3);
        node2.next.next = new ListNode(4);

        addTwoNums(node1, node2);
    }
}
