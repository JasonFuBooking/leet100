package leet.next;

import util.ListNode;

/**
 Write a program to find the node at which the intersection of two singly linked lists begins.


 For example, the following two linked lists:

 A:          a1 → a2
                     ↘
                     c1 → c2 → c3
                     ↗
 B:     b1 → b2 → b3
 begin to intersect at node c1.


 Notes:

     If the two linked lists have no intersection at all, return null.
     The linked lists must retain their original structure after the function returns.
     You may assume there are no cycles anywhere in the entire linked structure.
     Your code should preferably run in O(n) time and use only O(1) memory.

 Credits:
 Special thanks to @stellari for adding this problem and creating all test cases.
 */

/*
1. 计算两个链表的长度
2. 移动长的那个的head,让两个链表的剩余长度一致
3. 同时移动两个head，直到公共的那个节点

这里没有判断两个链表如果不相交的情况，
实际上在2之后，如果两个链表不相交，那么他们会同时移动到null
所以是没有问题的。

 */
public class _160_Intersection_of_Two_Linked_Lists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA = getLength(headA);
        int lengthB = getLength(headB);

        while (lengthA > lengthB) {
            headA = headA.next;
            --lengthA;
        }

        while (lengthB > lengthA) {
            headB = headB.next;
            --lengthB;
        }

        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;

        }
        return headA;
    }

    private int getLength(ListNode list) {
        ListNode head = list;
        int count = 0;
        while (head != null) {
            head = head.next;
            ++count;
        }
        return count;
    }
}
