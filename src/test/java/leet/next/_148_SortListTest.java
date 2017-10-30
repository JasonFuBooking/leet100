package leet.next;

import org.junit.Test;
import util.ListNode;

import static org.junit.Assert.*;

/**
 * Created by jafu on 10/30/17.
 */
public class _148_SortListTest {
    @Test
    public void sortList() throws Exception {
        _148_SortList test = new _148_SortList();
        ListNode head = new ListNode(2);
        head.next = new ListNode(1);
        test.sortList(head);
    }

}