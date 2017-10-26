package leet.next;

import util.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 Given a singly linked list, determine if it is a palindrome.

 Follow up:
 Could you do it in O(n) time and O(1) space?


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