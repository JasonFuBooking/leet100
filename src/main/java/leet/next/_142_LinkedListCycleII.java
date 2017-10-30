package leet.next;

import util.ListNode;

/**
 Given a linked list, return the node where the cycle begins. If there is no cycle, return null.

 Note: Do not modify the linked list.

 Follow up:
 Can you solve it without using extra space?
 */

/*
这道题用额外空间就非常简单。
主要是看看不用额外空间的解法，我觉得还是太有技巧性了，面试的可能性不大：
还是用fast, slow两个指针，第一次循环找到fast与slow的交点。
之后再设置一个指针node从head开始，和slow同步向后移动，他们的交点就是环的起点
 */
public class _142_LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (slow != null && fast!= null) {
            slow = slow.next;
            fast = fast.next;
            if (fast != null) {
                fast = fast.next;
            }
            if (fast == slow) break;
        }
        if (fast == null) return null;
        ListNode node = head;
        while (node != slow) {
            node = node.next;
            slow = slow.next;
        }
        return node;
    }
}