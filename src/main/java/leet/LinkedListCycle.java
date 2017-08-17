package leet;

import util.ListNode;

/*
Given a linked list, determine if it has a cycle in it.

Follow up:
Can you solve it without using extra space?
 */

/*
用了两个指针的方法，
一块一慢，如果如果有环的话，总有一天快节点的下一步会是慢节点。
可以分别拿奇数节点（3个的环）和偶数节点（2个组成的环）来验证
 */
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode slow = head;
        ListNode fast = head;
        while (slow != null && fast != null) {
            slow = slow.next;
            fast = fast.next;
            if (fast != null) fast = fast.next;
            if (fast != null && fast.next == slow) return true;
        }
        return false;
    }
}
