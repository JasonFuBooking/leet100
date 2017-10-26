package leet.next;

import org.junit.Test;
import util.ListNode;

import static org.junit.Assert.*;

/**
 * Created by jafu on 10/26/17.
 */
public class _234_Palindrome_Linked_ListTest {
    @Test
    public void isPalindrome() throws Exception {
        ListNode node = new ListNode(-129);
        node.next = new ListNode(-129);
        _234_Palindrome_Linked_List test = new _234_Palindrome_Linked_List();
        test.isPalindrome(node);
    }

}