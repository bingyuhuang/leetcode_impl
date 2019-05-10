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

    /**
     * 题目描述思想：相当于两个栈的栈底开始相加
     * 解决：ListNode结构熟悉一下
     * 1.定义一个固定的头结点保存结果，使用当前节点的游标去计算
     * 2.循环两个Listnode，直到他们都为空
     * 3.循环中的操作：
     *      a.将两个当前节点和进位一起相加的
     *      b.值取10的余数为新节点的值
     *      c.值取10的除数为进位的值
     *      b.游标后移，两个ListNode后移
     * 4.循环结束：判断进位是否为0，不为零，新的节点的值为进位值
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNums(ListNode l1, ListNode l2) {
        // 设置结果ListNode-dummy
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        int carry = 0;
        // 循环
        while(l1 != null || l2 != null){
            // 获取两个相加的数，可能一个循环结果，则加数为0
            int d1 = l1 == null ? 0 : l1.val;
            int d2 = l2 ==null ? 0 : l2.val;
            int sum = d1 + d2 + carry;
            carry = sum / 10;
            cur.next = new ListNode(sum % 10);
            cur = cur.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }

        if (carry != 0) {
            cur.next = new ListNode(carry);
        }

        return dummy.next;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
    }
}
