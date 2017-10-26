package leet.next;

import util.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 Given a singly linked list, determine if it is a palindrome.

 Follow up:
 Could you do it in O(n) time and O(1) space?
 */

/*
问题很简单。主要是followup
可以使用两个指针，第一个指针移动到中间，第二个指针移动到尾部
然后翻转中间到尾部的链表
接着就可以开始同时从作边的头部，和翻转后的头部开始遍历，逐个比较，都相等即是对称的
 */
public class _234_Palindrome_Linked_List {
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int i = 0, j = list.size() - 1;
        boolean equal = true;
        while (i < j) {
            if (!list.get(i).equals(list.get(j))) {
                equal = false;
                break;
            }
            ++i;
            --j;
        }
        return equal;
    }
}